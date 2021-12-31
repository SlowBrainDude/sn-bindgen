# Native bindings generator for Scala 3

_Warning: this should not be considered as "working by design", it works purely
by accident. A lot more work to be done to publish it._

## what is it

If it has a gif, means it works.

<img align = "right" src="https://user-images.githubusercontent.com/1052965/147828796-e2fc0d53-7e00-403c-97bb-0c03f5e74586.gif" />

It's the following example running on an unchanged (it's still full of bugs, see TODO below) generated binding for https://www.raylib.com/

```scala
@main def hello_raylib =
  val screenWidth = 800
  val screenHeight = 450
  import libraylib.functions.*
  import libraylib.types.*

  InitWindow(
    screenWidth,
    screenHeight,
    c"hello raylib from Scala Native"
  )

  Zone { implicit z =>

    val WHITE = Color(255.toUByte, 255.toUByte, 255.toUByte, 255.toUByte)
    val RED = Color(255.toUByte, 0.toUByte, 0.toUByte, 255.toUByte)
    val BLACK = Color(0.toUByte, 0.toUByte, 0.toUByte, 255.toUByte)

    val ballPosition = Vector2(screenWidth / 2, screenHeight / 2)

    SetTargetFPS(120)

    var i = 0

    while WindowShouldClose() == 0 do

      !ballPosition = GetMousePosition()
      BeginDrawing()

      ClearBackground(!WHITE)
      DrawText(
        c"move ball with mouse",
        10,
        10,
        20,
        !BLACK
      )
      DrawCircleV(!ballPosition, 50, !RED)
      EndDrawing()
    end while
    CloseWindow()
  }
end hello_raylib
```


This project aims to provide a standalone CLI-based bindings generator, that
takes C header files, and uses
[libclang](https://clang.llvm.org/doxygen/group__CINDEX.html) to generate a
Scala 3-specific binding, using the following features:

- Opaque type aliases - exposing just the bare minimum of the type's API

- Extension methods - placed in the companion object of the opaque type, for
    fluid experience (minimal amount of imports)

- Generated `given Tag[...]` definitions - so that the opaque types behave as
    normal types Scala Native can recognise
- De-recurse structs - due to Scala limitation, type aliases cannot be
    recursive.
    
    We solve this by treating those references as `Ptr[Byte]` and changing the
    extension methods to provide a good developer UX

- Rewrite methods that pass/return structs directly (not by pointer) - it's not currently 
  supported by Scala Native, and as such we generate two methods:

  - A Scala method that takes the struct directly (and an implicit `Zone`) which
      does necessary allocations and invokes 
  - a generated C function that takes necessary arguments by name (not by value) and
      invokes the desired C function, and then `memcpy`s the result into the
      pointer provided by the scala native facade
  
  It's wasteful, but provides the necessary developer experience. In the future
  optimisations can be applied for simple structs that, say, fit into a single
  integer type and fields are just bitshifted smaller values.

## why is it

This project started as a horrible rabbithole, after I wanted to help get
[scala-native-bindgen](https://github.com/scala-native/scala-native-bindgen/)
ready for SN 0.4.x

Main goals of the project are:

- Scala 3 only (not a hill I will die on, but there already is a more mature
    project for Scala 2)

- Minimal amount of non-Scala code
  
  This is achieved by bootstrapping bindings to libclang's C APIs. My hope is
  that no C++ will be necessary to achieve the desired functionality, meaning
  more people from Scala community can contribute

## how is it

### Installation

- Make sure you have `llvm` installed - we will need both the sources and the
    dynamic library (`-lclang` should work)

- If you're not on Mac, modify `build.sbt` to provide correct lib path for `llvm` (will be sorted out when this is more ready to be used by other people)

- Run `sbt 'show bindgen/nativeLink'` - if it succeeds, it will show you the
    path to the single binary

### usage

For each header file, you will need to invoke 2 commands of the following shape:

```bash
$ bindgen-out <packageName> <cImports> <headerFile> <lang>
```

* `packageName` - Scala package where the binding will be generated (`package
    packageName`)

* `cImports` - list of imports (comma separated) to be placed at the top of generated `C` file 

* `headerFile` - path to the header file from which to generate bindings

* `lang` - either `scala` or `c`, depending on what part of the binding you need
    to generate. Some header files will produce no `C` code at all - lucky you!

**example**

```bash
$ export DEST=examples/src/main/
$ export BINDGEN=./bindgen/target/scala-3.1.0/bindgen-out
$ $BINDGEN libraylib raylib.h raylib raylib.h c > $DEST/resources/scala-native/libraylib.c
$ $BINDGEN libraylib raylib.h raylib raylib.h scala > $DEST/scala/bindings/libraylib.scala
```

In fact, these are the commands that will run when you do `sbt examples/regenerate`

You can see the rest of examples in the `examples` folder, with both bindings and usage

TODO:

- [ ] unnamed enums should be exported into the global scope (sokol for example)
- [x] regular typedef enums for some reason are interpreted as structs
      this is part of a larger problem in relying on typedefs at top level
- [ ] FileWriter for some reason truncates the output - SN issue
- [x] Fix recursive structs
- [x] implement unions (i.e. Nuklear depends on it)
- [ ] bool return types are not recognized correctly and are missing parameters
    in the AST
- [ ] implement CLang diagnostics API
- [ ] Generate a by-name Scala method for those calls that have to be done
    through a C proxy
