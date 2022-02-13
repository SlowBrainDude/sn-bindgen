package bindgen.interface

import java.io.File
import java.nio.file.Paths
import java.io.FileWriter
import scala.util.control.NonFatal
import scala.sys.process.ProcessLogger
import java.nio.file.Files
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.io.FileOutputStream
import java.io.Writer

sealed trait BindingLang extends Product with Serializable
object BindingLang {
  case object Scala extends BindingLang
  case object C extends BindingLang
}

sealed abstract class LogLevel(val str: String)
    extends Product
    with Serializable
object LogLevel {
  case object Trace extends LogLevel("trace")
  case object Info extends LogLevel("info")
  case object Warn extends LogLevel("warning")
  case object Error extends LogLevel("error")
}

import BindingLang.*
object Utils {
  private[interface] implicit class FileOps(val f: File) extends AnyVal {
    def /(other: String): File = {
      val result = Paths.get(f.toPath.toString, other).toFile
      Files.createDirectories(f.toPath())
      result
    }
  }
  private[interface] def fileWriter(destination: File)(f: Writer => Unit) = {
    var fw: Option[BufferedWriter] = None
    try {
      fw = Option(
        new BufferedWriter(
          new OutputStreamWriter(new FileOutputStream(destination))
        )
      )

      fw.foreach(f)
    } catch {
      case NonFatal(ex) => fw.foreach(_.close()); throw ex
    } finally {
      fw.foreach(_.close())
    }
  }
}

import Utils.*

class BindingBuilder(binary: File) {
  assert(
    Files.exists(binary.toPath),
    s"Bindgen: specified binary [$binary] doesn't exist!"
  )
  assert(
    Files.isRegularFile(binary.toPath),
    s"Bindgen: specified binary [$binary] is not a regular file!"
  )

  private val bindings = List.newBuilder[Binding]
  private var level: LogLevel = LogLevel.Info

  private case class Binding(
      headerFile: File,
      packageName: String,
      scalaFile: String,
      cFile: String,
      linkName: Option[String],
      cImports: List[String],
      clangFlags: List[String]
  ) {
    def toCommand(lang: BindingLang): List[String] = {
      val sb = List.newBuilder[String]

      def arg(name: String, value: String) =
        sb ++= Seq(s"--$name", value)

      def flag(name: String) =
        sb += s"--$name"

      arg(
        "header",
        headerFile.toPath().toAbsolutePath().toString
      )
      arg("package", packageName)
      linkName.foreach { link =>
        arg("link-name", link)
      }
      cImports.foreach { cimp =>
        arg("c-import", cimp)
      }
      clangFlags.foreach { clangFlag =>
        arg("clang", clangFlag)
      }
      flag(level.str)
      if (lang == BindingLang.Scala)
        flag("scala")
      else
        flag("c")

      sb.result()
    }
  }

  def define(
      headerFile: File,
      packageName: String,
      linkName: Option[String] = None,
      cImports: List[String] = Nil,
      clangFlags: List[String] = Nil
  ) = {
    bindings +=
      Binding(
        headerFile = headerFile,
        packageName = packageName,
        linkName = linkName,
        cFile = s"$packageName.c",
        scalaFile = s"$packageName.scala",
        cImports = cImports,
        clangFlags = clangFlags
      )

    this
  }

  def withLogLevel(level: LogLevel): BindingBuilder = {
    this.level = level
    this
  }

  def generate(to: File, lang: BindingLang): Seq[File] = {

    val files = Seq.newBuilder[File]

    bindings.result.foreach { binding =>
      import scala.sys.process.Process

      val destinationFilename = lang match {
        case Scala => binding.scalaFile
        case C     => binding.cFile
      }

      val destination = to / destinationFilename

      val cmd = binary.toString :: binding.toCommand(lang)

      fileWriter(destination) { wr =>
        val buf = List.newBuilder[String]
        val logger = ProcessLogger.apply(
          (o: String) => {
            buf += o
            wr.write(o + System.lineSeparator())
          },
          (e: String) => println(e)
        )

        val result = Process(cmd).run(logger).exitValue()

        if (result == 0) {
          System.out.println(
            s"Successfully regenerated binding ($lang) for ${binding.packageName}, $result"
          )

          files += destination
        } else {
          val code = destination.hashCode().toHexString.toUpperCase()
          System.err.println(
            s"(FAILED [$code]) Executing [${cmd.mkString(" ")}] writing to $destination"
          )

          buf.result().foreach { l =>
            System.err.println(s"/*$code*/  " + l + System.lineSeparator())
          }

          throw new Exception(
            s"Process [${cmd.mkString(" ")}] failed with code $result"
          )
        }
      }
    }
    files.result()
  }
}
