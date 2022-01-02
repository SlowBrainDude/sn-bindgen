package libnuklear

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scalanative.libc.*

object predef:  
  abstract class CEnum[T](using eq: T =:= Int):
    given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
    extension (t: T) def int: CInt = eq.apply(t)
  
  abstract class CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (t: T)
     def int: CInt = eq.apply(t).toInt
     def uint: CUnsignedInt = eq.apply(t)
      
object types:
  import predef.*
  opaque type nk_allocation_type = CUnsignedInt
  object nk_allocation_type extends CEnumU[nk_allocation_type]:
    inline def define(inline a: Long): nk_allocation_type = a.toUInt
    val NK_BUFFER_FIXED = define(0)
    val NK_BUFFER_DYNAMIC = define(1)

  opaque type nk_anti_aliasing = CUnsignedInt
  object nk_anti_aliasing extends CEnumU[nk_anti_aliasing]:
    inline def define(inline a: Long): nk_anti_aliasing = a.toUInt
    val NK_ANTI_ALIASING_OFF = define(0)
    val NK_ANTI_ALIASING_ON = define(1)

  opaque type nk_buffer_allocation_type = CUnsignedInt
  object nk_buffer_allocation_type extends CEnumU[nk_buffer_allocation_type]:
    inline def define(inline a: Long): nk_buffer_allocation_type = a.toUInt
    val NK_BUFFER_FRONT = define(0)
    val NK_BUFFER_BACK = define(1)
    val NK_BUFFER_MAX = define(2)

  opaque type nk_button_behavior = CUnsignedInt
  object nk_button_behavior extends CEnumU[nk_button_behavior]:
    inline def define(inline a: Long): nk_button_behavior = a.toUInt
    val NK_BUTTON_DEFAULT = define(0)
    val NK_BUTTON_REPEATER = define(1)

  opaque type nk_buttons = CUnsignedInt
  object nk_buttons extends CEnumU[nk_buttons]:
    inline def define(inline a: Long): nk_buttons = a.toUInt
    val NK_BUTTON_LEFT = define(0)
    val NK_BUTTON_MIDDLE = define(1)
    val NK_BUTTON_RIGHT = define(2)
    val NK_BUTTON_DOUBLE = define(3)
    val NK_BUTTON_MAX = define(4)

  opaque type nk_chart_event = CUnsignedInt
  object nk_chart_event extends CEnumU[nk_chart_event]:
    inline def define(inline a: Long): nk_chart_event = a.toUInt
    val NK_CHART_HOVERING = define(1)
    val NK_CHART_CLICKED = define(2)

  opaque type nk_chart_type = CUnsignedInt
  object nk_chart_type extends CEnumU[nk_chart_type]:
    inline def define(inline a: Long): nk_chart_type = a.toUInt
    val NK_CHART_LINES = define(0)
    val NK_CHART_COLUMN = define(1)
    val NK_CHART_MAX = define(2)

  opaque type nk_collapse_states = CUnsignedInt
  object nk_collapse_states extends CEnumU[nk_collapse_states]:
    inline def define(inline a: Long): nk_collapse_states = a.toUInt
    val NK_MINIMIZED = define(0)
    val NK_MAXIMIZED = define(1)

  opaque type nk_color_format = CUnsignedInt
  object nk_color_format extends CEnumU[nk_color_format]:
    inline def define(inline a: Long): nk_color_format = a.toUInt
    val NK_RGB = define(0)
    val NK_RGBA = define(1)

  opaque type nk_command_clipping = CUnsignedInt
  object nk_command_clipping extends CEnumU[nk_command_clipping]:
    inline def define(inline a: Long): nk_command_clipping = a.toUInt
    val NK_CLIPPING_OFF = define(0)
    val NK_CLIPPING_ON = define(1)

  opaque type nk_command_type = CUnsignedInt
  object nk_command_type extends CEnumU[nk_command_type]:
    inline def define(inline a: Long): nk_command_type = a.toUInt
    val NK_COMMAND_NOP = define(0)
    val NK_COMMAND_SCISSOR = define(1)
    val NK_COMMAND_LINE = define(2)
    val NK_COMMAND_CURVE = define(3)
    val NK_COMMAND_RECT = define(4)
    val NK_COMMAND_RECT_FILLED = define(5)
    val NK_COMMAND_RECT_MULTI_COLOR = define(6)
    val NK_COMMAND_CIRCLE = define(7)
    val NK_COMMAND_CIRCLE_FILLED = define(8)
    val NK_COMMAND_ARC = define(9)
    val NK_COMMAND_ARC_FILLED = define(10)
    val NK_COMMAND_TRIANGLE = define(11)
    val NK_COMMAND_TRIANGLE_FILLED = define(12)
    val NK_COMMAND_POLYGON = define(13)
    val NK_COMMAND_POLYGON_FILLED = define(14)
    val NK_COMMAND_POLYLINE = define(15)
    val NK_COMMAND_TEXT = define(16)
    val NK_COMMAND_IMAGE = define(17)
    val NK_COMMAND_CUSTOM = define(18)

  opaque type nk_convert_result = CUnsignedInt
  object nk_convert_result extends CEnumU[nk_convert_result]:
    inline def define(inline a: Long): nk_convert_result = a.toUInt
    val NK_CONVERT_SUCCESS = define(0)
    val NK_CONVERT_INVALID_PARAM = define(1)
    val NK_CONVERT_COMMAND_BUFFER_FULL = define(2)
    val NK_CONVERT_VERTEX_BUFFER_FULL = define(4)
    val NK_CONVERT_ELEMENT_BUFFER_FULL = define(8)

  opaque type nk_edit_events = CUnsignedInt
  object nk_edit_events extends CEnumU[nk_edit_events]:
    inline def define(inline a: Long): nk_edit_events = a.toUInt
    val NK_EDIT_ACTIVE = define(1)
    val NK_EDIT_INACTIVE = define(2)
    val NK_EDIT_ACTIVATED = define(4)
    val NK_EDIT_DEACTIVATED = define(8)
    val NK_EDIT_COMMITED = define(16)

  opaque type nk_edit_flags = CUnsignedInt
  object nk_edit_flags extends CEnumU[nk_edit_flags]:
    inline def define(inline a: Long): nk_edit_flags = a.toUInt
    val NK_EDIT_DEFAULT = define(0)
    val NK_EDIT_READ_ONLY = define(1)
    val NK_EDIT_AUTO_SELECT = define(2)
    val NK_EDIT_SIG_ENTER = define(4)
    val NK_EDIT_ALLOW_TAB = define(8)
    val NK_EDIT_NO_CURSOR = define(16)
    val NK_EDIT_SELECTABLE = define(32)
    val NK_EDIT_CLIPBOARD = define(64)
    val NK_EDIT_CTRL_ENTER_NEWLINE = define(128)
    val NK_EDIT_NO_HORIZONTAL_SCROLL = define(256)
    val NK_EDIT_ALWAYS_INSERT_MODE = define(512)
    val NK_EDIT_MULTILINE = define(1024)
    val NK_EDIT_GOTO_END_ON_ACTIVATE = define(2048)

  opaque type nk_edit_types = CUnsignedInt
  object nk_edit_types extends CEnumU[nk_edit_types]:
    inline def define(inline a: Long): nk_edit_types = a.toUInt
    val NK_EDIT_SIMPLE = define(512)
    val NK_EDIT_FIELD = define(608)
    val NK_EDIT_BOX = define(1640)
    val NK_EDIT_EDITOR = define(1128)

  opaque type nk_heading = CUnsignedInt
  object nk_heading extends CEnumU[nk_heading]:
    inline def define(inline a: Long): nk_heading = a.toUInt
    val NK_UP = define(0)
    val NK_RIGHT = define(1)
    val NK_DOWN = define(2)
    val NK_LEFT = define(3)

  opaque type nk_keys = CUnsignedInt
  object nk_keys extends CEnumU[nk_keys]:
    inline def define(inline a: Long): nk_keys = a.toUInt
    val NK_KEY_NONE = define(0)
    val NK_KEY_SHIFT = define(1)
    val NK_KEY_CTRL = define(2)
    val NK_KEY_DEL = define(3)
    val NK_KEY_ENTER = define(4)
    val NK_KEY_TAB = define(5)
    val NK_KEY_BACKSPACE = define(6)
    val NK_KEY_COPY = define(7)
    val NK_KEY_CUT = define(8)
    val NK_KEY_PASTE = define(9)
    val NK_KEY_UP = define(10)
    val NK_KEY_DOWN = define(11)
    val NK_KEY_LEFT = define(12)
    val NK_KEY_RIGHT = define(13)
    val NK_KEY_TEXT_INSERT_MODE = define(14)
    val NK_KEY_TEXT_REPLACE_MODE = define(15)
    val NK_KEY_TEXT_RESET_MODE = define(16)
    val NK_KEY_TEXT_LINE_START = define(17)
    val NK_KEY_TEXT_LINE_END = define(18)
    val NK_KEY_TEXT_START = define(19)
    val NK_KEY_TEXT_END = define(20)
    val NK_KEY_TEXT_UNDO = define(21)
    val NK_KEY_TEXT_REDO = define(22)
    val NK_KEY_TEXT_SELECT_ALL = define(23)
    val NK_KEY_TEXT_WORD_LEFT = define(24)
    val NK_KEY_TEXT_WORD_RIGHT = define(25)
    val NK_KEY_SCROLL_START = define(26)
    val NK_KEY_SCROLL_END = define(27)
    val NK_KEY_SCROLL_DOWN = define(28)
    val NK_KEY_SCROLL_UP = define(29)
    val NK_KEY_MAX = define(30)

  opaque type nk_layout_format = CUnsignedInt
  object nk_layout_format extends CEnumU[nk_layout_format]:
    inline def define(inline a: Long): nk_layout_format = a.toUInt
    val NK_DYNAMIC = define(0)
    val NK_STATIC = define(1)

  opaque type nk_modify = CUnsignedInt
  object nk_modify extends CEnumU[nk_modify]:
    inline def define(inline a: Long): nk_modify = a.toUInt
    val NK_FIXED = define(0)
    val NK_MODIFIABLE = define(1)

  opaque type nk_orientation = CUnsignedInt
  object nk_orientation extends CEnumU[nk_orientation]:
    inline def define(inline a: Long): nk_orientation = a.toUInt
    val NK_VERTICAL = define(0)
    val NK_HORIZONTAL = define(1)

  opaque type nk_panel_flags = CUnsignedInt
  object nk_panel_flags extends CEnumU[nk_panel_flags]:
    inline def define(inline a: Long): nk_panel_flags = a.toUInt
    val NK_WINDOW_BORDER = define(1)
    val NK_WINDOW_MOVABLE = define(2)
    val NK_WINDOW_SCALABLE = define(4)
    val NK_WINDOW_CLOSABLE = define(8)
    val NK_WINDOW_MINIMIZABLE = define(16)
    val NK_WINDOW_NO_SCROLLBAR = define(32)
    val NK_WINDOW_TITLE = define(64)
    val NK_WINDOW_SCROLL_AUTO_HIDE = define(128)
    val NK_WINDOW_BACKGROUND = define(256)
    val NK_WINDOW_SCALE_LEFT = define(512)
    val NK_WINDOW_NO_INPUT = define(1024)

  opaque type nk_panel_row_layout_type = CUnsignedInt
  object nk_panel_row_layout_type extends CEnumU[nk_panel_row_layout_type]:
    inline def define(inline a: Long): nk_panel_row_layout_type = a.toUInt
    val NK_LAYOUT_DYNAMIC_FIXED = define(0)
    val NK_LAYOUT_DYNAMIC_ROW = define(1)
    val NK_LAYOUT_DYNAMIC_FREE = define(2)
    val NK_LAYOUT_DYNAMIC = define(3)
    val NK_LAYOUT_STATIC_FIXED = define(4)
    val NK_LAYOUT_STATIC_ROW = define(5)
    val NK_LAYOUT_STATIC_FREE = define(6)
    val NK_LAYOUT_STATIC = define(7)
    val NK_LAYOUT_TEMPLATE = define(8)
    val NK_LAYOUT_COUNT = define(9)

  opaque type nk_panel_set = CUnsignedInt
  object nk_panel_set extends CEnumU[nk_panel_set]:
    inline def define(inline a: Long): nk_panel_set = a.toUInt
    val NK_PANEL_SET_NONBLOCK = define(240)
    val NK_PANEL_SET_POPUP = define(244)
    val NK_PANEL_SET_SUB = define(246)

  opaque type nk_panel_type = CUnsignedInt
  object nk_panel_type extends CEnumU[nk_panel_type]:
    inline def define(inline a: Long): nk_panel_type = a.toUInt
    val NK_PANEL_NONE = define(0)
    val NK_PANEL_WINDOW = define(1)
    val NK_PANEL_GROUP = define(2)
    val NK_PANEL_POPUP = define(4)
    val NK_PANEL_CONTEXTUAL = define(16)
    val NK_PANEL_COMBO = define(32)
    val NK_PANEL_MENU = define(64)
    val NK_PANEL_TOOLTIP = define(128)

  opaque type nk_popup_type = CUnsignedInt
  object nk_popup_type extends CEnumU[nk_popup_type]:
    inline def define(inline a: Long): nk_popup_type = a.toUInt
    val NK_POPUP_STATIC = define(0)
    val NK_POPUP_DYNAMIC = define(1)

  opaque type nk_show_states = CUnsignedInt
  object nk_show_states extends CEnumU[nk_show_states]:
    inline def define(inline a: Long): nk_show_states = a.toUInt
    val NK_HIDDEN = define(0)
    val NK_SHOWN = define(1)

  opaque type nk_style_colors = CUnsignedInt
  object nk_style_colors extends CEnumU[nk_style_colors]:
    inline def define(inline a: Long): nk_style_colors = a.toUInt
    val NK_COLOR_TEXT = define(0)
    val NK_COLOR_WINDOW = define(1)
    val NK_COLOR_HEADER = define(2)
    val NK_COLOR_BORDER = define(3)
    val NK_COLOR_BUTTON = define(4)
    val NK_COLOR_BUTTON_HOVER = define(5)
    val NK_COLOR_BUTTON_ACTIVE = define(6)
    val NK_COLOR_TOGGLE = define(7)
    val NK_COLOR_TOGGLE_HOVER = define(8)
    val NK_COLOR_TOGGLE_CURSOR = define(9)
    val NK_COLOR_SELECT = define(10)
    val NK_COLOR_SELECT_ACTIVE = define(11)
    val NK_COLOR_SLIDER = define(12)
    val NK_COLOR_SLIDER_CURSOR = define(13)
    val NK_COLOR_SLIDER_CURSOR_HOVER = define(14)
    val NK_COLOR_SLIDER_CURSOR_ACTIVE = define(15)
    val NK_COLOR_PROPERTY = define(16)
    val NK_COLOR_EDIT = define(17)
    val NK_COLOR_EDIT_CURSOR = define(18)
    val NK_COLOR_COMBO = define(19)
    val NK_COLOR_CHART = define(20)
    val NK_COLOR_CHART_COLOR = define(21)
    val NK_COLOR_CHART_COLOR_HIGHLIGHT = define(22)
    val NK_COLOR_SCROLLBAR = define(23)
    val NK_COLOR_SCROLLBAR_CURSOR = define(24)
    val NK_COLOR_SCROLLBAR_CURSOR_HOVER = define(25)
    val NK_COLOR_SCROLLBAR_CURSOR_ACTIVE = define(26)
    val NK_COLOR_TAB_HEADER = define(27)
    val NK_COLOR_COUNT = define(28)

  opaque type nk_style_cursor = CUnsignedInt
  object nk_style_cursor extends CEnumU[nk_style_cursor]:
    inline def define(inline a: Long): nk_style_cursor = a.toUInt
    val NK_CURSOR_ARROW = define(0)
    val NK_CURSOR_TEXT = define(1)
    val NK_CURSOR_MOVE = define(2)
    val NK_CURSOR_RESIZE_VERTICAL = define(3)
    val NK_CURSOR_RESIZE_HORIZONTAL = define(4)
    val NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT = define(5)
    val NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT = define(6)
    val NK_CURSOR_COUNT = define(7)

  opaque type nk_style_header_align = CUnsignedInt
  object nk_style_header_align extends CEnumU[nk_style_header_align]:
    inline def define(inline a: Long): nk_style_header_align = a.toUInt
    val NK_HEADER_LEFT = define(0)
    val NK_HEADER_RIGHT = define(1)

  opaque type nk_style_item_type = CUnsignedInt
  object nk_style_item_type extends CEnumU[nk_style_item_type]:
    inline def define(inline a: Long): nk_style_item_type = a.toUInt
    val NK_STYLE_ITEM_COLOR = define(0)
    val NK_STYLE_ITEM_IMAGE = define(1)
    val NK_STYLE_ITEM_NINE_SLICE = define(2)

  opaque type nk_symbol_type = CUnsignedInt
  object nk_symbol_type extends CEnumU[nk_symbol_type]:
    inline def define(inline a: Long): nk_symbol_type = a.toUInt
    val NK_SYMBOL_NONE = define(0)
    val NK_SYMBOL_X = define(1)
    val NK_SYMBOL_UNDERSCORE = define(2)
    val NK_SYMBOL_CIRCLE_SOLID = define(3)
    val NK_SYMBOL_CIRCLE_OUTLINE = define(4)
    val NK_SYMBOL_RECT_SOLID = define(5)
    val NK_SYMBOL_RECT_OUTLINE = define(6)
    val NK_SYMBOL_TRIANGLE_UP = define(7)
    val NK_SYMBOL_TRIANGLE_DOWN = define(8)
    val NK_SYMBOL_TRIANGLE_LEFT = define(9)
    val NK_SYMBOL_TRIANGLE_RIGHT = define(10)
    val NK_SYMBOL_PLUS = define(11)
    val NK_SYMBOL_MINUS = define(12)
    val NK_SYMBOL_MAX = define(13)

  opaque type nk_text_align = CUnsignedInt
  object nk_text_align extends CEnumU[nk_text_align]:
    inline def define(inline a: Long): nk_text_align = a.toUInt
    val NK_TEXT_ALIGN_LEFT = define(1)
    val NK_TEXT_ALIGN_CENTERED = define(2)
    val NK_TEXT_ALIGN_RIGHT = define(4)
    val NK_TEXT_ALIGN_TOP = define(8)
    val NK_TEXT_ALIGN_MIDDLE = define(16)
    val NK_TEXT_ALIGN_BOTTOM = define(32)

  opaque type nk_text_alignment = CUnsignedInt
  object nk_text_alignment extends CEnumU[nk_text_alignment]:
    inline def define(inline a: Long): nk_text_alignment = a.toUInt
    val NK_TEXT_LEFT = define(17)
    val NK_TEXT_CENTERED = define(18)
    val NK_TEXT_RIGHT = define(20)

  opaque type nk_text_edit_mode = CUnsignedInt
  object nk_text_edit_mode extends CEnumU[nk_text_edit_mode]:
    inline def define(inline a: Long): nk_text_edit_mode = a.toUInt
    val NK_TEXT_EDIT_MODE_VIEW = define(0)
    val NK_TEXT_EDIT_MODE_INSERT = define(1)
    val NK_TEXT_EDIT_MODE_REPLACE = define(2)

  opaque type nk_text_edit_type = CUnsignedInt
  object nk_text_edit_type extends CEnumU[nk_text_edit_type]:
    inline def define(inline a: Long): nk_text_edit_type = a.toUInt
    val NK_TEXT_EDIT_SINGLE_LINE = define(0)
    val NK_TEXT_EDIT_MULTI_LINE = define(1)

  opaque type nk_tree_type = CUnsignedInt
  object nk_tree_type extends CEnumU[nk_tree_type]:
    inline def define(inline a: Long): nk_tree_type = a.toUInt
    val NK_TREE_NODE = define(0)
    val NK_TREE_TAB = define(1)

  opaque type nk_widget_layout_states = CUnsignedInt
  object nk_widget_layout_states extends CEnumU[nk_widget_layout_states]:
    inline def define(inline a: Long): nk_widget_layout_states = a.toUInt
    val NK_WIDGET_INVALID = define(0)
    val NK_WIDGET_VALID = define(1)
    val NK_WIDGET_ROM = define(2)

  opaque type nk_widget_states = CUnsignedInt
  object nk_widget_states extends CEnumU[nk_widget_states]:
    inline def define(inline a: Long): nk_widget_states = a.toUInt
    val NK_WIDGET_STATE_MODIFIED = define(2)
    val NK_WIDGET_STATE_INACTIVE = define(4)
    val NK_WIDGET_STATE_ENTERED = define(8)
    val NK_WIDGET_STATE_HOVER = define(16)
    val NK_WIDGET_STATE_ACTIVED = define(32)
    val NK_WIDGET_STATE_LEFT = define(64)
    val NK_WIDGET_STATE_HOVERED = define(18)
    val NK_WIDGET_STATE_ACTIVE = define(34)

  opaque type nk_window_flags = CUnsignedInt
  object nk_window_flags extends CEnumU[nk_window_flags]:
    inline def define(inline a: Long): nk_window_flags = a.toUInt
    val NK_WINDOW_PRIVATE = define(2048)
    val NK_WINDOW_DYNAMIC = define(2048)
    val NK_WINDOW_ROM = define(4096)
    val NK_WINDOW_NOT_INTERACTIVE = define(5120)
    val NK_WINDOW_HIDDEN = define(8192)
    val NK_WINDOW_CLOSED = define(16384)
    val NK_WINDOW_MINIMIZED = define(32768)
    val NK_WINDOW_REMOVE_ROM = define(65536)

  opaque type __builtin_va_list = CString
  object __builtin_va_list: 
    given _tag: Tag[__builtin_va_list] = Tag.Ptr[CChar](Tag.Byte)
    inline def apply(inline o: CString): __builtin_va_list = o

  opaque type _dummy_array428 = CArray[CChar, Nat._1]
  object _dummy_array428: 
    given _tag: Tag[_dummy_array428] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array428 = o

  opaque type _dummy_array429 = CArray[CChar, Nat._1]
  object _dummy_array429: 
    given _tag: Tag[_dummy_array429] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array429 = o

  opaque type _dummy_array430 = CArray[CChar, Nat._1]
  object _dummy_array430: 
    given _tag: Tag[_dummy_array430] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array430 = o

  opaque type _dummy_array431 = CArray[CChar, Nat._1]
  object _dummy_array431: 
    given _tag: Tag[_dummy_array431] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array431 = o

  opaque type _dummy_array432 = CArray[CChar, Nat._1]
  object _dummy_array432: 
    given _tag: Tag[_dummy_array432] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array432 = o

  opaque type _dummy_array433 = CArray[CChar, Nat._1]
  object _dummy_array433: 
    given _tag: Tag[_dummy_array433] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array433 = o

  opaque type _dummy_array434 = CArray[CChar, Nat._1]
  object _dummy_array434: 
    given _tag: Tag[_dummy_array434] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array434 = o

  opaque type _dummy_array435 = CInt
  object _dummy_array435: 
    given _tag: Tag[_dummy_array435] = Tag.Int
    inline def apply(inline o: CInt): _dummy_array435 = o

  opaque type _dummy_array436 = CInt
  object _dummy_array436: 
    given _tag: Tag[_dummy_array436] = Tag.Int
    inline def apply(inline o: CInt): _dummy_array436 = o

  opaque type _dummy_array440 = CArray[CChar, Nat._1]
  object _dummy_array440: 
    given _tag: Tag[_dummy_array440] = Tag.CArray[CChar, Nat._1](Tag.Byte, Tag.Nat1)
    inline def apply(inline o: CArray[CChar, Nat._1]): _dummy_array440 = o

  opaque type nk_bool = CInt
  object nk_bool: 
    given _tag: Tag[nk_bool] = Tag.Int
    inline def apply(inline o: CInt): nk_bool = o

  opaque type nk_byte = CUnsignedChar
  object nk_byte: 
    given _tag: Tag[nk_byte] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): nk_byte = o

  opaque type nk_char = CChar
  object nk_char: 
    given _tag: Tag[nk_char] = Tag.Byte
    inline def apply(inline o: CChar): nk_char = o

  opaque type nk_command_custom_callback = Ptr[CFuncPtr6[Ptr[Byte], CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, Unit]]
  object nk_command_custom_callback: 
    given _tag: Tag[nk_command_custom_callback] = Tag.Ptr[CFuncPtr6[Ptr[Byte], CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, Unit]](Tag.materializeCFuncPtr6[Ptr[Byte], CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, Unit])
    inline def apply(inline o: Ptr[CFuncPtr6[Ptr[Byte], CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, Unit]]): nk_command_custom_callback = o

  type nk_flags = nk_uint
  object nk_flags: 
    given _tag: Tag[nk_flags] = nk_uint._tag

  opaque type nk_glyph = CArray[CChar, Nat._4]
  object nk_glyph: 
    given _tag: Tag[nk_glyph] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
    inline def apply(inline o: CArray[CChar, Nat._4]): nk_glyph = o

  type nk_hash = nk_uint
  object nk_hash: 
    given _tag: Tag[nk_hash] = nk_uint._tag

  opaque type nk_int = CInt
  object nk_int: 
    given _tag: Tag[nk_int] = Tag.Int
    inline def apply(inline o: CInt): nk_int = o

  opaque type nk_plugin_alloc = Ptr[CFuncPtr3[nk_handle, Ptr[Byte], nk_size, Ptr[Byte]]]
  object nk_plugin_alloc: 
    given _tag: Tag[nk_plugin_alloc] = Tag.Ptr[CFuncPtr3[nk_handle, Ptr[Byte], nk_size, Ptr[Byte]]](Tag.materializeCFuncPtr3[nk_handle, Ptr[Byte], nk_size, Ptr[Byte]])
    inline def apply(inline o: Ptr[CFuncPtr3[nk_handle, Ptr[Byte], nk_size, Ptr[Byte]]]): nk_plugin_alloc = o

  opaque type nk_plugin_copy = Ptr[CFuncPtr3[nk_handle, CString, CInt, Unit]]
  object nk_plugin_copy: 
    given _tag: Tag[nk_plugin_copy] = Tag.Ptr[CFuncPtr3[nk_handle, CString, CInt, Unit]](Tag.materializeCFuncPtr3[nk_handle, CString, CInt, Unit])
    inline def apply(inline o: Ptr[CFuncPtr3[nk_handle, CString, CInt, Unit]]): nk_plugin_copy = o

  opaque type nk_plugin_filter = Ptr[CFuncPtr2[Ptr[nk_text_edit], nk_rune, nk_bool]]
  object nk_plugin_filter: 
    given _tag: Tag[nk_plugin_filter] = Tag.Ptr[CFuncPtr2[Ptr[nk_text_edit], nk_rune, nk_bool]](Tag.materializeCFuncPtr2[Ptr[nk_text_edit], nk_rune, nk_bool])
    inline def apply(inline o: Ptr[CFuncPtr2[Ptr[nk_text_edit], nk_rune, nk_bool]]): nk_plugin_filter = o

  opaque type nk_plugin_free = Ptr[CFuncPtr2[nk_handle, Ptr[Byte], Unit]]
  object nk_plugin_free: 
    given _tag: Tag[nk_plugin_free] = Tag.Ptr[CFuncPtr2[nk_handle, Ptr[Byte], Unit]](Tag.materializeCFuncPtr2[nk_handle, Ptr[Byte], Unit])
    inline def apply(inline o: Ptr[CFuncPtr2[nk_handle, Ptr[Byte], Unit]]): nk_plugin_free = o

  opaque type nk_plugin_paste = Ptr[CFuncPtr2[nk_handle, Ptr[nk_text_edit], Unit]]
  object nk_plugin_paste: 
    given _tag: Tag[nk_plugin_paste] = Tag.Ptr[CFuncPtr2[nk_handle, Ptr[nk_text_edit], Unit]](Tag.materializeCFuncPtr2[nk_handle, Ptr[nk_text_edit], Unit])
    inline def apply(inline o: Ptr[CFuncPtr2[nk_handle, Ptr[nk_text_edit], Unit]]): nk_plugin_paste = o

  opaque type nk_ptr = CUnsignedInt
  object nk_ptr: 
    given _tag: Tag[nk_ptr] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): nk_ptr = o

  opaque type nk_query_font_glyph_f = Ptr[CFuncPtr5[nk_handle, Float, Ptr[nk_user_font_glyph], nk_rune, nk_rune, Unit]]
  object nk_query_font_glyph_f: 
    given _tag: Tag[nk_query_font_glyph_f] = Tag.Ptr[CFuncPtr5[nk_handle, Float, Ptr[nk_user_font_glyph], nk_rune, nk_rune, Unit]](Tag.materializeCFuncPtr5[nk_handle, Float, Ptr[nk_user_font_glyph], nk_rune, nk_rune, Unit])
    inline def apply(inline o: Ptr[CFuncPtr5[nk_handle, Float, Ptr[nk_user_font_glyph], nk_rune, nk_rune, Unit]]): nk_query_font_glyph_f = o

  type nk_rune = nk_uint
  object nk_rune: 
    given _tag: Tag[nk_rune] = nk_uint._tag

  opaque type nk_short = CShort
  object nk_short: 
    given _tag: Tag[nk_short] = Tag.Short
    inline def apply(inline o: CShort): nk_short = o

  opaque type nk_size = CUnsignedInt
  object nk_size: 
    given _tag: Tag[nk_size] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): nk_size = o

  opaque type nk_text_width_f = Ptr[CFuncPtr4[nk_handle, Float, CString, CInt, Float]]
  object nk_text_width_f: 
    given _tag: Tag[nk_text_width_f] = Tag.Ptr[CFuncPtr4[nk_handle, Float, CString, CInt, Float]](Tag.materializeCFuncPtr4[nk_handle, Float, CString, CInt, Float])
    inline def apply(inline o: Ptr[CFuncPtr4[nk_handle, Float, CString, CInt, Float]]): nk_text_width_f = o

  opaque type nk_uchar = CUnsignedChar
  object nk_uchar: 
    given _tag: Tag[nk_uchar] = Tag.UByte
    inline def apply(inline o: CUnsignedChar): nk_uchar = o

  opaque type nk_uint = CUnsignedInt
  object nk_uint: 
    given _tag: Tag[nk_uint] = Tag.UInt
    inline def apply(inline o: CUnsignedInt): nk_uint = o

  opaque type nk_ushort = CUnsignedShort
  object nk_ushort: 
    given _tag: Tag[nk_ushort] = Tag.UShort
    inline def apply(inline o: CUnsignedShort): nk_ushort = o
  opaque type nk_allocator = CStruct0
  object nk_allocator:
    given _tag: Tag[nk_allocator] = Tag.materializeCStruct0Tag

  opaque type nk_buffer = CStruct0
  object nk_buffer:
    given _tag: Tag[nk_buffer] = Tag.materializeCStruct0Tag

  opaque type nk_buffer_marker = CStruct2[nk_bool, nk_size]
  object nk_buffer_marker:
    given _tag: Tag[nk_buffer_marker] = Tag.materializeCStruct2Tag[nk_bool, nk_size]
    def apply()(using Zone): Ptr[nk_buffer_marker] = scala.scalanative.unsafe.alloc[nk_buffer_marker](1)
    def apply(active: nk_bool, offset: nk_size)(using Zone): Ptr[nk_buffer_marker] = 
      val ____ptr = apply()
      (!____ptr).active = active
      (!____ptr).offset = offset
      ____ptr
    extension (struct: nk_buffer_marker)
      def active: nk_bool = struct._1
      def active_=(value: nk_bool): Unit = !struct.at1 = value
      def offset: nk_size = struct._2
      def offset_=(value: nk_size): Unit = !struct.at2 = value

  opaque type nk_chart = CStruct6[CInt, Float, Float, Float, Float, CArray[nk_chart_slot, Nat._4]]
  object nk_chart:
    given _tag: Tag[nk_chart] = Tag.materializeCStruct6Tag[CInt, Float, Float, Float, Float, CArray[nk_chart_slot, Nat._4]]
    def apply()(using Zone): Ptr[nk_chart] = scala.scalanative.unsafe.alloc[nk_chart](1)
    def apply(slot: CInt, x: Float, y: Float, w: Float, h: Float, slots: CArray[nk_chart_slot, Nat._4])(using Zone): Ptr[nk_chart] = 
      val ____ptr = apply()
      (!____ptr).slot = slot
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).slots = slots
      ____ptr
    extension (struct: nk_chart)
      def slot: CInt = struct._1
      def slot_=(value: CInt): Unit = !struct.at1 = value
      def x: Float = struct._2
      def x_=(value: Float): Unit = !struct.at2 = value
      def y: Float = struct._3
      def y_=(value: Float): Unit = !struct.at3 = value
      def w: Float = struct._4
      def w_=(value: Float): Unit = !struct.at4 = value
      def h: Float = struct._5
      def h_=(value: Float): Unit = !struct.at5 = value
      def slots: CArray[nk_chart_slot, Nat._4] = struct._6
      def slots_=(value: CArray[nk_chart_slot, Nat._4]): Unit = !struct.at6 = value

  opaque type nk_chart_slot = CStruct9[nk_chart_type, nk_color, nk_color, Float, Float, Float, CInt, nk_vec2, CInt]
  object nk_chart_slot:
    given _tag: Tag[nk_chart_slot] = Tag.materializeCStruct9Tag[nk_chart_type, nk_color, nk_color, Float, Float, Float, CInt, nk_vec2, CInt]
    def apply()(using Zone): Ptr[nk_chart_slot] = scala.scalanative.unsafe.alloc[nk_chart_slot](1)
    def apply(`type`: nk_chart_type, color: nk_color, highlight: nk_color, min: Float, max: Float, range: Float, count: CInt, last: nk_vec2, index: CInt)(using Zone): Ptr[nk_chart_slot] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).color = color
      (!____ptr).highlight = highlight
      (!____ptr).min = min
      (!____ptr).max = max
      (!____ptr).range = range
      (!____ptr).count = count
      (!____ptr).last = last
      (!____ptr).index = index
      ____ptr
    extension (struct: nk_chart_slot)
      def `type`: nk_chart_type = struct._1
      def type_=(value: nk_chart_type): Unit = !struct.at1 = value
      def color: nk_color = struct._2
      def color_=(value: nk_color): Unit = !struct.at2 = value
      def highlight: nk_color = struct._3
      def highlight_=(value: nk_color): Unit = !struct.at3 = value
      def min: Float = struct._4
      def min_=(value: Float): Unit = !struct.at4 = value
      def max: Float = struct._5
      def max_=(value: Float): Unit = !struct.at5 = value
      def range: Float = struct._6
      def range_=(value: Float): Unit = !struct.at6 = value
      def count: CInt = struct._7
      def count_=(value: CInt): Unit = !struct.at7 = value
      def last: nk_vec2 = struct._8
      def last_=(value: nk_vec2): Unit = !struct.at8 = value
      def index: CInt = struct._9
      def index_=(value: CInt): Unit = !struct.at9 = value

  opaque type nk_clipboard = CStruct3[nk_handle, nk_plugin_paste, nk_plugin_copy]
  object nk_clipboard:
    given _tag: Tag[nk_clipboard] = Tag.materializeCStruct3Tag[nk_handle, nk_plugin_paste, nk_plugin_copy]
    def apply()(using Zone): Ptr[nk_clipboard] = scala.scalanative.unsafe.alloc[nk_clipboard](1)
    def apply(userdata: nk_handle, paste: nk_plugin_paste, copy: nk_plugin_copy)(using Zone): Ptr[nk_clipboard] = 
      val ____ptr = apply()
      (!____ptr).userdata = userdata
      (!____ptr).paste = paste
      (!____ptr).copy = copy
      ____ptr
    extension (struct: nk_clipboard)
      def userdata: nk_handle = struct._1
      def userdata_=(value: nk_handle): Unit = !struct.at1 = value
      def paste: nk_plugin_paste = struct._2
      def paste_=(value: nk_plugin_paste): Unit = !struct.at2 = value
      def copy: nk_plugin_copy = struct._3
      def copy_=(value: nk_plugin_copy): Unit = !struct.at3 = value

  opaque type nk_color = CStruct4[nk_byte, nk_byte, nk_byte, nk_byte]
  object nk_color:
    given _tag: Tag[nk_color] = Tag.materializeCStruct4Tag[nk_byte, nk_byte, nk_byte, nk_byte]
    def apply()(using Zone): Ptr[nk_color] = scala.scalanative.unsafe.alloc[nk_color](1)
    def apply(r: nk_byte, g: nk_byte, b: nk_byte, a: nk_byte)(using Zone): Ptr[nk_color] = 
      val ____ptr = apply()
      (!____ptr).r = r
      (!____ptr).g = g
      (!____ptr).b = b
      (!____ptr).a = a
      ____ptr
    extension (struct: nk_color)
      def r: nk_byte = struct._1
      def r_=(value: nk_byte): Unit = !struct.at1 = value
      def g: nk_byte = struct._2
      def g_=(value: nk_byte): Unit = !struct.at2 = value
      def b: nk_byte = struct._3
      def b_=(value: nk_byte): Unit = !struct.at3 = value
      def a: nk_byte = struct._4
      def a_=(value: nk_byte): Unit = !struct.at4 = value

  opaque type nk_colorf = CStruct4[Float, Float, Float, Float]
  object nk_colorf:
    given _tag: Tag[nk_colorf] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
    def apply()(using Zone): Ptr[nk_colorf] = scala.scalanative.unsafe.alloc[nk_colorf](1)
    def apply(r: Float, g: Float, b: Float, a: Float)(using Zone): Ptr[nk_colorf] = 
      val ____ptr = apply()
      (!____ptr).r = r
      (!____ptr).g = g
      (!____ptr).b = b
      (!____ptr).a = a
      ____ptr
    extension (struct: nk_colorf)
      def r: Float = struct._1
      def r_=(value: Float): Unit = !struct.at1 = value
      def g: Float = struct._2
      def g_=(value: Float): Unit = !struct.at2 = value
      def b: Float = struct._3
      def b_=(value: Float): Unit = !struct.at3 = value
      def a: Float = struct._4
      def a_=(value: Float): Unit = !struct.at4 = value

  opaque type nk_command = CStruct0
  object nk_command:
    given _tag: Tag[nk_command] = Tag.materializeCStruct0Tag

  opaque type nk_command_arc = CStruct7[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, CArray[Float, Nat._2], nk_color]
  object nk_command_arc:
    given _tag: Tag[nk_command_arc] = Tag.materializeCStruct7Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, CArray[Float, Nat._2], nk_color]
    def apply()(using Zone): Ptr[nk_command_arc] = scala.scalanative.unsafe.alloc[nk_command_arc](1)
    def apply(header: nk_command, cx: CShort, cy: CShort, r: CUnsignedShort, line_thickness: CUnsignedShort, a: CArray[Float, Nat._2], color: nk_color)(using Zone): Ptr[nk_command_arc] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).cx = cx
      (!____ptr).cy = cy
      (!____ptr).r = r
      (!____ptr).line_thickness = line_thickness
      (!____ptr).a = a
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_arc)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def cx: CShort = struct._2
      def cx_=(value: CShort): Unit = !struct.at2 = value
      def cy: CShort = struct._3
      def cy_=(value: CShort): Unit = !struct.at3 = value
      def r: CUnsignedShort = struct._4
      def r_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def line_thickness: CUnsignedShort = struct._5
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def a: CArray[Float, Nat._2] = struct._6
      def a_=(value: CArray[Float, Nat._2]): Unit = !struct.at6 = value
      def color: nk_color = struct._7
      def color_=(value: nk_color): Unit = !struct.at7 = value

  opaque type nk_command_arc_filled = CStruct6[nk_command, CShort, CShort, CUnsignedShort, CArray[Float, Nat._2], nk_color]
  object nk_command_arc_filled:
    given _tag: Tag[nk_command_arc_filled] = Tag.materializeCStruct6Tag[nk_command, CShort, CShort, CUnsignedShort, CArray[Float, Nat._2], nk_color]
    def apply()(using Zone): Ptr[nk_command_arc_filled] = scala.scalanative.unsafe.alloc[nk_command_arc_filled](1)
    def apply(header: nk_command, cx: CShort, cy: CShort, r: CUnsignedShort, a: CArray[Float, Nat._2], color: nk_color)(using Zone): Ptr[nk_command_arc_filled] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).cx = cx
      (!____ptr).cy = cy
      (!____ptr).r = r
      (!____ptr).a = a
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_arc_filled)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def cx: CShort = struct._2
      def cx_=(value: CShort): Unit = !struct.at2 = value
      def cy: CShort = struct._3
      def cy_=(value: CShort): Unit = !struct.at3 = value
      def r: CUnsignedShort = struct._4
      def r_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def a: CArray[Float, Nat._2] = struct._5
      def a_=(value: CArray[Float, Nat._2]): Unit = !struct.at5 = value
      def color: nk_color = struct._6
      def color_=(value: nk_color): Unit = !struct.at6 = value

  opaque type nk_command_buffer = CStruct0
  object nk_command_buffer:
    given _tag: Tag[nk_command_buffer] = Tag.materializeCStruct0Tag

  opaque type nk_command_circle = CStruct7[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, nk_color]
  object nk_command_circle:
    given _tag: Tag[nk_command_circle] = Tag.materializeCStruct7Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, CUnsignedShort, nk_color]
    def apply()(using Zone): Ptr[nk_command_circle] = scala.scalanative.unsafe.alloc[nk_command_circle](1)
    def apply(header: nk_command, x: CShort, y: CShort, line_thickness: CUnsignedShort, w: CUnsignedShort, h: CUnsignedShort, color: nk_color)(using Zone): Ptr[nk_command_circle] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).line_thickness = line_thickness
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_circle)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def line_thickness: CUnsignedShort = struct._4
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def w: CUnsignedShort = struct._5
      def w_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def h: CUnsignedShort = struct._6
      def h_=(value: CUnsignedShort): Unit = !struct.at6 = value
      def color: nk_color = struct._7
      def color_=(value: nk_color): Unit = !struct.at7 = value

  opaque type nk_command_circle_filled = CStruct6[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
  object nk_command_circle_filled:
    given _tag: Tag[nk_command_circle_filled] = Tag.materializeCStruct6Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
    def apply()(using Zone): Ptr[nk_command_circle_filled] = scala.scalanative.unsafe.alloc[nk_command_circle_filled](1)
    def apply(header: nk_command, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, color: nk_color)(using Zone): Ptr[nk_command_circle_filled] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_circle_filled)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def w: CUnsignedShort = struct._4
      def w_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def h: CUnsignedShort = struct._5
      def h_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def color: nk_color = struct._6
      def color_=(value: nk_color): Unit = !struct.at6 = value

  opaque type nk_command_curve = CStruct6[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, CArray[nk_vec2i, Nat._2], nk_color]
  object nk_command_curve:
    given _tag: Tag[nk_command_curve] = Tag.materializeCStruct6Tag[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, CArray[nk_vec2i, Nat._2], nk_color]
    def apply()(using Zone): Ptr[nk_command_curve] = scala.scalanative.unsafe.alloc[nk_command_curve](1)
    def apply(header: nk_command, line_thickness: CUnsignedShort, begin: nk_vec2i, end: nk_vec2i, ctrl: CArray[nk_vec2i, Nat._2], color: nk_color)(using Zone): Ptr[nk_command_curve] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).line_thickness = line_thickness
      (!____ptr).begin = begin
      (!____ptr).end = end
      (!____ptr).ctrl = ctrl
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_curve)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def line_thickness: CUnsignedShort = struct._2
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def begin: nk_vec2i = struct._3
      def begin_=(value: nk_vec2i): Unit = !struct.at3 = value
      def end: nk_vec2i = struct._4
      def end_=(value: nk_vec2i): Unit = !struct.at4 = value
      def ctrl: CArray[nk_vec2i, Nat._2] = struct._5
      def ctrl_=(value: CArray[nk_vec2i, Nat._2]): Unit = !struct.at5 = value
      def color: nk_color = struct._6
      def color_=(value: nk_color): Unit = !struct.at6 = value

  opaque type nk_command_custom = CStruct7[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, nk_command_custom_callback]
  object nk_command_custom:
    given _tag: Tag[nk_command_custom] = Tag.materializeCStruct7Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_handle, nk_command_custom_callback]
    def apply()(using Zone): Ptr[nk_command_custom] = scala.scalanative.unsafe.alloc[nk_command_custom](1)
    def apply(header: nk_command, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, callback_data: nk_handle, callback: nk_command_custom_callback)(using Zone): Ptr[nk_command_custom] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).callback_data = callback_data
      (!____ptr).callback = callback
      ____ptr
    extension (struct: nk_command_custom)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def w: CUnsignedShort = struct._4
      def w_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def h: CUnsignedShort = struct._5
      def h_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def callback_data: nk_handle = struct._6
      def callback_data_=(value: nk_handle): Unit = !struct.at6 = value
      def callback: nk_command_custom_callback = struct._7
      def callback_=(value: nk_command_custom_callback): Unit = !struct.at7 = value

  opaque type nk_command_image = CStruct7[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_image, nk_color]
  object nk_command_image:
    given _tag: Tag[nk_command_image] = Tag.materializeCStruct7Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_image, nk_color]
    def apply()(using Zone): Ptr[nk_command_image] = scala.scalanative.unsafe.alloc[nk_command_image](1)
    def apply(header: nk_command, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, img: nk_image, col: nk_color)(using Zone): Ptr[nk_command_image] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).img = img
      (!____ptr).col = col
      ____ptr
    extension (struct: nk_command_image)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def w: CUnsignedShort = struct._4
      def w_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def h: CUnsignedShort = struct._5
      def h_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def img: nk_image = struct._6
      def img_=(value: nk_image): Unit = !struct.at6 = value
      def col: nk_color = struct._7
      def col_=(value: nk_color): Unit = !struct.at7 = value

  opaque type nk_command_line = CStruct5[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, nk_color]
  object nk_command_line:
    given _tag: Tag[nk_command_line] = Tag.materializeCStruct5Tag[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, nk_color]
    def apply()(using Zone): Ptr[nk_command_line] = scala.scalanative.unsafe.alloc[nk_command_line](1)
    def apply(header: nk_command, line_thickness: CUnsignedShort, begin: nk_vec2i, end: nk_vec2i, color: nk_color)(using Zone): Ptr[nk_command_line] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).line_thickness = line_thickness
      (!____ptr).begin = begin
      (!____ptr).end = end
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_line)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def line_thickness: CUnsignedShort = struct._2
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def begin: nk_vec2i = struct._3
      def begin_=(value: nk_vec2i): Unit = !struct.at3 = value
      def end: nk_vec2i = struct._4
      def end_=(value: nk_vec2i): Unit = !struct.at4 = value
      def color: nk_color = struct._5
      def color_=(value: nk_color): Unit = !struct.at5 = value

  opaque type nk_command_polygon = CStruct5[nk_command, nk_color, CUnsignedShort, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
  object nk_command_polygon:
    given _tag: Tag[nk_command_polygon] = Tag.materializeCStruct5Tag[nk_command, nk_color, CUnsignedShort, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
    def apply()(using Zone): Ptr[nk_command_polygon] = scala.scalanative.unsafe.alloc[nk_command_polygon](1)
    def apply(header: nk_command, color: nk_color, line_thickness: CUnsignedShort, point_count: CUnsignedShort, points: CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polygon] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).color = color
      (!____ptr).line_thickness = line_thickness
      (!____ptr).point_count = point_count
      (!____ptr).points = points
      ____ptr
    extension (struct: nk_command_polygon)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def color: nk_color = struct._2
      def color_=(value: nk_color): Unit = !struct.at2 = value
      def line_thickness: CUnsignedShort = struct._3
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at3 = value
      def point_count: CUnsignedShort = struct._4
      def point_count_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def points: CArray[nk_vec2i, Nat._1] = struct._5
      def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at5 = value

  opaque type nk_command_polygon_filled = CStruct4[nk_command, nk_color, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
  object nk_command_polygon_filled:
    given _tag: Tag[nk_command_polygon_filled] = Tag.materializeCStruct4Tag[nk_command, nk_color, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
    def apply()(using Zone): Ptr[nk_command_polygon_filled] = scala.scalanative.unsafe.alloc[nk_command_polygon_filled](1)
    def apply(header: nk_command, color: nk_color, point_count: CUnsignedShort, points: CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polygon_filled] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).color = color
      (!____ptr).point_count = point_count
      (!____ptr).points = points
      ____ptr
    extension (struct: nk_command_polygon_filled)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def color: nk_color = struct._2
      def color_=(value: nk_color): Unit = !struct.at2 = value
      def point_count: CUnsignedShort = struct._3
      def point_count_=(value: CUnsignedShort): Unit = !struct.at3 = value
      def points: CArray[nk_vec2i, Nat._1] = struct._4
      def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at4 = value

  opaque type nk_command_polyline = CStruct5[nk_command, nk_color, CUnsignedShort, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
  object nk_command_polyline:
    given _tag: Tag[nk_command_polyline] = Tag.materializeCStruct5Tag[nk_command, nk_color, CUnsignedShort, CUnsignedShort, CArray[nk_vec2i, Nat._1]]
    def apply()(using Zone): Ptr[nk_command_polyline] = scala.scalanative.unsafe.alloc[nk_command_polyline](1)
    def apply(header: nk_command, color: nk_color, line_thickness: CUnsignedShort, point_count: CUnsignedShort, points: CArray[nk_vec2i, Nat._1])(using Zone): Ptr[nk_command_polyline] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).color = color
      (!____ptr).line_thickness = line_thickness
      (!____ptr).point_count = point_count
      (!____ptr).points = points
      ____ptr
    extension (struct: nk_command_polyline)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def color: nk_color = struct._2
      def color_=(value: nk_color): Unit = !struct.at2 = value
      def line_thickness: CUnsignedShort = struct._3
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at3 = value
      def point_count: CUnsignedShort = struct._4
      def point_count_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def points: CArray[nk_vec2i, Nat._1] = struct._5
      def points_=(value: CArray[nk_vec2i, Nat._1]): Unit = !struct.at5 = value

  opaque type nk_command_rect = CStruct8[nk_command, CUnsignedShort, CUnsignedShort, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
  object nk_command_rect:
    given _tag: Tag[nk_command_rect] = Tag.materializeCStruct8Tag[nk_command, CUnsignedShort, CUnsignedShort, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
    def apply()(using Zone): Ptr[nk_command_rect] = scala.scalanative.unsafe.alloc[nk_command_rect](1)
    def apply(header: nk_command, rounding: CUnsignedShort, line_thickness: CUnsignedShort, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, color: nk_color)(using Zone): Ptr[nk_command_rect] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).rounding = rounding
      (!____ptr).line_thickness = line_thickness
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_rect)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def rounding: CUnsignedShort = struct._2
      def rounding_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def line_thickness: CUnsignedShort = struct._3
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at3 = value
      def x: CShort = struct._4
      def x_=(value: CShort): Unit = !struct.at4 = value
      def y: CShort = struct._5
      def y_=(value: CShort): Unit = !struct.at5 = value
      def w: CUnsignedShort = struct._6
      def w_=(value: CUnsignedShort): Unit = !struct.at6 = value
      def h: CUnsignedShort = struct._7
      def h_=(value: CUnsignedShort): Unit = !struct.at7 = value
      def color: nk_color = struct._8
      def color_=(value: nk_color): Unit = !struct.at8 = value

  opaque type nk_command_rect_filled = CStruct7[nk_command, CUnsignedShort, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
  object nk_command_rect_filled:
    given _tag: Tag[nk_command_rect_filled] = Tag.materializeCStruct7Tag[nk_command, CUnsignedShort, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color]
    def apply()(using Zone): Ptr[nk_command_rect_filled] = scala.scalanative.unsafe.alloc[nk_command_rect_filled](1)
    def apply(header: nk_command, rounding: CUnsignedShort, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, color: nk_color)(using Zone): Ptr[nk_command_rect_filled] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).rounding = rounding
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_rect_filled)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def rounding: CUnsignedShort = struct._2
      def rounding_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def x: CShort = struct._3
      def x_=(value: CShort): Unit = !struct.at3 = value
      def y: CShort = struct._4
      def y_=(value: CShort): Unit = !struct.at4 = value
      def w: CUnsignedShort = struct._5
      def w_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def h: CUnsignedShort = struct._6
      def h_=(value: CUnsignedShort): Unit = !struct.at6 = value
      def color: nk_color = struct._7
      def color_=(value: nk_color): Unit = !struct.at7 = value

  opaque type nk_command_rect_multi_color = CStruct9[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color, nk_color, nk_color, nk_color]
  object nk_command_rect_multi_color:
    given _tag: Tag[nk_command_rect_multi_color] = Tag.materializeCStruct9Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort, nk_color, nk_color, nk_color, nk_color]
    def apply()(using Zone): Ptr[nk_command_rect_multi_color] = scala.scalanative.unsafe.alloc[nk_command_rect_multi_color](1)
    def apply(header: nk_command, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, left: nk_color, top: nk_color, bottom: nk_color, right: nk_color)(using Zone): Ptr[nk_command_rect_multi_color] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).left = left
      (!____ptr).top = top
      (!____ptr).bottom = bottom
      (!____ptr).right = right
      ____ptr
    extension (struct: nk_command_rect_multi_color)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def w: CUnsignedShort = struct._4
      def w_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def h: CUnsignedShort = struct._5
      def h_=(value: CUnsignedShort): Unit = !struct.at5 = value
      def left: nk_color = struct._6
      def left_=(value: nk_color): Unit = !struct.at6 = value
      def top: nk_color = struct._7
      def top_=(value: nk_color): Unit = !struct.at7 = value
      def bottom: nk_color = struct._8
      def bottom_=(value: nk_color): Unit = !struct.at8 = value
      def right: nk_color = struct._9
      def right_=(value: nk_color): Unit = !struct.at9 = value

  opaque type nk_command_scissor = CStruct5[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort]
  object nk_command_scissor:
    given _tag: Tag[nk_command_scissor] = Tag.materializeCStruct5Tag[nk_command, CShort, CShort, CUnsignedShort, CUnsignedShort]
    def apply()(using Zone): Ptr[nk_command_scissor] = scala.scalanative.unsafe.alloc[nk_command_scissor](1)
    def apply(header: nk_command, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort)(using Zone): Ptr[nk_command_scissor] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      ____ptr
    extension (struct: nk_command_scissor)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def x: CShort = struct._2
      def x_=(value: CShort): Unit = !struct.at2 = value
      def y: CShort = struct._3
      def y_=(value: CShort): Unit = !struct.at3 = value
      def w: CUnsignedShort = struct._4
      def w_=(value: CUnsignedShort): Unit = !struct.at4 = value
      def h: CUnsignedShort = struct._5
      def h_=(value: CUnsignedShort): Unit = !struct.at5 = value

  opaque type nk_command_text = CStruct11[nk_command, Ptr[nk_user_font], nk_color, nk_color, CShort, CShort, CUnsignedShort, CUnsignedShort, Float, CInt, CArray[CChar, Nat._1]]
  object nk_command_text:
    given _tag: Tag[nk_command_text] = Tag.materializeCStruct11Tag[nk_command, Ptr[nk_user_font], nk_color, nk_color, CShort, CShort, CUnsignedShort, CUnsignedShort, Float, CInt, CArray[CChar, Nat._1]]
    def apply()(using Zone): Ptr[nk_command_text] = scala.scalanative.unsafe.alloc[nk_command_text](1)
    def apply(header: nk_command, font: Ptr[nk_user_font], background: nk_color, foreground: nk_color, x: CShort, y: CShort, w: CUnsignedShort, h: CUnsignedShort, height: Float, length: CInt, string: CArray[CChar, Nat._1])(using Zone): Ptr[nk_command_text] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).font = font
      (!____ptr).background = background
      (!____ptr).foreground = foreground
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).height = height
      (!____ptr).length = length
      (!____ptr).string = string
      ____ptr
    extension (struct: nk_command_text)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def font: Ptr[nk_user_font] = struct._2
      def font_=(value: Ptr[nk_user_font]): Unit = !struct.at2 = value
      def background: nk_color = struct._3
      def background_=(value: nk_color): Unit = !struct.at3 = value
      def foreground: nk_color = struct._4
      def foreground_=(value: nk_color): Unit = !struct.at4 = value
      def x: CShort = struct._5
      def x_=(value: CShort): Unit = !struct.at5 = value
      def y: CShort = struct._6
      def y_=(value: CShort): Unit = !struct.at6 = value
      def w: CUnsignedShort = struct._7
      def w_=(value: CUnsignedShort): Unit = !struct.at7 = value
      def h: CUnsignedShort = struct._8
      def h_=(value: CUnsignedShort): Unit = !struct.at8 = value
      def height: Float = struct._9
      def height_=(value: Float): Unit = !struct.at9 = value
      def length: CInt = struct._10
      def length_=(value: CInt): Unit = !struct.at10 = value
      def string: CArray[CChar, Nat._1] = struct._11
      def string_=(value: CArray[CChar, Nat._1]): Unit = !struct.at11 = value

  opaque type nk_command_triangle = CStruct6[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, nk_vec2i, nk_color]
  object nk_command_triangle:
    given _tag: Tag[nk_command_triangle] = Tag.materializeCStruct6Tag[nk_command, CUnsignedShort, nk_vec2i, nk_vec2i, nk_vec2i, nk_color]
    def apply()(using Zone): Ptr[nk_command_triangle] = scala.scalanative.unsafe.alloc[nk_command_triangle](1)
    def apply(header: nk_command, line_thickness: CUnsignedShort, a: nk_vec2i, b: nk_vec2i, c: nk_vec2i, color: nk_color)(using Zone): Ptr[nk_command_triangle] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).line_thickness = line_thickness
      (!____ptr).a = a
      (!____ptr).b = b
      (!____ptr).c = c
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_triangle)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def line_thickness: CUnsignedShort = struct._2
      def line_thickness_=(value: CUnsignedShort): Unit = !struct.at2 = value
      def a: nk_vec2i = struct._3
      def a_=(value: nk_vec2i): Unit = !struct.at3 = value
      def b: nk_vec2i = struct._4
      def b_=(value: nk_vec2i): Unit = !struct.at4 = value
      def c: nk_vec2i = struct._5
      def c_=(value: nk_vec2i): Unit = !struct.at5 = value
      def color: nk_color = struct._6
      def color_=(value: nk_color): Unit = !struct.at6 = value

  opaque type nk_command_triangle_filled = CStruct5[nk_command, nk_vec2i, nk_vec2i, nk_vec2i, nk_color]
  object nk_command_triangle_filled:
    given _tag: Tag[nk_command_triangle_filled] = Tag.materializeCStruct5Tag[nk_command, nk_vec2i, nk_vec2i, nk_vec2i, nk_color]
    def apply()(using Zone): Ptr[nk_command_triangle_filled] = scala.scalanative.unsafe.alloc[nk_command_triangle_filled](1)
    def apply(header: nk_command, a: nk_vec2i, b: nk_vec2i, c: nk_vec2i, color: nk_color)(using Zone): Ptr[nk_command_triangle_filled] = 
      val ____ptr = apply()
      (!____ptr).header = header
      (!____ptr).a = a
      (!____ptr).b = b
      (!____ptr).c = c
      (!____ptr).color = color
      ____ptr
    extension (struct: nk_command_triangle_filled)
      def header: nk_command = struct._1
      def header_=(value: nk_command): Unit = !struct.at1 = value
      def a: nk_vec2i = struct._2
      def a_=(value: nk_vec2i): Unit = !struct.at2 = value
      def b: nk_vec2i = struct._3
      def b_=(value: nk_vec2i): Unit = !struct.at3 = value
      def c: nk_vec2i = struct._4
      def c_=(value: nk_vec2i): Unit = !struct.at4 = value
      def color: nk_color = struct._5
      def color_=(value: nk_color): Unit = !struct.at5 = value

  opaque type nk_config_stack_button_behavior = CStruct2[CInt, CArray[nk_config_stack_button_behavior_element, Nat._8]]
  object nk_config_stack_button_behavior:
    given _tag: Tag[nk_config_stack_button_behavior] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_button_behavior_element, Nat._8]]
    def apply()(using Zone): Ptr[nk_config_stack_button_behavior] = scala.scalanative.unsafe.alloc[nk_config_stack_button_behavior](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_button_behavior_element, Nat._8])(using Zone): Ptr[nk_config_stack_button_behavior] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_button_behavior)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_button_behavior_element, Nat._8] = struct._2
      def elements_=(value: CArray[nk_config_stack_button_behavior_element, Nat._8]): Unit = !struct.at2 = value

  opaque type nk_config_stack_button_behavior_element = CStruct2[Ptr[nk_button_behavior], nk_button_behavior]
  object nk_config_stack_button_behavior_element:
    given _tag: Tag[nk_config_stack_button_behavior_element] = Tag.materializeCStruct2Tag[Ptr[nk_button_behavior], nk_button_behavior]
    def apply()(using Zone): Ptr[nk_config_stack_button_behavior_element] = scala.scalanative.unsafe.alloc[nk_config_stack_button_behavior_element](1)
    def apply(address: Ptr[nk_button_behavior], old_value: nk_button_behavior)(using Zone): Ptr[nk_config_stack_button_behavior_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_button_behavior_element)
      def address: Ptr[nk_button_behavior] = struct._1
      def address_=(value: Ptr[nk_button_behavior]): Unit = !struct.at1 = value
      def old_value: nk_button_behavior = struct._2
      def old_value_=(value: nk_button_behavior): Unit = !struct.at2 = value

  opaque type nk_config_stack_color = CStruct2[CInt, CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]]
  object nk_config_stack_color:
    given _tag: Tag[nk_config_stack_color] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]]
    def apply()(using Zone): Ptr[nk_config_stack_color] = scala.scalanative.unsafe.alloc[nk_config_stack_color](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_color] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_color)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]] = struct._2
      def elements_=(value: CArray[nk_config_stack_color_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at2 = value

  opaque type nk_config_stack_color_element = CStruct2[Ptr[nk_color], nk_color]
  object nk_config_stack_color_element:
    given _tag: Tag[nk_config_stack_color_element] = Tag.materializeCStruct2Tag[Ptr[nk_color], nk_color]
    def apply()(using Zone): Ptr[nk_config_stack_color_element] = scala.scalanative.unsafe.alloc[nk_config_stack_color_element](1)
    def apply(address: Ptr[nk_color], old_value: nk_color)(using Zone): Ptr[nk_config_stack_color_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_color_element)
      def address: Ptr[nk_color] = struct._1
      def address_=(value: Ptr[nk_color]): Unit = !struct.at1 = value
      def old_value: nk_color = struct._2
      def old_value_=(value: nk_color): Unit = !struct.at2 = value

  opaque type nk_config_stack_flags = CStruct2[CInt, CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]]
  object nk_config_stack_flags:
    given _tag: Tag[nk_config_stack_flags] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]]
    def apply()(using Zone): Ptr[nk_config_stack_flags] = scala.scalanative.unsafe.alloc[nk_config_stack_flags](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_flags] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_flags)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]] = struct._2
      def elements_=(value: CArray[nk_config_stack_flags_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at2 = value

  opaque type nk_config_stack_flags_element = CStruct2[Ptr[nk_flags], nk_flags]
  object nk_config_stack_flags_element:
    given _tag: Tag[nk_config_stack_flags_element] = Tag.materializeCStruct2Tag[Ptr[nk_flags], nk_flags]
    def apply()(using Zone): Ptr[nk_config_stack_flags_element] = scala.scalanative.unsafe.alloc[nk_config_stack_flags_element](1)
    def apply(address: Ptr[nk_flags], old_value: nk_flags)(using Zone): Ptr[nk_config_stack_flags_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_flags_element)
      def address: Ptr[nk_flags] = struct._1
      def address_=(value: Ptr[nk_flags]): Unit = !struct.at1 = value
      def old_value: nk_flags = struct._2
      def old_value_=(value: nk_flags): Unit = !struct.at2 = value

  opaque type nk_config_stack_float = CStruct2[CInt, CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]]
  object nk_config_stack_float:
    given _tag: Tag[nk_config_stack_float] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]]
    def apply()(using Zone): Ptr[nk_config_stack_float] = scala.scalanative.unsafe.alloc[nk_config_stack_float](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[nk_config_stack_float] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_float)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]] = struct._2
      def elements_=(value: CArray[nk_config_stack_float_element, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at2 = value

  opaque type nk_config_stack_float_element = CStruct2[Ptr[Float], Float]
  object nk_config_stack_float_element:
    given _tag: Tag[nk_config_stack_float_element] = Tag.materializeCStruct2Tag[Ptr[Float], Float]
    def apply()(using Zone): Ptr[nk_config_stack_float_element] = scala.scalanative.unsafe.alloc[nk_config_stack_float_element](1)
    def apply(address: Ptr[Float], old_value: Float)(using Zone): Ptr[nk_config_stack_float_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_float_element)
      def address: Ptr[Float] = struct._1
      def address_=(value: Ptr[Float]): Unit = !struct.at1 = value
      def old_value: Float = struct._2
      def old_value_=(value: Float): Unit = !struct.at2 = value

  opaque type nk_config_stack_style_item = CStruct2[CInt, CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]]
  object nk_config_stack_style_item:
    given _tag: Tag[nk_config_stack_style_item] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]]
    def apply()(using Zone): Ptr[nk_config_stack_style_item] = scala.scalanative.unsafe.alloc[nk_config_stack_style_item](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_config_stack_style_item] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_style_item)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def elements_=(value: CArray[nk_config_stack_style_item_element, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type nk_config_stack_style_item_element = CStruct2[Ptr[nk_style_item], nk_style_item]
  object nk_config_stack_style_item_element:
    given _tag: Tag[nk_config_stack_style_item_element] = Tag.materializeCStruct2Tag[Ptr[nk_style_item], nk_style_item]
    def apply()(using Zone): Ptr[nk_config_stack_style_item_element] = scala.scalanative.unsafe.alloc[nk_config_stack_style_item_element](1)
    def apply(address: Ptr[nk_style_item], old_value: nk_style_item)(using Zone): Ptr[nk_config_stack_style_item_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_style_item_element)
      def address: Ptr[nk_style_item] = struct._1
      def address_=(value: Ptr[nk_style_item]): Unit = !struct.at1 = value
      def old_value: nk_style_item = struct._2
      def old_value_=(value: nk_style_item): Unit = !struct.at2 = value

  opaque type nk_config_stack_user_font = CStruct2[CInt, CArray[nk_config_stack_user_font_element, Nat._8]]
  object nk_config_stack_user_font:
    given _tag: Tag[nk_config_stack_user_font] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_user_font_element, Nat._8]]
    def apply()(using Zone): Ptr[nk_config_stack_user_font] = scala.scalanative.unsafe.alloc[nk_config_stack_user_font](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_user_font_element, Nat._8])(using Zone): Ptr[nk_config_stack_user_font] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_user_font)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_user_font_element, Nat._8] = struct._2
      def elements_=(value: CArray[nk_config_stack_user_font_element, Nat._8]): Unit = !struct.at2 = value

  opaque type nk_config_stack_user_font_element = CStruct2[Ptr[Ptr[nk_user_font]], Ptr[nk_user_font]]
  object nk_config_stack_user_font_element:
    given _tag: Tag[nk_config_stack_user_font_element] = Tag.materializeCStruct2Tag[Ptr[Ptr[nk_user_font]], Ptr[nk_user_font]]
    def apply()(using Zone): Ptr[nk_config_stack_user_font_element] = scala.scalanative.unsafe.alloc[nk_config_stack_user_font_element](1)
    def apply(address: Ptr[Ptr[nk_user_font]], old_value: Ptr[nk_user_font])(using Zone): Ptr[nk_config_stack_user_font_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_user_font_element)
      def address: Ptr[Ptr[nk_user_font]] = struct._1
      def address_=(value: Ptr[Ptr[nk_user_font]]): Unit = !struct.at1 = value
      def old_value: Ptr[nk_user_font] = struct._2
      def old_value_=(value: Ptr[nk_user_font]): Unit = !struct.at2 = value

  opaque type nk_config_stack_vec2 = CStruct2[CInt, CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]]
  object nk_config_stack_vec2:
    given _tag: Tag[nk_config_stack_vec2] = Tag.materializeCStruct2Tag[CInt, CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]]
    def apply()(using Zone): Ptr[nk_config_stack_vec2] = scala.scalanative.unsafe.alloc[nk_config_stack_vec2](1)
    def apply(head: CInt, elements: CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_config_stack_vec2] = 
      val ____ptr = apply()
      (!____ptr).head = head
      (!____ptr).elements = elements
      ____ptr
    extension (struct: nk_config_stack_vec2)
      def head: CInt = struct._1
      def head_=(value: CInt): Unit = !struct.at1 = value
      def elements: CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def elements_=(value: CArray[nk_config_stack_vec2_element, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value

  opaque type nk_config_stack_vec2_element = CStruct2[Ptr[nk_vec2], nk_vec2]
  object nk_config_stack_vec2_element:
    given _tag: Tag[nk_config_stack_vec2_element] = Tag.materializeCStruct2Tag[Ptr[nk_vec2], nk_vec2]
    def apply()(using Zone): Ptr[nk_config_stack_vec2_element] = scala.scalanative.unsafe.alloc[nk_config_stack_vec2_element](1)
    def apply(address: Ptr[nk_vec2], old_value: nk_vec2)(using Zone): Ptr[nk_config_stack_vec2_element] = 
      val ____ptr = apply()
      (!____ptr).address = address
      (!____ptr).old_value = old_value
      ____ptr
    extension (struct: nk_config_stack_vec2_element)
      def address: Ptr[nk_vec2] = struct._1
      def address_=(value: Ptr[nk_vec2]): Unit = !struct.at1 = value
      def old_value: nk_vec2 = struct._2
      def old_value_=(value: nk_vec2): Unit = !struct.at2 = value

  opaque type nk_configuration_stacks = CStruct7[nk_config_stack_style_item, nk_config_stack_float, nk_config_stack_vec2, nk_config_stack_flags, nk_config_stack_color, nk_config_stack_user_font, nk_config_stack_button_behavior]
  object nk_configuration_stacks:
    given _tag: Tag[nk_configuration_stacks] = Tag.materializeCStruct7Tag[nk_config_stack_style_item, nk_config_stack_float, nk_config_stack_vec2, nk_config_stack_flags, nk_config_stack_color, nk_config_stack_user_font, nk_config_stack_button_behavior]
    def apply()(using Zone): Ptr[nk_configuration_stacks] = scala.scalanative.unsafe.alloc[nk_configuration_stacks](1)
    def apply(style_items: nk_config_stack_style_item, floats: nk_config_stack_float, vectors: nk_config_stack_vec2, flags: nk_config_stack_flags, colors: nk_config_stack_color, fonts: nk_config_stack_user_font, button_behaviors: nk_config_stack_button_behavior)(using Zone): Ptr[nk_configuration_stacks] = 
      val ____ptr = apply()
      (!____ptr).style_items = style_items
      (!____ptr).floats = floats
      (!____ptr).vectors = vectors
      (!____ptr).flags = flags
      (!____ptr).colors = colors
      (!____ptr).fonts = fonts
      (!____ptr).button_behaviors = button_behaviors
      ____ptr
    extension (struct: nk_configuration_stacks)
      def style_items: nk_config_stack_style_item = struct._1
      def style_items_=(value: nk_config_stack_style_item): Unit = !struct.at1 = value
      def floats: nk_config_stack_float = struct._2
      def floats_=(value: nk_config_stack_float): Unit = !struct.at2 = value
      def vectors: nk_config_stack_vec2 = struct._3
      def vectors_=(value: nk_config_stack_vec2): Unit = !struct.at3 = value
      def flags: nk_config_stack_flags = struct._4
      def flags_=(value: nk_config_stack_flags): Unit = !struct.at4 = value
      def colors: nk_config_stack_color = struct._5
      def colors_=(value: nk_config_stack_color): Unit = !struct.at5 = value
      def fonts: nk_config_stack_user_font = struct._6
      def fonts_=(value: nk_config_stack_user_font): Unit = !struct.at6 = value
      def button_behaviors: nk_config_stack_button_behavior = struct._7
      def button_behaviors_=(value: nk_config_stack_button_behavior): Unit = !struct.at7 = value

  opaque type nk_context = CStruct0
  object nk_context:
    given _tag: Tag[nk_context] = Tag.materializeCStruct0Tag

  opaque type nk_convert_config = CStruct0
  object nk_convert_config:
    given _tag: Tag[nk_convert_config] = Tag.materializeCStruct0Tag

  opaque type nk_cursor = CStruct3[nk_image, nk_vec2, nk_vec2]
  object nk_cursor:
    given _tag: Tag[nk_cursor] = Tag.materializeCStruct3Tag[nk_image, nk_vec2, nk_vec2]
    def apply()(using Zone): Ptr[nk_cursor] = scala.scalanative.unsafe.alloc[nk_cursor](1)
    def apply(img: nk_image, size: nk_vec2, offset: nk_vec2)(using Zone): Ptr[nk_cursor] = 
      val ____ptr = apply()
      (!____ptr).img = img
      (!____ptr).size = size
      (!____ptr).offset = offset
      ____ptr
    extension (struct: nk_cursor)
      def img: nk_image = struct._1
      def img_=(value: nk_image): Unit = !struct.at1 = value
      def size: nk_vec2 = struct._2
      def size_=(value: nk_vec2): Unit = !struct.at2 = value
      def offset: nk_vec2 = struct._3
      def offset_=(value: nk_vec2): Unit = !struct.at3 = value

  opaque type nk_draw_command = CStruct0
  object nk_draw_command:
    given _tag: Tag[nk_draw_command] = Tag.materializeCStruct0Tag

  opaque type nk_draw_list = CStruct0
  object nk_draw_list:
    given _tag: Tag[nk_draw_list] = Tag.materializeCStruct0Tag

  opaque type nk_draw_null_texture = CStruct2[nk_handle, nk_vec2]
  object nk_draw_null_texture:
    given _tag: Tag[nk_draw_null_texture] = Tag.materializeCStruct2Tag[nk_handle, nk_vec2]
    def apply()(using Zone): Ptr[nk_draw_null_texture] = scala.scalanative.unsafe.alloc[nk_draw_null_texture](1)
    def apply(texture: nk_handle, uv: nk_vec2)(using Zone): Ptr[nk_draw_null_texture] = 
      val ____ptr = apply()
      (!____ptr).texture = texture
      (!____ptr).uv = uv
      ____ptr
    extension (struct: nk_draw_null_texture)
      def texture: nk_handle = struct._1
      def texture_=(value: nk_handle): Unit = !struct.at1 = value
      def uv: nk_vec2 = struct._2
      def uv_=(value: nk_vec2): Unit = !struct.at2 = value

  opaque type nk_draw_vertex_layout_element = CStruct0
  object nk_draw_vertex_layout_element:
    given _tag: Tag[nk_draw_vertex_layout_element] = Tag.materializeCStruct0Tag

  opaque type nk_edit_state = CStruct11[nk_hash, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt, CInt, CInt, nk_scroll, CUnsignedChar, CUnsignedChar]
  object nk_edit_state:
    given _tag: Tag[nk_edit_state] = Tag.materializeCStruct11Tag[nk_hash, CUnsignedInt, CUnsignedInt, CInt, CInt, CInt, CInt, CInt, nk_scroll, CUnsignedChar, CUnsignedChar]
    def apply()(using Zone): Ptr[nk_edit_state] = scala.scalanative.unsafe.alloc[nk_edit_state](1)
    def apply(name: nk_hash, seq: CUnsignedInt, old: CUnsignedInt, active: CInt, prev: CInt, cursor: CInt, sel_start: CInt, sel_end: CInt, scrollbar: nk_scroll, mode: CUnsignedChar, single_line: CUnsignedChar)(using Zone): Ptr[nk_edit_state] = 
      val ____ptr = apply()
      (!____ptr).name = name
      (!____ptr).seq = seq
      (!____ptr).old = old
      (!____ptr).active = active
      (!____ptr).prev = prev
      (!____ptr).cursor = cursor
      (!____ptr).sel_start = sel_start
      (!____ptr).sel_end = sel_end
      (!____ptr).scrollbar = scrollbar
      (!____ptr).mode = mode
      (!____ptr).single_line = single_line
      ____ptr
    extension (struct: nk_edit_state)
      def name: nk_hash = struct._1
      def name_=(value: nk_hash): Unit = !struct.at1 = value
      def seq: CUnsignedInt = struct._2
      def seq_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def old: CUnsignedInt = struct._3
      def old_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def active: CInt = struct._4
      def active_=(value: CInt): Unit = !struct.at4 = value
      def prev: CInt = struct._5
      def prev_=(value: CInt): Unit = !struct.at5 = value
      def cursor: CInt = struct._6
      def cursor_=(value: CInt): Unit = !struct.at6 = value
      def sel_start: CInt = struct._7
      def sel_start_=(value: CInt): Unit = !struct.at7 = value
      def sel_end: CInt = struct._8
      def sel_end_=(value: CInt): Unit = !struct.at8 = value
      def scrollbar: nk_scroll = struct._9
      def scrollbar_=(value: nk_scroll): Unit = !struct.at9 = value
      def mode: CUnsignedChar = struct._10
      def mode_=(value: CUnsignedChar): Unit = !struct.at10 = value
      def single_line: CUnsignedChar = struct._11
      def single_line_=(value: CUnsignedChar): Unit = !struct.at11 = value

  opaque type nk_image = CStruct4[nk_handle, nk_ushort, nk_ushort, CArray[nk_ushort, Nat._4]]
  object nk_image:
    given _tag: Tag[nk_image] = Tag.materializeCStruct4Tag[nk_handle, nk_ushort, nk_ushort, CArray[nk_ushort, Nat._4]]
    def apply()(using Zone): Ptr[nk_image] = scala.scalanative.unsafe.alloc[nk_image](1)
    def apply(handle: nk_handle, w: nk_ushort, h: nk_ushort, region: CArray[nk_ushort, Nat._4])(using Zone): Ptr[nk_image] = 
      val ____ptr = apply()
      (!____ptr).handle = handle
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).region = region
      ____ptr
    extension (struct: nk_image)
      def handle: nk_handle = struct._1
      def handle_=(value: nk_handle): Unit = !struct.at1 = value
      def w: nk_ushort = struct._2
      def w_=(value: nk_ushort): Unit = !struct.at2 = value
      def h: nk_ushort = struct._3
      def h_=(value: nk_ushort): Unit = !struct.at3 = value
      def region: CArray[nk_ushort, Nat._4] = struct._4
      def region_=(value: CArray[nk_ushort, Nat._4]): Unit = !struct.at4 = value

  opaque type nk_input = CStruct2[nk_keyboard, nk_mouse]
  object nk_input:
    given _tag: Tag[nk_input] = Tag.materializeCStruct2Tag[nk_keyboard, nk_mouse]
    def apply()(using Zone): Ptr[nk_input] = scala.scalanative.unsafe.alloc[nk_input](1)
    def apply(keyboard: nk_keyboard, mouse: nk_mouse)(using Zone): Ptr[nk_input] = 
      val ____ptr = apply()
      (!____ptr).keyboard = keyboard
      (!____ptr).mouse = mouse
      ____ptr
    extension (struct: nk_input)
      def keyboard: nk_keyboard = struct._1
      def keyboard_=(value: nk_keyboard): Unit = !struct.at1 = value
      def mouse: nk_mouse = struct._2
      def mouse_=(value: nk_mouse): Unit = !struct.at2 = value

  opaque type nk_key = CStruct2[nk_bool, CUnsignedInt]
  object nk_key:
    given _tag: Tag[nk_key] = Tag.materializeCStruct2Tag[nk_bool, CUnsignedInt]
    def apply()(using Zone): Ptr[nk_key] = scala.scalanative.unsafe.alloc[nk_key](1)
    def apply(down: nk_bool, clicked: CUnsignedInt)(using Zone): Ptr[nk_key] = 
      val ____ptr = apply()
      (!____ptr).down = down
      (!____ptr).clicked = clicked
      ____ptr
    extension (struct: nk_key)
      def down: nk_bool = struct._1
      def down_=(value: nk_bool): Unit = !struct.at1 = value
      def clicked: CUnsignedInt = struct._2
      def clicked_=(value: CUnsignedInt): Unit = !struct.at2 = value

  opaque type nk_keyboard = CStruct3[CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]], CArray[CChar, Nat.Digit2[Nat._1, Nat._6]], CInt]
  object nk_keyboard:
    given _tag: Tag[nk_keyboard] = Tag.materializeCStruct3Tag[CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]], CArray[CChar, Nat.Digit2[Nat._1, Nat._6]], CInt]
    def apply()(using Zone): Ptr[nk_keyboard] = scala.scalanative.unsafe.alloc[nk_keyboard](1)
    def apply(keys: CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]], text: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]], text_len: CInt)(using Zone): Ptr[nk_keyboard] = 
      val ____ptr = apply()
      (!____ptr).keys = keys
      (!____ptr).text = text
      (!____ptr).text_len = text_len
      ____ptr
    extension (struct: nk_keyboard)
      def keys: CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]] = struct._1
      def keys_=(value: CArray[nk_key, Nat.Digit2[Nat._3, Nat._0]]): Unit = !struct.at1 = value
      def text: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]] = struct._2
      def text_=(value: CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at2 = value
      def text_len: CInt = struct._3
      def text_len_=(value: CInt): Unit = !struct.at3 = value

  opaque type nk_list_view = CStruct7[CInt, CInt, CInt, CInt, Ptr[nk_context], Ptr[nk_uint], nk_uint]
  object nk_list_view:
    given _tag: Tag[nk_list_view] = Tag.materializeCStruct7Tag[CInt, CInt, CInt, CInt, Ptr[nk_context], Ptr[nk_uint], nk_uint]
    def apply()(using Zone): Ptr[nk_list_view] = scala.scalanative.unsafe.alloc[nk_list_view](1)
    def apply(begin: CInt, end: CInt, count: CInt, total_height: CInt, ctx: Ptr[nk_context], scroll_pointer: Ptr[nk_uint], scroll_value: nk_uint)(using Zone): Ptr[nk_list_view] = 
      val ____ptr = apply()
      (!____ptr).begin = begin
      (!____ptr).end = end
      (!____ptr).count = count
      (!____ptr).total_height = total_height
      (!____ptr).ctx = ctx
      (!____ptr).scroll_pointer = scroll_pointer
      (!____ptr).scroll_value = scroll_value
      ____ptr
    extension (struct: nk_list_view)
      def begin: CInt = struct._1
      def begin_=(value: CInt): Unit = !struct.at1 = value
      def end: CInt = struct._2
      def end_=(value: CInt): Unit = !struct.at2 = value
      def count: CInt = struct._3
      def count_=(value: CInt): Unit = !struct.at3 = value
      def total_height: CInt = struct._4
      def total_height_=(value: CInt): Unit = !struct.at4 = value
      def ctx: Ptr[nk_context] = struct._5
      def ctx_=(value: Ptr[nk_context]): Unit = !struct.at5 = value
      def scroll_pointer: Ptr[nk_uint] = struct._6
      def scroll_pointer_=(value: Ptr[nk_uint]): Unit = !struct.at6 = value
      def scroll_value: nk_uint = struct._7
      def scroll_value_=(value: nk_uint): Unit = !struct.at7 = value

  opaque type nk_memory = CStruct2[Ptr[Byte], nk_size]
  object nk_memory:
    given _tag: Tag[nk_memory] = Tag.materializeCStruct2Tag[Ptr[Byte], nk_size]
    def apply()(using Zone): Ptr[nk_memory] = scala.scalanative.unsafe.alloc[nk_memory](1)
    def apply(ptr: Ptr[Byte], size: nk_size)(using Zone): Ptr[nk_memory] = 
      val ____ptr = apply()
      (!____ptr).ptr = ptr
      (!____ptr).size = size
      ____ptr
    extension (struct: nk_memory)
      def ptr: Ptr[Byte] = struct._1
      def ptr_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def size: nk_size = struct._2
      def size_=(value: nk_size): Unit = !struct.at2 = value

  opaque type nk_memory_status = CStruct6[Ptr[Byte], CUnsignedInt, nk_size, nk_size, nk_size, nk_size]
  object nk_memory_status:
    given _tag: Tag[nk_memory_status] = Tag.materializeCStruct6Tag[Ptr[Byte], CUnsignedInt, nk_size, nk_size, nk_size, nk_size]
    def apply()(using Zone): Ptr[nk_memory_status] = scala.scalanative.unsafe.alloc[nk_memory_status](1)
    def apply(memory: Ptr[Byte], `type`: CUnsignedInt, size: nk_size, allocated: nk_size, needed: nk_size, calls: nk_size)(using Zone): Ptr[nk_memory_status] = 
      val ____ptr = apply()
      (!____ptr).memory = memory
      (!____ptr).`type` = `type`
      (!____ptr).size = size
      (!____ptr).allocated = allocated
      (!____ptr).needed = needed
      (!____ptr).calls = calls
      ____ptr
    extension (struct: nk_memory_status)
      def memory: Ptr[Byte] = struct._1
      def memory_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def `type`: CUnsignedInt = struct._2
      def type_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def size: nk_size = struct._3
      def size_=(value: nk_size): Unit = !struct.at3 = value
      def allocated: nk_size = struct._4
      def allocated_=(value: nk_size): Unit = !struct.at4 = value
      def needed: nk_size = struct._5
      def needed_=(value: nk_size): Unit = !struct.at5 = value
      def calls: nk_size = struct._6
      def calls_=(value: nk_size): Unit = !struct.at6 = value

  opaque type nk_menu_state = CStruct5[Float, Float, Float, Float, nk_scroll]
  object nk_menu_state:
    given _tag: Tag[nk_menu_state] = Tag.materializeCStruct5Tag[Float, Float, Float, Float, nk_scroll]
    def apply()(using Zone): Ptr[nk_menu_state] = scala.scalanative.unsafe.alloc[nk_menu_state](1)
    def apply(x: Float, y: Float, w: Float, h: Float, offset: nk_scroll)(using Zone): Ptr[nk_menu_state] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      (!____ptr).offset = offset
      ____ptr
    extension (struct: nk_menu_state)
      def x: Float = struct._1
      def x_=(value: Float): Unit = !struct.at1 = value
      def y: Float = struct._2
      def y_=(value: Float): Unit = !struct.at2 = value
      def w: Float = struct._3
      def w_=(value: Float): Unit = !struct.at3 = value
      def h: Float = struct._4
      def h_=(value: Float): Unit = !struct.at4 = value
      def offset: nk_scroll = struct._5
      def offset_=(value: nk_scroll): Unit = !struct.at5 = value

  opaque type nk_mouse = CStruct8[CArray[nk_mouse_button, Nat._4], nk_vec2, nk_vec2, nk_vec2, nk_vec2, CUnsignedChar, CUnsignedChar, CUnsignedChar]
  object nk_mouse:
    given _tag: Tag[nk_mouse] = Tag.materializeCStruct8Tag[CArray[nk_mouse_button, Nat._4], nk_vec2, nk_vec2, nk_vec2, nk_vec2, CUnsignedChar, CUnsignedChar, CUnsignedChar]
    def apply()(using Zone): Ptr[nk_mouse] = scala.scalanative.unsafe.alloc[nk_mouse](1)
    def apply(buttons: CArray[nk_mouse_button, Nat._4], pos: nk_vec2, prev: nk_vec2, delta: nk_vec2, scroll_delta: nk_vec2, grab: CUnsignedChar, grabbed: CUnsignedChar, ungrab: CUnsignedChar)(using Zone): Ptr[nk_mouse] = 
      val ____ptr = apply()
      (!____ptr).buttons = buttons
      (!____ptr).pos = pos
      (!____ptr).prev = prev
      (!____ptr).delta = delta
      (!____ptr).scroll_delta = scroll_delta
      (!____ptr).grab = grab
      (!____ptr).grabbed = grabbed
      (!____ptr).ungrab = ungrab
      ____ptr
    extension (struct: nk_mouse)
      def buttons: CArray[nk_mouse_button, Nat._4] = struct._1
      def buttons_=(value: CArray[nk_mouse_button, Nat._4]): Unit = !struct.at1 = value
      def pos: nk_vec2 = struct._2
      def pos_=(value: nk_vec2): Unit = !struct.at2 = value
      def prev: nk_vec2 = struct._3
      def prev_=(value: nk_vec2): Unit = !struct.at3 = value
      def delta: nk_vec2 = struct._4
      def delta_=(value: nk_vec2): Unit = !struct.at4 = value
      def scroll_delta: nk_vec2 = struct._5
      def scroll_delta_=(value: nk_vec2): Unit = !struct.at5 = value
      def grab: CUnsignedChar = struct._6
      def grab_=(value: CUnsignedChar): Unit = !struct.at6 = value
      def grabbed: CUnsignedChar = struct._7
      def grabbed_=(value: CUnsignedChar): Unit = !struct.at7 = value
      def ungrab: CUnsignedChar = struct._8
      def ungrab_=(value: CUnsignedChar): Unit = !struct.at8 = value

  opaque type nk_mouse_button = CStruct3[nk_bool, CUnsignedInt, nk_vec2]
  object nk_mouse_button:
    given _tag: Tag[nk_mouse_button] = Tag.materializeCStruct3Tag[nk_bool, CUnsignedInt, nk_vec2]
    def apply()(using Zone): Ptr[nk_mouse_button] = scala.scalanative.unsafe.alloc[nk_mouse_button](1)
    def apply(down: nk_bool, clicked: CUnsignedInt, clicked_pos: nk_vec2)(using Zone): Ptr[nk_mouse_button] = 
      val ____ptr = apply()
      (!____ptr).down = down
      (!____ptr).clicked = clicked
      (!____ptr).clicked_pos = clicked_pos
      ____ptr
    extension (struct: nk_mouse_button)
      def down: nk_bool = struct._1
      def down_=(value: nk_bool): Unit = !struct.at1 = value
      def clicked: CUnsignedInt = struct._2
      def clicked_=(value: CUnsignedInt): Unit = !struct.at2 = value
      def clicked_pos: nk_vec2 = struct._3
      def clicked_pos_=(value: nk_vec2): Unit = !struct.at3 = value

  opaque type nk_nine_slice = CStruct5[nk_image, nk_ushort, nk_ushort, nk_ushort, nk_ushort]
  object nk_nine_slice:
    given _tag: Tag[nk_nine_slice] = Tag.materializeCStruct5Tag[nk_image, nk_ushort, nk_ushort, nk_ushort, nk_ushort]
    def apply()(using Zone): Ptr[nk_nine_slice] = scala.scalanative.unsafe.alloc[nk_nine_slice](1)
    def apply(img: nk_image, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): Ptr[nk_nine_slice] = 
      val ____ptr = apply()
      (!____ptr).img = img
      (!____ptr).l = l
      (!____ptr).t = t
      (!____ptr).r = r
      (!____ptr).b = b
      ____ptr
    extension (struct: nk_nine_slice)
      def img: nk_image = struct._1
      def img_=(value: nk_image): Unit = !struct.at1 = value
      def l: nk_ushort = struct._2
      def l_=(value: nk_ushort): Unit = !struct.at2 = value
      def t: nk_ushort = struct._3
      def t_=(value: nk_ushort): Unit = !struct.at3 = value
      def r: nk_ushort = struct._4
      def r_=(value: nk_ushort): Unit = !struct.at4 = value
      def b: nk_ushort = struct._5
      def b_=(value: nk_ushort): Unit = !struct.at5 = value

  opaque type nk_page = CStruct3[CUnsignedInt, Ptr[Byte], CArray[nk_page_element, Nat._1]]
  object nk_page:
    given _tag: Tag[nk_page] = Tag.materializeCStruct3Tag[CUnsignedInt, Ptr[Byte], CArray[nk_page_element, Nat._1]]
    def apply()(using Zone): Ptr[nk_page] = scala.scalanative.unsafe.alloc[nk_page](1)
    def apply(size: CUnsignedInt, next: Ptr[nk_page], win: CArray[nk_page_element, Nat._1])(using Zone): Ptr[nk_page] = 
      val ____ptr = apply()
      (!____ptr).size = size
      (!____ptr).next = next
      (!____ptr).win = win
      ____ptr
    extension (struct: nk_page)
      def size: CUnsignedInt = struct._1
      def size_=(value: CUnsignedInt): Unit = !struct.at1 = value
      def next: Ptr[nk_page] = struct._2.asInstanceOf[Ptr[nk_page]]
      def next_=(value: Ptr[nk_page]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def win: CArray[nk_page_element, Nat._1] = struct._3
      def win_=(value: CArray[nk_page_element, Nat._1]): Unit = !struct.at3 = value

  opaque type nk_page_element = CStruct3[nk_page_data, Ptr[Byte], Ptr[Byte]]
  object nk_page_element:
    given _tag: Tag[nk_page_element] = Tag.materializeCStruct3Tag[nk_page_data, Ptr[Byte], Ptr[Byte]]
    def apply()(using Zone): Ptr[nk_page_element] = scala.scalanative.unsafe.alloc[nk_page_element](1)
    def apply(data: nk_page_data, next: Ptr[nk_page_element], prev: Ptr[nk_page_element])(using Zone): Ptr[nk_page_element] = 
      val ____ptr = apply()
      (!____ptr).data = data
      (!____ptr).next = next
      (!____ptr).prev = prev
      ____ptr
    extension (struct: nk_page_element)
      def data: nk_page_data = struct._1
      def data_=(value: nk_page_data): Unit = !struct.at1 = value
      def next: Ptr[nk_page_element] = struct._2.asInstanceOf[Ptr[nk_page_element]]
      def next_=(value: Ptr[nk_page_element]): Unit = !struct.at2 = value.asInstanceOf[Ptr[Byte]]
      def prev: Ptr[nk_page_element] = struct._3.asInstanceOf[Ptr[nk_page_element]]
      def prev_=(value: Ptr[nk_page_element]): Unit = !struct.at3 = value.asInstanceOf[Ptr[Byte]]

  opaque type nk_panel = CStruct0
  object nk_panel:
    given _tag: Tag[nk_panel] = Tag.materializeCStruct0Tag

  opaque type nk_pool = CStruct8[nk_allocator, nk_allocation_type, CUnsignedInt, Ptr[nk_page], Ptr[nk_page_element], CUnsignedInt, nk_size, nk_size]
  object nk_pool:
    given _tag: Tag[nk_pool] = Tag.materializeCStruct8Tag[nk_allocator, nk_allocation_type, CUnsignedInt, Ptr[nk_page], Ptr[nk_page_element], CUnsignedInt, nk_size, nk_size]
    def apply()(using Zone): Ptr[nk_pool] = scala.scalanative.unsafe.alloc[nk_pool](1)
    def apply(alloc: nk_allocator, `type`: nk_allocation_type, page_count: CUnsignedInt, pages: Ptr[nk_page], freelist: Ptr[nk_page_element], capacity: CUnsignedInt, size: nk_size, cap: nk_size)(using Zone): Ptr[nk_pool] = 
      val ____ptr = apply()
      (!____ptr).alloc = alloc
      (!____ptr).`type` = `type`
      (!____ptr).page_count = page_count
      (!____ptr).pages = pages
      (!____ptr).freelist = freelist
      (!____ptr).capacity = capacity
      (!____ptr).size = size
      (!____ptr).cap = cap
      ____ptr
    extension (struct: nk_pool)
      def alloc: nk_allocator = struct._1
      def alloc_=(value: nk_allocator): Unit = !struct.at1 = value
      def `type`: nk_allocation_type = struct._2
      def type_=(value: nk_allocation_type): Unit = !struct.at2 = value
      def page_count: CUnsignedInt = struct._3
      def page_count_=(value: CUnsignedInt): Unit = !struct.at3 = value
      def pages: Ptr[nk_page] = struct._4
      def pages_=(value: Ptr[nk_page]): Unit = !struct.at4 = value
      def freelist: Ptr[nk_page_element] = struct._5
      def freelist_=(value: Ptr[nk_page_element]): Unit = !struct.at5 = value
      def capacity: CUnsignedInt = struct._6
      def capacity_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def size: nk_size = struct._7
      def size_=(value: nk_size): Unit = !struct.at7 = value
      def cap: nk_size = struct._8
      def cap_=(value: nk_size): Unit = !struct.at8 = value

  opaque type nk_popup_buffer = CStruct5[nk_size, nk_size, nk_size, nk_size, nk_bool]
  object nk_popup_buffer:
    given _tag: Tag[nk_popup_buffer] = Tag.materializeCStruct5Tag[nk_size, nk_size, nk_size, nk_size, nk_bool]
    def apply()(using Zone): Ptr[nk_popup_buffer] = scala.scalanative.unsafe.alloc[nk_popup_buffer](1)
    def apply(begin: nk_size, parent: nk_size, last: nk_size, end: nk_size, active: nk_bool)(using Zone): Ptr[nk_popup_buffer] = 
      val ____ptr = apply()
      (!____ptr).begin = begin
      (!____ptr).parent = parent
      (!____ptr).last = last
      (!____ptr).end = end
      (!____ptr).active = active
      ____ptr
    extension (struct: nk_popup_buffer)
      def begin: nk_size = struct._1
      def begin_=(value: nk_size): Unit = !struct.at1 = value
      def parent: nk_size = struct._2
      def parent_=(value: nk_size): Unit = !struct.at2 = value
      def last: nk_size = struct._3
      def last_=(value: nk_size): Unit = !struct.at3 = value
      def end: nk_size = struct._4
      def end_=(value: nk_size): Unit = !struct.at4 = value
      def active: nk_bool = struct._5
      def active_=(value: nk_bool): Unit = !struct.at5 = value

  opaque type nk_popup_state = CStruct10[Ptr[nk_window], nk_panel_type, nk_popup_buffer, nk_hash, nk_bool, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, nk_rect]
  object nk_popup_state:
    given _tag: Tag[nk_popup_state] = Tag.materializeCStruct10Tag[Ptr[nk_window], nk_panel_type, nk_popup_buffer, nk_hash, nk_bool, CUnsignedInt, CUnsignedInt, CUnsignedInt, CUnsignedInt, nk_rect]
    def apply()(using Zone): Ptr[nk_popup_state] = scala.scalanative.unsafe.alloc[nk_popup_state](1)
    def apply(win: Ptr[nk_window], `type`: nk_panel_type, buf: nk_popup_buffer, name: nk_hash, active: nk_bool, combo_count: CUnsignedInt, con_count: CUnsignedInt, con_old: CUnsignedInt, active_con: CUnsignedInt, header: nk_rect)(using Zone): Ptr[nk_popup_state] = 
      val ____ptr = apply()
      (!____ptr).win = win
      (!____ptr).`type` = `type`
      (!____ptr).buf = buf
      (!____ptr).name = name
      (!____ptr).active = active
      (!____ptr).combo_count = combo_count
      (!____ptr).con_count = con_count
      (!____ptr).con_old = con_old
      (!____ptr).active_con = active_con
      (!____ptr).header = header
      ____ptr
    extension (struct: nk_popup_state)
      def win: Ptr[nk_window] = struct._1
      def win_=(value: Ptr[nk_window]): Unit = !struct.at1 = value
      def `type`: nk_panel_type = struct._2
      def type_=(value: nk_panel_type): Unit = !struct.at2 = value
      def buf: nk_popup_buffer = struct._3
      def buf_=(value: nk_popup_buffer): Unit = !struct.at3 = value
      def name: nk_hash = struct._4
      def name_=(value: nk_hash): Unit = !struct.at4 = value
      def active: nk_bool = struct._5
      def active_=(value: nk_bool): Unit = !struct.at5 = value
      def combo_count: CUnsignedInt = struct._6
      def combo_count_=(value: CUnsignedInt): Unit = !struct.at6 = value
      def con_count: CUnsignedInt = struct._7
      def con_count_=(value: CUnsignedInt): Unit = !struct.at7 = value
      def con_old: CUnsignedInt = struct._8
      def con_old_=(value: CUnsignedInt): Unit = !struct.at8 = value
      def active_con: CUnsignedInt = struct._9
      def active_con_=(value: CUnsignedInt): Unit = !struct.at9 = value
      def header: nk_rect = struct._10
      def header_=(value: nk_rect): Unit = !struct.at10 = value

  opaque type nk_property_state = CStruct11[CInt, CInt, CArray[CChar, Nat.Digit2[Nat._6, Nat._4]], CInt, CInt, CInt, CInt, nk_hash, CUnsignedInt, CUnsignedInt, CInt]
  object nk_property_state:
    given _tag: Tag[nk_property_state] = Tag.materializeCStruct11Tag[CInt, CInt, CArray[CChar, Nat.Digit2[Nat._6, Nat._4]], CInt, CInt, CInt, CInt, nk_hash, CUnsignedInt, CUnsignedInt, CInt]
    def apply()(using Zone): Ptr[nk_property_state] = scala.scalanative.unsafe.alloc[nk_property_state](1)
    def apply(active: CInt, prev: CInt, buffer: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]], length: CInt, cursor: CInt, select_start: CInt, select_end: CInt, name: nk_hash, seq: CUnsignedInt, old: CUnsignedInt, state: CInt)(using Zone): Ptr[nk_property_state] = 
      val ____ptr = apply()
      (!____ptr).active = active
      (!____ptr).prev = prev
      (!____ptr).buffer = buffer
      (!____ptr).length = length
      (!____ptr).cursor = cursor
      (!____ptr).select_start = select_start
      (!____ptr).select_end = select_end
      (!____ptr).name = name
      (!____ptr).seq = seq
      (!____ptr).old = old
      (!____ptr).state = state
      ____ptr
    extension (struct: nk_property_state)
      def active: CInt = struct._1
      def active_=(value: CInt): Unit = !struct.at1 = value
      def prev: CInt = struct._2
      def prev_=(value: CInt): Unit = !struct.at2 = value
      def buffer: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]] = struct._3
      def buffer_=(value: CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]): Unit = !struct.at3 = value
      def length: CInt = struct._4
      def length_=(value: CInt): Unit = !struct.at4 = value
      def cursor: CInt = struct._5
      def cursor_=(value: CInt): Unit = !struct.at5 = value
      def select_start: CInt = struct._6
      def select_start_=(value: CInt): Unit = !struct.at6 = value
      def select_end: CInt = struct._7
      def select_end_=(value: CInt): Unit = !struct.at7 = value
      def name: nk_hash = struct._8
      def name_=(value: nk_hash): Unit = !struct.at8 = value
      def seq: CUnsignedInt = struct._9
      def seq_=(value: CUnsignedInt): Unit = !struct.at9 = value
      def old: CUnsignedInt = struct._10
      def old_=(value: CUnsignedInt): Unit = !struct.at10 = value
      def state: CInt = struct._11
      def state_=(value: CInt): Unit = !struct.at11 = value

  opaque type nk_rect = CStruct4[Float, Float, Float, Float]
  object nk_rect:
    given _tag: Tag[nk_rect] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
    def apply()(using Zone): Ptr[nk_rect] = scala.scalanative.unsafe.alloc[nk_rect](1)
    def apply(x: Float, y: Float, w: Float, h: Float)(using Zone): Ptr[nk_rect] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      ____ptr
    extension (struct: nk_rect)
      def x: Float = struct._1
      def x_=(value: Float): Unit = !struct.at1 = value
      def y: Float = struct._2
      def y_=(value: Float): Unit = !struct.at2 = value
      def w: Float = struct._3
      def w_=(value: Float): Unit = !struct.at3 = value
      def h: Float = struct._4
      def h_=(value: Float): Unit = !struct.at4 = value

  opaque type nk_recti = CStruct4[CShort, CShort, CShort, CShort]
  object nk_recti:
    given _tag: Tag[nk_recti] = Tag.materializeCStruct4Tag[CShort, CShort, CShort, CShort]
    def apply()(using Zone): Ptr[nk_recti] = scala.scalanative.unsafe.alloc[nk_recti](1)
    def apply(x: CShort, y: CShort, w: CShort, h: CShort)(using Zone): Ptr[nk_recti] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      (!____ptr).w = w
      (!____ptr).h = h
      ____ptr
    extension (struct: nk_recti)
      def x: CShort = struct._1
      def x_=(value: CShort): Unit = !struct.at1 = value
      def y: CShort = struct._2
      def y_=(value: CShort): Unit = !struct.at2 = value
      def w: CShort = struct._3
      def w_=(value: CShort): Unit = !struct.at3 = value
      def h: CShort = struct._4
      def h_=(value: CShort): Unit = !struct.at4 = value

  opaque type nk_row_layout = CStruct13[nk_panel_row_layout_type, CInt, Float, Float, CInt, Ptr[Float], Float, Float, Float, Float, nk_rect, CInt, CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
  object nk_row_layout:
    given _tag: Tag[nk_row_layout] = Tag.materializeCStruct13Tag[nk_panel_row_layout_type, CInt, Float, Float, CInt, Ptr[Float], Float, Float, Float, Float, nk_rect, CInt, CArray[Float, Nat.Digit2[Nat._1, Nat._6]]]
    def apply()(using Zone): Ptr[nk_row_layout] = scala.scalanative.unsafe.alloc[nk_row_layout](1)
    def apply(`type`: nk_panel_row_layout_type, index: CInt, height: Float, min_height: Float, columns: CInt, ratio: Ptr[Float], item_width: Float, item_height: Float, item_offset: Float, filled: Float, item: nk_rect, tree_depth: CInt, templates: CArray[Float, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[nk_row_layout] = 
      val ____ptr = apply()
      (!____ptr).`type` = `type`
      (!____ptr).index = index
      (!____ptr).height = height
      (!____ptr).min_height = min_height
      (!____ptr).columns = columns
      (!____ptr).ratio = ratio
      (!____ptr).item_width = item_width
      (!____ptr).item_height = item_height
      (!____ptr).item_offset = item_offset
      (!____ptr).filled = filled
      (!____ptr).item = item
      (!____ptr).tree_depth = tree_depth
      (!____ptr).templates = templates
      ____ptr
    extension (struct: nk_row_layout)
      def `type`: nk_panel_row_layout_type = struct._1
      def type_=(value: nk_panel_row_layout_type): Unit = !struct.at1 = value
      def index: CInt = struct._2
      def index_=(value: CInt): Unit = !struct.at2 = value
      def height: Float = struct._3
      def height_=(value: Float): Unit = !struct.at3 = value
      def min_height: Float = struct._4
      def min_height_=(value: Float): Unit = !struct.at4 = value
      def columns: CInt = struct._5
      def columns_=(value: CInt): Unit = !struct.at5 = value
      def ratio: Ptr[Float] = struct._6
      def ratio_=(value: Ptr[Float]): Unit = !struct.at6 = value
      def item_width: Float = struct._7
      def item_width_=(value: Float): Unit = !struct.at7 = value
      def item_height: Float = struct._8
      def item_height_=(value: Float): Unit = !struct.at8 = value
      def item_offset: Float = struct._9
      def item_offset_=(value: Float): Unit = !struct.at9 = value
      def filled: Float = struct._10
      def filled_=(value: Float): Unit = !struct.at10 = value
      def item: nk_rect = struct._11
      def item_=(value: nk_rect): Unit = !struct.at11 = value
      def tree_depth: CInt = struct._12
      def tree_depth_=(value: CInt): Unit = !struct.at12 = value
      def templates: CArray[Float, Nat.Digit2[Nat._1, Nat._6]] = struct._13
      def templates_=(value: CArray[Float, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at13 = value

  opaque type nk_scroll = CStruct2[nk_uint, nk_uint]
  object nk_scroll:
    given _tag: Tag[nk_scroll] = Tag.materializeCStruct2Tag[nk_uint, nk_uint]
    def apply()(using Zone): Ptr[nk_scroll] = scala.scalanative.unsafe.alloc[nk_scroll](1)
    def apply(x: nk_uint, y: nk_uint)(using Zone): Ptr[nk_scroll] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      ____ptr
    extension (struct: nk_scroll)
      def x: nk_uint = struct._1
      def x_=(value: nk_uint): Unit = !struct.at1 = value
      def y: nk_uint = struct._2
      def y_=(value: nk_uint): Unit = !struct.at2 = value

  opaque type nk_str = CStruct2[nk_buffer, CInt]
  object nk_str:
    given _tag: Tag[nk_str] = Tag.materializeCStruct2Tag[nk_buffer, CInt]
    def apply()(using Zone): Ptr[nk_str] = scala.scalanative.unsafe.alloc[nk_str](1)
    def apply(buffer: nk_buffer, len: CInt)(using Zone): Ptr[nk_str] = 
      val ____ptr = apply()
      (!____ptr).buffer = buffer
      (!____ptr).len = len
      ____ptr
    extension (struct: nk_str)
      def buffer: nk_buffer = struct._1
      def buffer_=(value: nk_buffer): Unit = !struct.at1 = value
      def len: CInt = struct._2
      def len_=(value: CInt): Unit = !struct.at2 = value

  opaque type nk_style = CStruct22[Ptr[nk_user_font], CArray[Ptr[nk_cursor], Nat._7], Ptr[nk_cursor], Ptr[nk_cursor], CInt, nk_style_text, nk_style_button, nk_style_button, nk_style_button, nk_style_toggle, nk_style_toggle, nk_style_selectable, nk_style_slider, nk_style_progress, nk_style_property, nk_style_edit, nk_style_chart, nk_style_scrollbar, nk_style_scrollbar, nk_style_tab, nk_style_combo, nk_style_window]
  object nk_style:
    given _tag: Tag[nk_style] = Tag.materializeCStruct22Tag[Ptr[nk_user_font], CArray[Ptr[nk_cursor], Nat._7], Ptr[nk_cursor], Ptr[nk_cursor], CInt, nk_style_text, nk_style_button, nk_style_button, nk_style_button, nk_style_toggle, nk_style_toggle, nk_style_selectable, nk_style_slider, nk_style_progress, nk_style_property, nk_style_edit, nk_style_chart, nk_style_scrollbar, nk_style_scrollbar, nk_style_tab, nk_style_combo, nk_style_window]
    def apply()(using Zone): Ptr[nk_style] = scala.scalanative.unsafe.alloc[nk_style](1)
    def apply(font: Ptr[nk_user_font], cursors: CArray[Ptr[nk_cursor], Nat._7], cursor_active: Ptr[nk_cursor], cursor_last: Ptr[nk_cursor], cursor_visible: CInt, text: nk_style_text, button: nk_style_button, contextual_button: nk_style_button, menu_button: nk_style_button, option: nk_style_toggle, checkbox: nk_style_toggle, selectable: nk_style_selectable, slider: nk_style_slider, progress: nk_style_progress, property: nk_style_property, edit: nk_style_edit, chart: nk_style_chart, scrollh: nk_style_scrollbar, scrollv: nk_style_scrollbar, tab: nk_style_tab, combo: nk_style_combo, window: nk_style_window)(using Zone): Ptr[nk_style] = 
      val ____ptr = apply()
      (!____ptr).font = font
      (!____ptr).cursors = cursors
      (!____ptr).cursor_active = cursor_active
      (!____ptr).cursor_last = cursor_last
      (!____ptr).cursor_visible = cursor_visible
      (!____ptr).text = text
      (!____ptr).button = button
      (!____ptr).contextual_button = contextual_button
      (!____ptr).menu_button = menu_button
      (!____ptr).option = option
      (!____ptr).checkbox = checkbox
      (!____ptr).selectable = selectable
      (!____ptr).slider = slider
      (!____ptr).progress = progress
      (!____ptr).property = property
      (!____ptr).edit = edit
      (!____ptr).chart = chart
      (!____ptr).scrollh = scrollh
      (!____ptr).scrollv = scrollv
      (!____ptr).tab = tab
      (!____ptr).combo = combo
      (!____ptr).window = window
      ____ptr
    extension (struct: nk_style)
      def font: Ptr[nk_user_font] = struct._1
      def font_=(value: Ptr[nk_user_font]): Unit = !struct.at1 = value
      def cursors: CArray[Ptr[nk_cursor], Nat._7] = struct._2
      def cursors_=(value: CArray[Ptr[nk_cursor], Nat._7]): Unit = !struct.at2 = value
      def cursor_active: Ptr[nk_cursor] = struct._3
      def cursor_active_=(value: Ptr[nk_cursor]): Unit = !struct.at3 = value
      def cursor_last: Ptr[nk_cursor] = struct._4
      def cursor_last_=(value: Ptr[nk_cursor]): Unit = !struct.at4 = value
      def cursor_visible: CInt = struct._5
      def cursor_visible_=(value: CInt): Unit = !struct.at5 = value
      def text: nk_style_text = struct._6
      def text_=(value: nk_style_text): Unit = !struct.at6 = value
      def button: nk_style_button = struct._7
      def button_=(value: nk_style_button): Unit = !struct.at7 = value
      def contextual_button: nk_style_button = struct._8
      def contextual_button_=(value: nk_style_button): Unit = !struct.at8 = value
      def menu_button: nk_style_button = struct._9
      def menu_button_=(value: nk_style_button): Unit = !struct.at9 = value
      def option: nk_style_toggle = struct._10
      def option_=(value: nk_style_toggle): Unit = !struct.at10 = value
      def checkbox: nk_style_toggle = struct._11
      def checkbox_=(value: nk_style_toggle): Unit = !struct.at11 = value
      def selectable: nk_style_selectable = struct._12
      def selectable_=(value: nk_style_selectable): Unit = !struct.at12 = value
      def slider: nk_style_slider = struct._13
      def slider_=(value: nk_style_slider): Unit = !struct.at13 = value
      def progress: nk_style_progress = struct._14
      def progress_=(value: nk_style_progress): Unit = !struct.at14 = value
      def property: nk_style_property = struct._15
      def property_=(value: nk_style_property): Unit = !struct.at15 = value
      def edit: nk_style_edit = struct._16
      def edit_=(value: nk_style_edit): Unit = !struct.at16 = value
      def chart: nk_style_chart = struct._17
      def chart_=(value: nk_style_chart): Unit = !struct.at17 = value
      def scrollh: nk_style_scrollbar = struct._18
      def scrollh_=(value: nk_style_scrollbar): Unit = !struct.at18 = value
      def scrollv: nk_style_scrollbar = struct._19
      def scrollv_=(value: nk_style_scrollbar): Unit = !struct.at19 = value
      def tab: nk_style_tab = struct._20
      def tab_=(value: nk_style_tab): Unit = !struct.at20 = value
      def combo: nk_style_combo = struct._21
      def combo_=(value: nk_style_combo): Unit = !struct.at21 = value
      def window: nk_style_window = struct._22
      def window_=(value: nk_style_window): Unit = !struct.at22 = value

  opaque type nk_style_button = CStruct0
  object nk_style_button:
    given _tag: Tag[nk_style_button] = Tag.materializeCStruct0Tag

  opaque type nk_style_chart = CStruct0
  object nk_style_chart:
    given _tag: Tag[nk_style_chart] = Tag.materializeCStruct0Tag

  opaque type nk_style_combo = CStruct0
  object nk_style_combo:
    given _tag: Tag[nk_style_combo] = Tag.materializeCStruct0Tag

  opaque type nk_style_edit = CStruct0
  object nk_style_edit:
    given _tag: Tag[nk_style_edit] = Tag.materializeCStruct0Tag

  opaque type nk_style_item = CStruct0
  object nk_style_item:
    given _tag: Tag[nk_style_item] = Tag.materializeCStruct0Tag

  opaque type nk_style_progress = CStruct0
  object nk_style_progress:
    given _tag: Tag[nk_style_progress] = Tag.materializeCStruct0Tag

  opaque type nk_style_property = CStruct0
  object nk_style_property:
    given _tag: Tag[nk_style_property] = Tag.materializeCStruct0Tag

  opaque type nk_style_scrollbar = CStruct0
  object nk_style_scrollbar:
    given _tag: Tag[nk_style_scrollbar] = Tag.materializeCStruct0Tag

  opaque type nk_style_selectable = CStruct0
  object nk_style_selectable:
    given _tag: Tag[nk_style_selectable] = Tag.materializeCStruct0Tag

  opaque type nk_style_slide = CStruct0
  object nk_style_slide:
    given _tag: Tag[nk_style_slide] = Tag.materializeCStruct0Tag

  opaque type nk_style_slider = CArray[Byte, Nat.Digit2[Nat._9, Nat._6]]
  object nk_style_slider:
    given _tag: Tag[nk_style_slider] = Tag.CArray[CChar, Nat.Digit2[Nat._9, Nat._6]](Tag.Byte, Tag.Digit2[Nat._9, Nat._6](Tag.Nat9, Tag.Nat6))
    def apply()(using Zone): Ptr[nk_style_slider] = scala.scalanative.unsafe.alloc[nk_style_slider](1)
    def apply(normal: nk_style_item, hover: nk_style_item, active: nk_style_item, border_color: nk_color, bar_normal: nk_color, bar_hover: nk_color, bar_active: nk_color, bar_filled: nk_color, cursor_normal: nk_style_item, cursor_hover: nk_style_item, cursor_active: nk_style_item, border: Float, rounding: Float, bar_height: Float, padding: nk_vec2, spacing: nk_vec2, cursor_size: nk_vec2, show_buttons: CInt, inc_button: nk_style_button, dec_button: nk_style_button, inc_symbol: nk_symbol_type, dec_symbol: nk_symbol_type, userdata: nk_handle, draw_begin: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]], draw_end: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]])(using Zone): Ptr[nk_style_slider] = 
      val ____ptr = apply()
      (!____ptr).normal = normal
      (!____ptr).hover = hover
      (!____ptr).active = active
      (!____ptr).border_color = border_color
      (!____ptr).bar_normal = bar_normal
      (!____ptr).bar_hover = bar_hover
      (!____ptr).bar_active = bar_active
      (!____ptr).bar_filled = bar_filled
      (!____ptr).cursor_normal = cursor_normal
      (!____ptr).cursor_hover = cursor_hover
      (!____ptr).cursor_active = cursor_active
      (!____ptr).border = border
      (!____ptr).rounding = rounding
      (!____ptr).bar_height = bar_height
      (!____ptr).padding = padding
      (!____ptr).spacing = spacing
      (!____ptr).cursor_size = cursor_size
      (!____ptr).show_buttons = show_buttons
      (!____ptr).inc_button = inc_button
      (!____ptr).dec_button = dec_button
      (!____ptr).inc_symbol = inc_symbol
      (!____ptr).dec_symbol = dec_symbol
      (!____ptr).userdata = userdata
      (!____ptr).draw_begin = draw_begin
      (!____ptr).draw_end = draw_end
      ____ptr
    extension (struct: nk_style_slider)
      def normal: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
      def normal_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
      def hover: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
      def hover_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
      def active: nk_style_item = !struct.at(0).asInstanceOf[Ptr[nk_style_item]]
      def active_=(value: nk_style_item): Unit = !struct.at(0).asInstanceOf[Ptr[nk_style_item]] = value
      def border_color: nk_color = !struct.at(0).asInstanceOf[Ptr[nk_color]]
      def border_color_=(value: nk_color): Unit = !struct.at(0).asInstanceOf[Ptr[nk_color]] = value
      def bar_normal: nk_color = !struct.at(4).asInstanceOf[Ptr[nk_color]]
      def bar_normal_=(value: nk_color): Unit = !struct.at(4).asInstanceOf[Ptr[nk_color]] = value
      def bar_hover: nk_color = !struct.at(8).asInstanceOf[Ptr[nk_color]]
      def bar_hover_=(value: nk_color): Unit = !struct.at(8).asInstanceOf[Ptr[nk_color]] = value
      def bar_active: nk_color = !struct.at(12).asInstanceOf[Ptr[nk_color]]
      def bar_active_=(value: nk_color): Unit = !struct.at(12).asInstanceOf[Ptr[nk_color]] = value
      def bar_filled: nk_color = !struct.at(16).asInstanceOf[Ptr[nk_color]]
      def bar_filled_=(value: nk_color): Unit = !struct.at(16).asInstanceOf[Ptr[nk_color]] = value
      def cursor_normal: nk_style_item = !struct.at(20).asInstanceOf[Ptr[nk_style_item]]
      def cursor_normal_=(value: nk_style_item): Unit = !struct.at(20).asInstanceOf[Ptr[nk_style_item]] = value
      def cursor_hover: nk_style_item = !struct.at(20).asInstanceOf[Ptr[nk_style_item]]
      def cursor_hover_=(value: nk_style_item): Unit = !struct.at(20).asInstanceOf[Ptr[nk_style_item]] = value
      def cursor_active: nk_style_item = !struct.at(20).asInstanceOf[Ptr[nk_style_item]]
      def cursor_active_=(value: nk_style_item): Unit = !struct.at(20).asInstanceOf[Ptr[nk_style_item]] = value
      def border: Float = !struct.at(20).asInstanceOf[Ptr[Float]]
      def border_=(value: Float): Unit = !struct.at(20).asInstanceOf[Ptr[Float]] = value
      def rounding: Float = !struct.at(24).asInstanceOf[Ptr[Float]]
      def rounding_=(value: Float): Unit = !struct.at(24).asInstanceOf[Ptr[Float]] = value
      def bar_height: Float = !struct.at(28).asInstanceOf[Ptr[Float]]
      def bar_height_=(value: Float): Unit = !struct.at(28).asInstanceOf[Ptr[Float]] = value
      def padding: nk_vec2 = !struct.at(32).asInstanceOf[Ptr[nk_vec2]]
      def padding_=(value: nk_vec2): Unit = !struct.at(32).asInstanceOf[Ptr[nk_vec2]] = value
      def spacing: nk_vec2 = !struct.at(40).asInstanceOf[Ptr[nk_vec2]]
      def spacing_=(value: nk_vec2): Unit = !struct.at(40).asInstanceOf[Ptr[nk_vec2]] = value
      def cursor_size: nk_vec2 = !struct.at(48).asInstanceOf[Ptr[nk_vec2]]
      def cursor_size_=(value: nk_vec2): Unit = !struct.at(48).asInstanceOf[Ptr[nk_vec2]] = value
      def show_buttons: CInt = !struct.at(56).asInstanceOf[Ptr[CInt]]
      def show_buttons_=(value: CInt): Unit = !struct.at(56).asInstanceOf[Ptr[CInt]] = value
      def inc_button: nk_style_button = !struct.at(60).asInstanceOf[Ptr[nk_style_button]]
      def inc_button_=(value: nk_style_button): Unit = !struct.at(60).asInstanceOf[Ptr[nk_style_button]] = value
      def dec_button: nk_style_button = !struct.at(60).asInstanceOf[Ptr[nk_style_button]]
      def dec_button_=(value: nk_style_button): Unit = !struct.at(60).asInstanceOf[Ptr[nk_style_button]] = value
      def inc_symbol: nk_symbol_type = !struct.at(60).asInstanceOf[Ptr[nk_symbol_type]]
      def inc_symbol_=(value: nk_symbol_type): Unit = !struct.at(60).asInstanceOf[Ptr[nk_symbol_type]] = value
      def dec_symbol: nk_symbol_type = !struct.at(64).asInstanceOf[Ptr[nk_symbol_type]]
      def dec_symbol_=(value: nk_symbol_type): Unit = !struct.at(64).asInstanceOf[Ptr[nk_symbol_type]] = value
      def userdata: nk_handle = !struct.at(68).asInstanceOf[Ptr[nk_handle]]
      def userdata_=(value: nk_handle): Unit = !struct.at(68).asInstanceOf[Ptr[nk_handle]] = value
      def draw_begin: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]] = !struct.at(80).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]]
      def draw_begin_=(value: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]): Unit = !struct.at(80).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]] = value
      def draw_end: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]] = !struct.at(88).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]]
      def draw_end_=(value: Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]): Unit = !struct.at(88).asInstanceOf[Ptr[Ptr[CFuncPtr2[Ptr[nk_command_buffer], nk_handle, Unit]]]] = value

  opaque type nk_style_tab = CStruct0
  object nk_style_tab:
    given _tag: Tag[nk_style_tab] = Tag.materializeCStruct0Tag

  opaque type nk_style_text = CStruct2[nk_color, nk_vec2]
  object nk_style_text:
    given _tag: Tag[nk_style_text] = Tag.materializeCStruct2Tag[nk_color, nk_vec2]
    def apply()(using Zone): Ptr[nk_style_text] = scala.scalanative.unsafe.alloc[nk_style_text](1)
    def apply(color: nk_color, padding: nk_vec2)(using Zone): Ptr[nk_style_text] = 
      val ____ptr = apply()
      (!____ptr).color = color
      (!____ptr).padding = padding
      ____ptr
    extension (struct: nk_style_text)
      def color: nk_color = struct._1
      def color_=(value: nk_color): Unit = !struct.at1 = value
      def padding: nk_vec2 = struct._2
      def padding_=(value: nk_vec2): Unit = !struct.at2 = value

  opaque type nk_style_toggle = CStruct0
  object nk_style_toggle:
    given _tag: Tag[nk_style_toggle] = Tag.materializeCStruct0Tag

  opaque type nk_style_window = CStruct0
  object nk_style_window:
    given _tag: Tag[nk_style_window] = Tag.materializeCStruct0Tag

  opaque type nk_style_window_header = CStruct0
  object nk_style_window_header:
    given _tag: Tag[nk_style_window_header] = Tag.materializeCStruct0Tag

  opaque type nk_table = CStruct0
  object nk_table:
    given _tag: Tag[nk_table] = Tag.materializeCStruct0Tag

  opaque type nk_text_edit = CStruct0
  object nk_text_edit:
    given _tag: Tag[nk_text_edit] = Tag.materializeCStruct0Tag

  opaque type nk_text_undo_record = CStruct4[CInt, CShort, CShort, CShort]
  object nk_text_undo_record:
    given _tag: Tag[nk_text_undo_record] = Tag.materializeCStruct4Tag[CInt, CShort, CShort, CShort]
    def apply()(using Zone): Ptr[nk_text_undo_record] = scala.scalanative.unsafe.alloc[nk_text_undo_record](1)
    def apply(where: CInt, insert_length: CShort, delete_length: CShort, char_storage: CShort)(using Zone): Ptr[nk_text_undo_record] = 
      val ____ptr = apply()
      (!____ptr).where = where
      (!____ptr).insert_length = insert_length
      (!____ptr).delete_length = delete_length
      (!____ptr).char_storage = char_storage
      ____ptr
    extension (struct: nk_text_undo_record)
      def where: CInt = struct._1
      def where_=(value: CInt): Unit = !struct.at1 = value
      def insert_length: CShort = struct._2
      def insert_length_=(value: CShort): Unit = !struct.at2 = value
      def delete_length: CShort = struct._3
      def delete_length_=(value: CShort): Unit = !struct.at3 = value
      def char_storage: CShort = struct._4
      def char_storage_=(value: CShort): Unit = !struct.at4 = value

  opaque type nk_text_undo_state = CStruct6[CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]], CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]], CShort, CShort, CShort, CShort]
  object nk_text_undo_state:
    given _tag: Tag[nk_text_undo_state] = Tag.materializeCStruct6Tag[CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]], CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]], CShort, CShort, CShort, CShort]
    def apply()(using Zone): Ptr[nk_text_undo_state] = scala.scalanative.unsafe.alloc[nk_text_undo_state](1)
    def apply(undo_rec: CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]], undo_char: CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]], undo_point: CShort, redo_point: CShort, undo_char_point: CShort, redo_char_point: CShort)(using Zone): Ptr[nk_text_undo_state] = 
      val ____ptr = apply()
      (!____ptr).undo_rec = undo_rec
      (!____ptr).undo_char = undo_char
      (!____ptr).undo_point = undo_point
      (!____ptr).redo_point = redo_point
      (!____ptr).undo_char_point = undo_char_point
      (!____ptr).redo_char_point = redo_char_point
      ____ptr
    extension (struct: nk_text_undo_state)
      def undo_rec: CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]] = struct._1
      def undo_rec_=(value: CArray[nk_text_undo_record, Nat.Digit2[Nat._9, Nat._9]]): Unit = !struct.at1 = value
      def undo_char: CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]] = struct._2
      def undo_char_=(value: CArray[nk_rune, Nat.Digit3[Nat._9, Nat._9, Nat._9]]): Unit = !struct.at2 = value
      def undo_point: CShort = struct._3
      def undo_point_=(value: CShort): Unit = !struct.at3 = value
      def redo_point: CShort = struct._4
      def redo_point_=(value: CShort): Unit = !struct.at4 = value
      def undo_char_point: CShort = struct._5
      def undo_char_point_=(value: CShort): Unit = !struct.at5 = value
      def redo_char_point: CShort = struct._6
      def redo_char_point_=(value: CShort): Unit = !struct.at6 = value

  opaque type nk_user_font = CStruct0
  object nk_user_font:
    given _tag: Tag[nk_user_font] = Tag.materializeCStruct0Tag

  opaque type nk_user_font_glyph = CStruct0
  object nk_user_font_glyph:
    given _tag: Tag[nk_user_font_glyph] = Tag.materializeCStruct0Tag

  opaque type nk_vec2 = CStruct2[Float, Float]
  object nk_vec2:
    given _tag: Tag[nk_vec2] = Tag.materializeCStruct2Tag[Float, Float]
    def apply()(using Zone): Ptr[nk_vec2] = scala.scalanative.unsafe.alloc[nk_vec2](1)
    def apply(x: Float, y: Float)(using Zone): Ptr[nk_vec2] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      ____ptr
    extension (struct: nk_vec2)
      def x: Float = struct._1
      def x_=(value: Float): Unit = !struct.at1 = value
      def y: Float = struct._2
      def y_=(value: Float): Unit = !struct.at2 = value

  opaque type nk_vec2i = CStruct2[CShort, CShort]
  object nk_vec2i:
    given _tag: Tag[nk_vec2i] = Tag.materializeCStruct2Tag[CShort, CShort]
    def apply()(using Zone): Ptr[nk_vec2i] = scala.scalanative.unsafe.alloc[nk_vec2i](1)
    def apply(x: CShort, y: CShort)(using Zone): Ptr[nk_vec2i] = 
      val ____ptr = apply()
      (!____ptr).x = x
      (!____ptr).y = y
      ____ptr
    extension (struct: nk_vec2i)
      def x: CShort = struct._1
      def x_=(value: CShort): Unit = !struct.at1 = value
      def y: CShort = struct._2
      def y_=(value: CShort): Unit = !struct.at2 = value

  opaque type nk_window = CStruct0
  object nk_window:
    given _tag: Tag[nk_window] = Tag.materializeCStruct0Tag
  opaque type nk_handle = CArray[Byte, Nat._8]
  object nk_handle:
    given _tag: Tag[nk_handle] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    extension (struct: nk_handle)
      def ptr: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def id: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]

  opaque type nk_page_data = CArray[Byte, Nat._0]
  object nk_page_data:
    given _tag: Tag[nk_page_data] = Tag.CArray[CChar, Nat._0](Tag.Byte, Tag.Nat0)
    extension (struct: nk_page_data)
      def tbl: nk_table = !struct.at(0).asInstanceOf[Ptr[nk_table]]
      def pan: nk_panel = !struct.at(0).asInstanceOf[Ptr[nk_panel]]
      def win: nk_window = !struct.at(0).asInstanceOf[Ptr[nk_window]]

  opaque type nk_style_item_data = CArray[Byte, Nat.Digit2[Nat._2, Nat._8]]
  object nk_style_item_data:
    given _tag: Tag[nk_style_item_data] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._8]](Tag.Byte, Tag.Digit2[Nat._2, Nat._8](Tag.Nat2, Tag.Nat8))
    extension (struct: nk_style_item_data)
      def color: nk_color = !struct.at(0).asInstanceOf[Ptr[nk_color]]
      def image: nk_image = !struct.at(0).asInstanceOf[Ptr[nk_image]]
      def slice: nk_nine_slice = !struct.at(0).asInstanceOf[Ptr[nk_nine_slice]]
@link("nuklear")
@extern
private[libnuklear] object extern_functions: 
  import types.*

  @name("__sn_wrap_nk_begin")
  private[libnuklear] def __sn_wrap_nk_begin(ctx: Ptr[nk_context], title: CString, bounds: Ptr[nk_rect], flags: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_begin_titled")
  private[libnuklear] def __sn_wrap_nk_begin_titled(ctx: Ptr[nk_context], name: CString, title: CString, bounds: Ptr[nk_rect], flags: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_button_color")
  private[libnuklear] def __sn_wrap_nk_button_color(_0: Ptr[nk_context], _1: Ptr[nk_color]): nk_bool = extern

  @name("__sn_wrap_nk_button_image")
  private[libnuklear] def __sn_wrap_nk_button_image(_0: Ptr[nk_context], img: Ptr[nk_image]): nk_bool = extern

  @name("__sn_wrap_nk_button_image_label")
  private[libnuklear] def __sn_wrap_nk_button_image_label(_0: Ptr[nk_context], img: Ptr[nk_image], _2: CString, text_alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_button_image_label_styled")
  private[libnuklear] def __sn_wrap_nk_button_image_label_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: Ptr[nk_image], _3: CString, text_alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_button_image_styled")
  private[libnuklear] def __sn_wrap_nk_button_image_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: Ptr[nk_image]): nk_bool = extern

  @name("__sn_wrap_nk_button_image_text")
  private[libnuklear] def __sn_wrap_nk_button_image_text(_0: Ptr[nk_context], img: Ptr[nk_image], _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_button_image_text_styled")
  private[libnuklear] def __sn_wrap_nk_button_image_text_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: Ptr[nk_image], _3: CString, _4: CInt, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_chart_add_slot_colored")
  private[libnuklear] def __sn_wrap_nk_chart_add_slot_colored(ctx: Ptr[nk_context], _1: nk_chart_type, _2: Ptr[nk_color], active: Ptr[nk_color], count: CInt, min_value: Float, max_value: Float): Unit = extern

  @name("__sn_wrap_nk_chart_begin_colored")
  private[libnuklear] def __sn_wrap_nk_chart_begin_colored(_0: Ptr[nk_context], _1: nk_chart_type, _2: Ptr[nk_color], active: Ptr[nk_color], num: CInt, min: Float, max: Float): nk_bool = extern

  @name("__sn_wrap_nk_color_cf")
  private[libnuklear] def __sn_wrap_nk_color_cf(_0: Ptr[nk_color], __return: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_color_d")
  private[libnuklear] def __sn_wrap_nk_color_d(r: Ptr[Double], g: Ptr[Double], b: Ptr[Double], a: Ptr[Double], _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_dv")
  private[libnuklear] def __sn_wrap_nk_color_dv(rgba_out: Ptr[Double], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_f")
  private[libnuklear] def __sn_wrap_nk_color_f(r: Ptr[Float], g: Ptr[Float], b: Ptr[Float], a: Ptr[Float], _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_fv")
  private[libnuklear] def __sn_wrap_nk_color_fv(rgba_out: Ptr[Float], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hex_rgb")
  private[libnuklear] def __sn_wrap_nk_color_hex_rgb(output: CString, _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hex_rgba")
  private[libnuklear] def __sn_wrap_nk_color_hex_rgba(output: CString, _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_b")
  private[libnuklear] def __sn_wrap_nk_color_hsv_b(out_h: Ptr[nk_byte], out_s: Ptr[nk_byte], out_v: Ptr[nk_byte], _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_bv")
  private[libnuklear] def __sn_wrap_nk_color_hsv_bv(hsv_out: Ptr[nk_byte], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_f")
  private[libnuklear] def __sn_wrap_nk_color_hsv_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_fv")
  private[libnuklear] def __sn_wrap_nk_color_hsv_fv(hsv_out: Ptr[Float], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_i")
  private[libnuklear] def __sn_wrap_nk_color_hsv_i(out_h: Ptr[CInt], out_s: Ptr[CInt], out_v: Ptr[CInt], _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsv_iv")
  private[libnuklear] def __sn_wrap_nk_color_hsv_iv(hsv_out: Ptr[CInt], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_b")
  private[libnuklear] def __sn_wrap_nk_color_hsva_b(h: Ptr[nk_byte], s: Ptr[nk_byte], v: Ptr[nk_byte], a: Ptr[nk_byte], _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_bv")
  private[libnuklear] def __sn_wrap_nk_color_hsva_bv(hsva_out: Ptr[nk_byte], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_f")
  private[libnuklear] def __sn_wrap_nk_color_hsva_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], out_a: Ptr[Float], _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_fv")
  private[libnuklear] def __sn_wrap_nk_color_hsva_fv(hsva_out: Ptr[Float], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_i")
  private[libnuklear] def __sn_wrap_nk_color_hsva_i(h: Ptr[CInt], s: Ptr[CInt], v: Ptr[CInt], a: Ptr[CInt], _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_hsva_iv")
  private[libnuklear] def __sn_wrap_nk_color_hsva_iv(hsva_out: Ptr[CInt], _1: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_color_picker")
  private[libnuklear] def __sn_wrap_nk_color_picker(_0: Ptr[nk_context], _1: Ptr[nk_colorf], _2: nk_color_format, __return: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_color_u32")
  private[libnuklear] def __sn_wrap_nk_color_u32(_0: Ptr[nk_color]): nk_uint = extern

  @name("__sn_wrap_nk_colorf_hsva_f")
  private[libnuklear] def __sn_wrap_nk_colorf_hsva_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], out_a: Ptr[Float], in: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_colorf_hsva_fv")
  private[libnuklear] def __sn_wrap_nk_colorf_hsva_fv(hsva: Ptr[Float], in: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_combo")
  private[libnuklear] def __sn_wrap_nk_combo(_0: Ptr[nk_context], items: Ptr[CString], count: CInt, selected: CInt, item_height: CInt, size: Ptr[nk_vec2]): CInt = extern

  @name("__sn_wrap_nk_combo_begin_color")
  private[libnuklear] def __sn_wrap_nk_combo_begin_color(_0: Ptr[nk_context], color: Ptr[nk_color], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_image")
  private[libnuklear] def __sn_wrap_nk_combo_begin_image(_0: Ptr[nk_context], img: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_image_label")
  private[libnuklear] def __sn_wrap_nk_combo_begin_image_label(_0: Ptr[nk_context], selected: CString, _2: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_image_text")
  private[libnuklear] def __sn_wrap_nk_combo_begin_image_text(_0: Ptr[nk_context], selected: CString, _2: CInt, _3: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_label")
  private[libnuklear] def __sn_wrap_nk_combo_begin_label(_0: Ptr[nk_context], selected: CString, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_symbol")
  private[libnuklear] def __sn_wrap_nk_combo_begin_symbol(_0: Ptr[nk_context], _1: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_symbol_label")
  private[libnuklear] def __sn_wrap_nk_combo_begin_symbol_label(_0: Ptr[nk_context], selected: CString, _2: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_symbol_text")
  private[libnuklear] def __sn_wrap_nk_combo_begin_symbol_text(_0: Ptr[nk_context], selected: CString, _2: CInt, _3: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_begin_text")
  private[libnuklear] def __sn_wrap_nk_combo_begin_text(_0: Ptr[nk_context], selected: CString, _2: CInt, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_combo_callback")
  private[libnuklear] def __sn_wrap_nk_combo_callback(_0: Ptr[nk_context], item_getter: Ptr[CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit]], userdata: Ptr[Byte], selected: CInt, count: CInt, item_height: CInt, size: Ptr[nk_vec2]): CInt = extern

  @name("__sn_wrap_nk_combo_item_image_label")
  private[libnuklear] def __sn_wrap_nk_combo_item_image_label(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_combo_item_image_text")
  private[libnuklear] def __sn_wrap_nk_combo_item_image_text(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_combo_separator")
  private[libnuklear] def __sn_wrap_nk_combo_separator(_0: Ptr[nk_context], items_separated_by_separator: CString, separator: CInt, selected: CInt, count: CInt, item_height: CInt, size: Ptr[nk_vec2]): CInt = extern

  @name("__sn_wrap_nk_combo_string")
  private[libnuklear] def __sn_wrap_nk_combo_string(_0: Ptr[nk_context], items_separated_by_zeros: CString, selected: CInt, count: CInt, item_height: CInt, size: Ptr[nk_vec2]): CInt = extern

  @name("__sn_wrap_nk_combobox")
  private[libnuklear] def __sn_wrap_nk_combobox(_0: Ptr[nk_context], items: Ptr[CString], count: CInt, selected: Ptr[CInt], item_height: CInt, size: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_combobox_callback")
  private[libnuklear] def __sn_wrap_nk_combobox_callback(_0: Ptr[nk_context], item_getter: Ptr[CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit]], _2: Ptr[Byte], selected: Ptr[CInt], count: CInt, item_height: CInt, size: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_combobox_separator")
  private[libnuklear] def __sn_wrap_nk_combobox_separator(_0: Ptr[nk_context], items_separated_by_separator: CString, separator: CInt, selected: Ptr[CInt], count: CInt, item_height: CInt, size: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_combobox_string")
  private[libnuklear] def __sn_wrap_nk_combobox_string(_0: Ptr[nk_context], items_separated_by_zeros: CString, selected: Ptr[CInt], count: CInt, item_height: CInt, size: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_contextual_begin")
  private[libnuklear] def __sn_wrap_nk_contextual_begin(_0: Ptr[nk_context], _1: nk_flags, _2: Ptr[nk_vec2], trigger_bounds: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_contextual_item_image_label")
  private[libnuklear] def __sn_wrap_nk_contextual_item_image_label(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_contextual_item_image_text")
  private[libnuklear] def __sn_wrap_nk_contextual_item_image_text(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, len: CInt, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_draw_image")
  private[libnuklear] def __sn_wrap_nk_draw_image(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], _2: Ptr[nk_image], _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_draw_nine_slice")
  private[libnuklear] def __sn_wrap_nk_draw_nine_slice(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], _2: Ptr[nk_nine_slice], _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_draw_text")
  private[libnuklear] def __sn_wrap_nk_draw_text(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], text: CString, len: CInt, _4: Ptr[nk_user_font], _5: Ptr[nk_color], _6: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_arc")
  private[libnuklear] def __sn_wrap_nk_fill_arc(_0: Ptr[nk_command_buffer], cx: Float, cy: Float, radius: Float, a_min: Float, a_max: Float, _6: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_circle")
  private[libnuklear] def __sn_wrap_nk_fill_circle(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], _2: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_polygon")
  private[libnuklear] def __sn_wrap_nk_fill_polygon(_0: Ptr[nk_command_buffer], _1: Ptr[Float], point_count: CInt, _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_rect")
  private[libnuklear] def __sn_wrap_nk_fill_rect(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], rounding: Float, _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_rect_multi_color")
  private[libnuklear] def __sn_wrap_nk_fill_rect_multi_color(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], left: Ptr[nk_color], top: Ptr[nk_color], right: Ptr[nk_color], bottom: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_fill_triangle")
  private[libnuklear] def __sn_wrap_nk_fill_triangle(_0: Ptr[nk_command_buffer], x0: Float, y0: Float, x1: Float, y1: Float, x2: Float, y2: Float, _7: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_get_null_rect")
  private[libnuklear] def __sn_wrap_nk_get_null_rect(__return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_hsv")
  private[libnuklear] def __sn_wrap_nk_hsv(h: CInt, s: CInt, v: CInt, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsv_bv")
  private[libnuklear] def __sn_wrap_nk_hsv_bv(hsv: Ptr[nk_byte], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsv_f")
  private[libnuklear] def __sn_wrap_nk_hsv_f(h: Float, s: Float, v: Float, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsv_fv")
  private[libnuklear] def __sn_wrap_nk_hsv_fv(hsv: Ptr[Float], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsv_iv")
  private[libnuklear] def __sn_wrap_nk_hsv_iv(hsv: Ptr[CInt], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsva")
  private[libnuklear] def __sn_wrap_nk_hsva(h: CInt, s: CInt, v: CInt, a: CInt, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsva_bv")
  private[libnuklear] def __sn_wrap_nk_hsva_bv(hsva: Ptr[nk_byte], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsva_colorf")
  private[libnuklear] def __sn_wrap_nk_hsva_colorf(h: Float, s: Float, v: Float, a: Float, __return: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_hsva_colorfv")
  private[libnuklear] def __sn_wrap_nk_hsva_colorfv(c: Ptr[Float], __return: Ptr[nk_colorf]): Unit = extern

  @name("__sn_wrap_nk_hsva_f")
  private[libnuklear] def __sn_wrap_nk_hsva_f(h: Float, s: Float, v: Float, a: Float, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsva_fv")
  private[libnuklear] def __sn_wrap_nk_hsva_fv(hsva: Ptr[Float], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_hsva_iv")
  private[libnuklear] def __sn_wrap_nk_hsva_iv(hsva: Ptr[CInt], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_image")
  private[libnuklear] def __sn_wrap_nk_image(_0: Ptr[nk_context], _1: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_image_color")
  private[libnuklear] def __sn_wrap_nk_image_color(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_image_handle")
  private[libnuklear] def __sn_wrap_nk_image_handle(_0: nk_handle, __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_image_id")
  private[libnuklear] def __sn_wrap_nk_image_id(_0: CInt, __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_image_ptr")
  private[libnuklear] def __sn_wrap_nk_image_ptr(_0: Ptr[Byte], __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_input_any_mouse_click_in_rect")
  private[libnuklear] def __sn_wrap_nk_input_any_mouse_click_in_rect(_0: Ptr[nk_input], _1: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_has_mouse_click_down_in_rect")
  private[libnuklear] def __sn_wrap_nk_input_has_mouse_click_down_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: Ptr[nk_rect], down: nk_bool): nk_bool = extern

  @name("__sn_wrap_nk_input_has_mouse_click_in_rect")
  private[libnuklear] def __sn_wrap_nk_input_has_mouse_click_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_is_mouse_click_down_in_rect")
  private[libnuklear] def __sn_wrap_nk_input_is_mouse_click_down_in_rect(i: Ptr[nk_input], id: nk_buttons, b: Ptr[nk_rect], down: nk_bool): nk_bool = extern

  @name("__sn_wrap_nk_input_is_mouse_click_in_rect")
  private[libnuklear] def __sn_wrap_nk_input_is_mouse_click_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_is_mouse_hovering_rect")
  private[libnuklear] def __sn_wrap_nk_input_is_mouse_hovering_rect(_0: Ptr[nk_input], _1: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_is_mouse_prev_hovering_rect")
  private[libnuklear] def __sn_wrap_nk_input_is_mouse_prev_hovering_rect(_0: Ptr[nk_input], _1: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_mouse_clicked")
  private[libnuklear] def __sn_wrap_nk_input_mouse_clicked(_0: Ptr[nk_input], _1: nk_buttons, _2: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_input_scroll")
  private[libnuklear] def __sn_wrap_nk_input_scroll(_0: Ptr[nk_context], `val`: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_label_colored")
  private[libnuklear] def __sn_wrap_nk_label_colored(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_label_colored_wrap")
  private[libnuklear] def __sn_wrap_nk_label_colored_wrap(_0: Ptr[nk_context], _1: CString, _2: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_layout_space_bounds")
  private[libnuklear] def __sn_wrap_nk_layout_space_bounds(_0: Ptr[nk_context], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_layout_space_push")
  private[libnuklear] def __sn_wrap_nk_layout_space_push(_0: Ptr[nk_context], bounds: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_layout_space_rect_to_local")
  private[libnuklear] def __sn_wrap_nk_layout_space_rect_to_local(_0: Ptr[nk_context], _1: Ptr[nk_rect], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_layout_space_rect_to_screen")
  private[libnuklear] def __sn_wrap_nk_layout_space_rect_to_screen(_0: Ptr[nk_context], _1: Ptr[nk_rect], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_layout_space_to_local")
  private[libnuklear] def __sn_wrap_nk_layout_space_to_local(_0: Ptr[nk_context], _1: Ptr[nk_vec2], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_layout_space_to_screen")
  private[libnuklear] def __sn_wrap_nk_layout_space_to_screen(_0: Ptr[nk_context], _1: Ptr[nk_vec2], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_layout_widget_bounds")
  private[libnuklear] def __sn_wrap_nk_layout_widget_bounds(_0: Ptr[nk_context], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_menu_begin_image")
  private[libnuklear] def __sn_wrap_nk_menu_begin_image(_0: Ptr[nk_context], _1: CString, _2: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_image_label")
  private[libnuklear] def __sn_wrap_nk_menu_begin_image_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_image_text")
  private[libnuklear] def __sn_wrap_nk_menu_begin_image_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, _4: Ptr[nk_image], size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_label")
  private[libnuklear] def __sn_wrap_nk_menu_begin_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_symbol")
  private[libnuklear] def __sn_wrap_nk_menu_begin_symbol(_0: Ptr[nk_context], _1: CString, _2: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_symbol_label")
  private[libnuklear] def __sn_wrap_nk_menu_begin_symbol_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_symbol_text")
  private[libnuklear] def __sn_wrap_nk_menu_begin_symbol_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, _4: nk_symbol_type, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_begin_text")
  private[libnuklear] def __sn_wrap_nk_menu_begin_text(_0: Ptr[nk_context], title: CString, title_len: CInt, align: nk_flags, size: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_menu_item_image_label")
  private[libnuklear] def __sn_wrap_nk_menu_item_image_label(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_menu_item_image_text")
  private[libnuklear] def __sn_wrap_nk_menu_item_image_text(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, len: CInt, alignment: nk_flags): nk_bool = extern

  @name("__sn_wrap_nk_nine_slice_handle")
  private[libnuklear] def __sn_wrap_nk_nine_slice_handle(_0: nk_handle, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_nine_slice_id")
  private[libnuklear] def __sn_wrap_nk_nine_slice_id(_0: CInt, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_nine_slice_ptr")
  private[libnuklear] def __sn_wrap_nk_nine_slice_ptr(_0: Ptr[Byte], l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_popup_begin")
  private[libnuklear] def __sn_wrap_nk_popup_begin(_0: Ptr[nk_context], _1: nk_popup_type, _2: CString, _3: nk_flags, bounds: Ptr[nk_rect]): nk_bool = extern

  @name("__sn_wrap_nk_push_custom")
  private[libnuklear] def __sn_wrap_nk_push_custom(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], _2: nk_command_custom_callback, usr: nk_handle): Unit = extern

  @name("__sn_wrap_nk_push_scissor")
  private[libnuklear] def __sn_wrap_nk_push_scissor(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_rect")
  private[libnuklear] def __sn_wrap_nk_rect(x: Float, y: Float, w: Float, h: Float, __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_rect_pos")
  private[libnuklear] def __sn_wrap_nk_rect_pos(_0: Ptr[nk_rect], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_rect_size")
  private[libnuklear] def __sn_wrap_nk_rect_size(_0: Ptr[nk_rect], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_recta")
  private[libnuklear] def __sn_wrap_nk_recta(pos: Ptr[nk_vec2], size: Ptr[nk_vec2], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_recti")
  private[libnuklear] def __sn_wrap_nk_recti(x: CInt, y: CInt, w: CInt, h: CInt, __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_rectiv")
  private[libnuklear] def __sn_wrap_nk_rectiv(xywh: Ptr[CInt], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_rectv")
  private[libnuklear] def __sn_wrap_nk_rectv(xywh: Ptr[Float], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_rgb")
  private[libnuklear] def __sn_wrap_nk_rgb(r: CInt, g: CInt, b: CInt, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_bv")
  private[libnuklear] def __sn_wrap_nk_rgb_bv(rgb: Ptr[nk_byte], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_cf")
  private[libnuklear] def __sn_wrap_nk_rgb_cf(c: Ptr[nk_colorf], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_f")
  private[libnuklear] def __sn_wrap_nk_rgb_f(r: Float, g: Float, b: Float, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_fv")
  private[libnuklear] def __sn_wrap_nk_rgb_fv(rgb: Ptr[Float], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_hex")
  private[libnuklear] def __sn_wrap_nk_rgb_hex(rgb: CString, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgb_iv")
  private[libnuklear] def __sn_wrap_nk_rgb_iv(rgb: Ptr[CInt], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba")
  private[libnuklear] def __sn_wrap_nk_rgba(r: CInt, g: CInt, b: CInt, a: CInt, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_bv")
  private[libnuklear] def __sn_wrap_nk_rgba_bv(rgba: Ptr[nk_byte], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_cf")
  private[libnuklear] def __sn_wrap_nk_rgba_cf(c: Ptr[nk_colorf], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_f")
  private[libnuklear] def __sn_wrap_nk_rgba_f(r: Float, g: Float, b: Float, a: Float, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_fv")
  private[libnuklear] def __sn_wrap_nk_rgba_fv(rgba: Ptr[Float], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_hex")
  private[libnuklear] def __sn_wrap_nk_rgba_hex(rgb: CString, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_iv")
  private[libnuklear] def __sn_wrap_nk_rgba_iv(rgba: Ptr[CInt], __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_rgba_u32")
  private[libnuklear] def __sn_wrap_nk_rgba_u32(_0: nk_uint, __return: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_select_image_label")
  private[libnuklear] def __sn_wrap_nk_select_image_label(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, align: nk_flags, value: nk_bool): nk_bool = extern

  @name("__sn_wrap_nk_select_image_text")
  private[libnuklear] def __sn_wrap_nk_select_image_text(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, _3: CInt, align: nk_flags, value: nk_bool): nk_bool = extern

  @name("__sn_wrap_nk_selectable_image_label")
  private[libnuklear] def __sn_wrap_nk_selectable_image_label(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  @name("__sn_wrap_nk_selectable_image_text")
  private[libnuklear] def __sn_wrap_nk_selectable_image_text(_0: Ptr[nk_context], _1: Ptr[nk_image], _2: CString, _3: CInt, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  @name("__sn_wrap_nk_stroke_arc")
  private[libnuklear] def __sn_wrap_nk_stroke_arc(_0: Ptr[nk_command_buffer], cx: Float, cy: Float, radius: Float, a_min: Float, a_max: Float, line_thickness: Float, _7: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_circle")
  private[libnuklear] def __sn_wrap_nk_stroke_circle(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], line_thickness: Float, _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_curve")
  private[libnuklear] def __sn_wrap_nk_stroke_curve(_0: Ptr[nk_command_buffer], _1: Float, _2: Float, _3: Float, _4: Float, _5: Float, _6: Float, _7: Float, _8: Float, line_thickness: Float, _10: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_line")
  private[libnuklear] def __sn_wrap_nk_stroke_line(b: Ptr[nk_command_buffer], x0: Float, y0: Float, x1: Float, y1: Float, line_thickness: Float, _6: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_polygon")
  private[libnuklear] def __sn_wrap_nk_stroke_polygon(_0: Ptr[nk_command_buffer], _1: Ptr[Float], point_count: CInt, line_thickness: Float, _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_polyline")
  private[libnuklear] def __sn_wrap_nk_stroke_polyline(_0: Ptr[nk_command_buffer], points: Ptr[Float], point_count: CInt, line_thickness: Float, col: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_rect")
  private[libnuklear] def __sn_wrap_nk_stroke_rect(_0: Ptr[nk_command_buffer], _1: Ptr[nk_rect], rounding: Float, line_thickness: Float, _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_stroke_triangle")
  private[libnuklear] def __sn_wrap_nk_stroke_triangle(_0: Ptr[nk_command_buffer], _1: Float, _2: Float, _3: Float, _4: Float, _5: Float, _6: Float, line_thichness: Float, _8: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_style_item_color")
  private[libnuklear] def __sn_wrap_nk_style_item_color(_0: Ptr[nk_color], __return: Ptr[nk_style_item]): Unit = extern

  @name("__sn_wrap_nk_style_item_hide")
  private[libnuklear] def __sn_wrap_nk_style_item_hide(__return: Ptr[nk_style_item]): Unit = extern

  @name("__sn_wrap_nk_style_item_image")
  private[libnuklear] def __sn_wrap_nk_style_item_image(img: Ptr[nk_image], __return: Ptr[nk_style_item]): Unit = extern

  @name("__sn_wrap_nk_style_item_nine_slice")
  private[libnuklear] def __sn_wrap_nk_style_item_nine_slice(slice: Ptr[nk_nine_slice], __return: Ptr[nk_style_item]): Unit = extern

  @name("__sn_wrap_nk_style_push_color")
  private[libnuklear] def __sn_wrap_nk_style_push_color(_0: Ptr[nk_context], _1: Ptr[nk_color], _2: Ptr[nk_color]): nk_bool = extern

  @name("__sn_wrap_nk_style_push_style_item")
  private[libnuklear] def __sn_wrap_nk_style_push_style_item(_0: Ptr[nk_context], _1: Ptr[nk_style_item], _2: Ptr[nk_style_item]): nk_bool = extern

  @name("__sn_wrap_nk_style_push_vec2")
  private[libnuklear] def __sn_wrap_nk_style_push_vec2(_0: Ptr[nk_context], _1: Ptr[nk_vec2], _2: Ptr[nk_vec2]): nk_bool = extern

  @name("__sn_wrap_nk_sub9slice_handle")
  private[libnuklear] def __sn_wrap_nk_sub9slice_handle(_0: nk_handle, w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_sub9slice_id")
  private[libnuklear] def __sn_wrap_nk_sub9slice_id(_0: CInt, w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_sub9slice_ptr")
  private[libnuklear] def __sn_wrap_nk_sub9slice_ptr(_0: Ptr[Byte], w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort, __return: Ptr[nk_nine_slice]): Unit = extern

  @name("__sn_wrap_nk_subimage_handle")
  private[libnuklear] def __sn_wrap_nk_subimage_handle(_0: nk_handle, w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_subimage_id")
  private[libnuklear] def __sn_wrap_nk_subimage_id(_0: CInt, w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_subimage_ptr")
  private[libnuklear] def __sn_wrap_nk_subimage_ptr(_0: Ptr[Byte], w: nk_ushort, h: nk_ushort, sub_region: Ptr[nk_rect], __return: Ptr[nk_image]): Unit = extern

  @name("__sn_wrap_nk_text_colored")
  private[libnuklear] def __sn_wrap_nk_text_colored(_0: Ptr[nk_context], _1: CString, _2: CInt, _3: nk_flags, _4: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_text_wrap_colored")
  private[libnuklear] def __sn_wrap_nk_text_wrap_colored(_0: Ptr[nk_context], _1: CString, _2: CInt, _3: Ptr[nk_color]): Unit = extern

  @name("__sn_wrap_nk_tree_element_image_push_hashed")
  private[libnuklear] def __sn_wrap_nk_tree_element_image_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, _2: Ptr[nk_image], title: CString, initial_state: nk_collapse_states, selected: Ptr[nk_bool], hash: CString, len: CInt, seed: CInt): nk_bool = extern

  @name("__sn_wrap_nk_tree_image_push_hashed")
  private[libnuklear] def __sn_wrap_nk_tree_image_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, _2: Ptr[nk_image], title: CString, initial_state: nk_collapse_states, hash: CString, len: CInt, seed: CInt): nk_bool = extern

  @name("__sn_wrap_nk_tree_state_image_push")
  private[libnuklear] def __sn_wrap_nk_tree_state_image_push(_0: Ptr[nk_context], _1: nk_tree_type, _2: Ptr[nk_image], title: CString, state: Ptr[nk_collapse_states]): nk_bool = extern

  @name("__sn_wrap_nk_triangle_from_direction")
  private[libnuklear] def __sn_wrap_nk_triangle_from_direction(result: Ptr[nk_vec2], r: Ptr[nk_rect], pad_x: Float, pad_y: Float, _4: nk_heading): Unit = extern

  @name("__sn_wrap_nk_vec2")
  private[libnuklear] def __sn_wrap_nk_vec2(x: Float, y: Float, __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_vec2i")
  private[libnuklear] def __sn_wrap_nk_vec2i(x: CInt, y: CInt, __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_vec2iv")
  private[libnuklear] def __sn_wrap_nk_vec2iv(xy: Ptr[CInt], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_vec2v")
  private[libnuklear] def __sn_wrap_nk_vec2v(xy: Ptr[Float], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_widget_bounds")
  private[libnuklear] def __sn_wrap_nk_widget_bounds(_0: Ptr[nk_context], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_widget_fitting")
  private[libnuklear] def __sn_wrap_nk_widget_fitting(_0: Ptr[nk_rect], _1: Ptr[nk_context], _2: Ptr[nk_vec2]): nk_widget_layout_states = extern

  @name("__sn_wrap_nk_widget_position")
  private[libnuklear] def __sn_wrap_nk_widget_position(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_widget_size")
  private[libnuklear] def __sn_wrap_nk_widget_size(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_get_bounds")
  private[libnuklear] def __sn_wrap_nk_window_get_bounds(ctx: Ptr[nk_context], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_window_get_content_region")
  private[libnuklear] def __sn_wrap_nk_window_get_content_region(_0: Ptr[nk_context], __return: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_window_get_content_region_max")
  private[libnuklear] def __sn_wrap_nk_window_get_content_region_max(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_get_content_region_min")
  private[libnuklear] def __sn_wrap_nk_window_get_content_region_min(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_get_content_region_size")
  private[libnuklear] def __sn_wrap_nk_window_get_content_region_size(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_get_position")
  private[libnuklear] def __sn_wrap_nk_window_get_position(ctx: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_get_size")
  private[libnuklear] def __sn_wrap_nk_window_get_size(_0: Ptr[nk_context], __return: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_set_bounds")
  private[libnuklear] def __sn_wrap_nk_window_set_bounds(_0: Ptr[nk_context], name: CString, bounds: Ptr[nk_rect]): Unit = extern

  @name("__sn_wrap_nk_window_set_position")
  private[libnuklear] def __sn_wrap_nk_window_set_position(_0: Ptr[nk_context], name: CString, pos: Ptr[nk_vec2]): Unit = extern

  @name("__sn_wrap_nk_window_set_size")
  private[libnuklear] def __sn_wrap_nk_window_set_size(_0: Ptr[nk_context], name: CString, _2: Ptr[nk_vec2]): Unit = extern

  def nk__begin(_0: Ptr[nk_context]): Ptr[nk_command] = extern

  def nk__next(_0: Ptr[nk_context], _1: Ptr[nk_command]): Ptr[nk_command] = extern

  def nk_buffer_clear(_0: Ptr[nk_buffer]): Unit = extern

  def nk_buffer_free(_0: Ptr[nk_buffer]): Unit = extern

  def nk_buffer_info(_0: Ptr[nk_memory_status], _1: Ptr[nk_buffer]): Unit = extern

  def nk_buffer_init(_0: Ptr[nk_buffer], _1: Ptr[nk_allocator], size: nk_size): Unit = extern

  def nk_buffer_init_fixed(_0: Ptr[nk_buffer], memory: Ptr[Byte], size: nk_size): Unit = extern

  def nk_buffer_mark(_0: Ptr[nk_buffer], `type`: nk_buffer_allocation_type): Unit = extern

  def nk_buffer_memory(_0: Ptr[nk_buffer]): Ptr[Byte] = extern

  def nk_buffer_memory_const(_0: Ptr[nk_buffer]): Ptr[Byte] = extern

  def nk_buffer_push(_0: Ptr[nk_buffer], `type`: nk_buffer_allocation_type, memory: Ptr[Byte], size: nk_size, align: nk_size): Unit = extern

  def nk_buffer_reset(_0: Ptr[nk_buffer], `type`: nk_buffer_allocation_type): Unit = extern

  def nk_buffer_total(_0: Ptr[nk_buffer]): nk_size = extern

  def nk_button_label(_0: Ptr[nk_context], title: CString): nk_bool = extern

  def nk_button_label_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], title: CString): nk_bool = extern

  def nk_button_pop_behavior(_0: Ptr[nk_context]): nk_bool = extern

  def nk_button_push_behavior(_0: Ptr[nk_context], _1: nk_button_behavior): nk_bool = extern

  def nk_button_set_behavior(_0: Ptr[nk_context], _1: nk_button_behavior): Unit = extern

  def nk_button_symbol(_0: Ptr[nk_context], _1: nk_symbol_type): nk_bool = extern

  def nk_button_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, text_alignment: nk_flags): nk_bool = extern

  def nk_button_symbol_label_styled(ctx: Ptr[nk_context], style: Ptr[nk_style_button], symbol: nk_symbol_type, title: CString, align: nk_flags): nk_bool = extern

  def nk_button_symbol_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], _2: nk_symbol_type): nk_bool = extern

  def nk_button_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  def nk_button_symbol_text_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], _2: nk_symbol_type, _3: CString, _4: CInt, alignment: nk_flags): nk_bool = extern

  def nk_button_text(_0: Ptr[nk_context], title: CString, len: CInt): nk_bool = extern

  def nk_button_text_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], title: CString, len: CInt): nk_bool = extern

  def nk_chart_add_slot(ctx: Ptr[nk_context], _1: nk_chart_type, count: CInt, min_value: Float, max_value: Float): Unit = extern

  def nk_chart_begin(_0: Ptr[nk_context], _1: nk_chart_type, num: CInt, min: Float, max: Float): nk_bool = extern

  def nk_chart_end(_0: Ptr[nk_context]): Unit = extern

  def nk_chart_push(_0: Ptr[nk_context], _1: Float): nk_flags = extern

  def nk_chart_push_slot(_0: Ptr[nk_context], _1: Float, _2: CInt): nk_flags = extern

  def nk_check_flags_label(_0: Ptr[nk_context], _1: CString, flags: CUnsignedInt, value: CUnsignedInt): CUnsignedInt = extern

  def nk_check_flags_text(_0: Ptr[nk_context], _1: CString, _2: CInt, flags: CUnsignedInt, value: CUnsignedInt): CUnsignedInt = extern

  def nk_check_label(_0: Ptr[nk_context], _1: CString, active: nk_bool): nk_bool = extern

  def nk_check_text(_0: Ptr[nk_context], _1: CString, _2: CInt, active: nk_bool): nk_bool = extern

  def nk_checkbox_flags_label(_0: Ptr[nk_context], _1: CString, flags: Ptr[CUnsignedInt], value: CUnsignedInt): nk_bool = extern

  def nk_checkbox_flags_text(_0: Ptr[nk_context], _1: CString, _2: CInt, flags: Ptr[CUnsignedInt], value: CUnsignedInt): nk_bool = extern

  def nk_checkbox_label(_0: Ptr[nk_context], _1: CString, active: Ptr[nk_bool]): nk_bool = extern

  def nk_checkbox_text(_0: Ptr[nk_context], _1: CString, _2: CInt, active: Ptr[nk_bool]): nk_bool = extern

  def nk_clear(_0: Ptr[nk_context]): Unit = extern

  def nk_color_pick(_0: Ptr[nk_context], _1: Ptr[nk_colorf], _2: nk_color_format): nk_bool = extern

  def nk_combo_close(_0: Ptr[nk_context]): Unit = extern

  def nk_combo_end(_0: Ptr[nk_context]): Unit = extern

  def nk_combo_item_label(_0: Ptr[nk_context], _1: CString, alignment: nk_flags): nk_bool = extern

  def nk_combo_item_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, alignment: nk_flags): nk_bool = extern

  def nk_combo_item_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  def nk_combo_item_text(_0: Ptr[nk_context], _1: CString, _2: CInt, alignment: nk_flags): nk_bool = extern

  def nk_contextual_close(_0: Ptr[nk_context]): Unit = extern

  def nk_contextual_end(_0: Ptr[nk_context]): Unit = extern

  def nk_contextual_item_label(_0: Ptr[nk_context], _1: CString, align: nk_flags): nk_bool = extern

  def nk_contextual_item_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, alignment: nk_flags): nk_bool = extern

  def nk_contextual_item_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  def nk_contextual_item_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags): nk_bool = extern

  def nk_edit_buffer(_0: Ptr[nk_context], _1: nk_flags, _2: Ptr[nk_text_edit], _3: nk_plugin_filter): nk_flags = extern

  def nk_edit_focus(_0: Ptr[nk_context], flags: nk_flags): Unit = extern

  def nk_edit_string(_0: Ptr[nk_context], _1: nk_flags, buffer: CString, len: Ptr[CInt], max: CInt, _5: nk_plugin_filter): nk_flags = extern

  def nk_edit_string_zero_terminated(_0: Ptr[nk_context], _1: nk_flags, buffer: CString, max: CInt, _4: nk_plugin_filter): nk_flags = extern

  def nk_edit_unfocus(_0: Ptr[nk_context]): Unit = extern

  def nk_end(ctx: Ptr[nk_context]): Unit = extern

  def nk_filter_ascii(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_binary(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_decimal(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_default(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_float(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_hex(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_filter_oct(_0: Ptr[nk_text_edit], unicode: nk_rune): nk_bool = extern

  def nk_free(_0: Ptr[nk_context]): Unit = extern

  def nk_group_begin(_0: Ptr[nk_context], title: CString, _2: nk_flags): nk_bool = extern

  def nk_group_begin_titled(_0: Ptr[nk_context], name: CString, title: CString, _3: nk_flags): nk_bool = extern

  def nk_group_end(_0: Ptr[nk_context]): Unit = extern

  def nk_group_get_scroll(_0: Ptr[nk_context], id: CString, x_offset: Ptr[nk_uint], y_offset: Ptr[nk_uint]): Unit = extern

  def nk_group_scrolled_begin(_0: Ptr[nk_context], off: Ptr[nk_scroll], title: CString, _3: nk_flags): nk_bool = extern

  def nk_group_scrolled_end(_0: Ptr[nk_context]): Unit = extern

  def nk_group_scrolled_offset_begin(_0: Ptr[nk_context], x_offset: Ptr[nk_uint], y_offset: Ptr[nk_uint], title: CString, flags: nk_flags): nk_bool = extern

  def nk_group_set_scroll(_0: Ptr[nk_context], id: CString, x_offset: nk_uint, y_offset: nk_uint): Unit = extern

  def nk_handle_id(_0: CInt): nk_handle = extern

  def nk_handle_ptr(_0: Ptr[Byte]): nk_handle = extern

  def nk_image_is_subimage(img: Ptr[nk_image]): nk_bool = extern

  def nk_init(_0: Ptr[nk_context], _1: Ptr[nk_allocator], _2: Ptr[nk_user_font]): nk_bool = extern

  def nk_init_custom(_0: Ptr[nk_context], cmds: Ptr[nk_buffer], pool: Ptr[nk_buffer], _3: Ptr[nk_user_font]): nk_bool = extern

  def nk_init_fixed(_0: Ptr[nk_context], memory: Ptr[Byte], size: nk_size, _3: Ptr[nk_user_font]): nk_bool = extern

  def nk_input_begin(_0: Ptr[nk_context]): Unit = extern

  def nk_input_button(_0: Ptr[nk_context], _1: nk_buttons, x: CInt, y: CInt, down: nk_bool): Unit = extern

  def nk_input_char(_0: Ptr[nk_context], _1: CChar): Unit = extern

  def nk_input_end(_0: Ptr[nk_context]): Unit = extern

  def nk_input_glyph(_0: Ptr[nk_context], _1: nk_glyph): Unit = extern

  def nk_input_has_mouse_click(_0: Ptr[nk_input], _1: nk_buttons): nk_bool = extern

  def nk_input_is_key_down(_0: Ptr[nk_input], _1: nk_keys): nk_bool = extern

  def nk_input_is_key_pressed(_0: Ptr[nk_input], _1: nk_keys): nk_bool = extern

  def nk_input_is_key_released(_0: Ptr[nk_input], _1: nk_keys): nk_bool = extern

  def nk_input_is_mouse_down(_0: Ptr[nk_input], _1: nk_buttons): nk_bool = extern

  def nk_input_is_mouse_pressed(_0: Ptr[nk_input], _1: nk_buttons): nk_bool = extern

  def nk_input_is_mouse_released(_0: Ptr[nk_input], _1: nk_buttons): nk_bool = extern

  def nk_input_key(_0: Ptr[nk_context], _1: nk_keys, down: nk_bool): Unit = extern

  def nk_input_motion(_0: Ptr[nk_context], x: CInt, y: CInt): Unit = extern

  def nk_input_unicode(_0: Ptr[nk_context], _1: nk_rune): Unit = extern

  def nk_item_is_any_active(_0: Ptr[nk_context]): nk_bool = extern

  def nk_label(_0: Ptr[nk_context], _1: CString, align: nk_flags): Unit = extern

  def nk_label_wrap(_0: Ptr[nk_context], _1: CString): Unit = extern

  def nk_layout_ratio_from_pixel(_0: Ptr[nk_context], pixel_width: Float): Float = extern

  def nk_layout_reset_min_row_height(_0: Ptr[nk_context]): Unit = extern

  def nk_layout_row(_0: Ptr[nk_context], _1: nk_layout_format, height: Float, cols: CInt, ratio: Ptr[Float]): Unit = extern

  def nk_layout_row_begin(ctx: Ptr[nk_context], fmt: nk_layout_format, row_height: Float, cols: CInt): Unit = extern

  def nk_layout_row_dynamic(ctx: Ptr[nk_context], height: Float, cols: CInt): Unit = extern

  def nk_layout_row_end(_0: Ptr[nk_context]): Unit = extern

  def nk_layout_row_push(_0: Ptr[nk_context], value: Float): Unit = extern

  def nk_layout_row_static(ctx: Ptr[nk_context], height: Float, item_width: CInt, cols: CInt): Unit = extern

  def nk_layout_row_template_begin(_0: Ptr[nk_context], row_height: Float): Unit = extern

  def nk_layout_row_template_end(_0: Ptr[nk_context]): Unit = extern

  def nk_layout_row_template_push_dynamic(_0: Ptr[nk_context]): Unit = extern

  def nk_layout_row_template_push_static(_0: Ptr[nk_context], width: Float): Unit = extern

  def nk_layout_row_template_push_variable(_0: Ptr[nk_context], min_width: Float): Unit = extern

  def nk_layout_set_min_row_height(_0: Ptr[nk_context], height: Float): Unit = extern

  def nk_layout_space_begin(_0: Ptr[nk_context], _1: nk_layout_format, height: Float, widget_count: CInt): Unit = extern

  def nk_layout_space_end(_0: Ptr[nk_context]): Unit = extern

  def nk_list_view_begin(_0: Ptr[nk_context], out: Ptr[nk_list_view], id: CString, _3: nk_flags, row_height: CInt, row_count: CInt): nk_bool = extern

  def nk_list_view_end(_0: Ptr[nk_list_view]): Unit = extern

  def nk_menu_close(_0: Ptr[nk_context]): Unit = extern

  def nk_menu_end(_0: Ptr[nk_context]): Unit = extern

  def nk_menu_item_label(_0: Ptr[nk_context], _1: CString, alignment: nk_flags): nk_bool = extern

  def nk_menu_item_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, alignment: nk_flags): nk_bool = extern

  def nk_menu_item_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, alignment: nk_flags): nk_bool = extern

  def nk_menu_item_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags): nk_bool = extern

  def nk_menubar_begin(_0: Ptr[nk_context]): Unit = extern

  def nk_menubar_end(_0: Ptr[nk_context]): Unit = extern

  def nk_murmur_hash(key: Ptr[Byte], len: CInt, seed: nk_hash): nk_hash = extern

  def nk_nine_slice_is_sub9slice(img: Ptr[nk_nine_slice]): CInt = extern

  def nk_option_label(_0: Ptr[nk_context], _1: CString, active: nk_bool): nk_bool = extern

  def nk_option_text(_0: Ptr[nk_context], _1: CString, _2: CInt, active: nk_bool): nk_bool = extern

  def nk_plot(_0: Ptr[nk_context], _1: nk_chart_type, values: Ptr[Float], count: CInt, offset: CInt): Unit = extern

  def nk_plot_function(_0: Ptr[nk_context], _1: nk_chart_type, userdata: Ptr[Byte], value_getter: Ptr[CFuncPtr2[Ptr[Byte], CInt, Float]], count: CInt, offset: CInt): Unit = extern

  def nk_popup_close(_0: Ptr[nk_context]): Unit = extern

  def nk_popup_end(_0: Ptr[nk_context]): Unit = extern

  def nk_popup_get_scroll(_0: Ptr[nk_context], offset_x: Ptr[nk_uint], offset_y: Ptr[nk_uint]): Unit = extern

  def nk_popup_set_scroll(_0: Ptr[nk_context], offset_x: nk_uint, offset_y: nk_uint): Unit = extern

  def nk_prog(_0: Ptr[nk_context], cur: nk_size, max: nk_size, modifyable: nk_bool): nk_size = extern

  def nk_progress(_0: Ptr[nk_context], cur: Ptr[nk_size], max: nk_size, modifyable: nk_bool): nk_bool = extern

  def nk_property_double(_0: Ptr[nk_context], name: CString, min: Double, `val`: Ptr[Double], max: Double, step: Double, inc_per_pixel: Float): Unit = extern

  def nk_property_float(_0: Ptr[nk_context], name: CString, min: Float, `val`: Ptr[Float], max: Float, step: Float, inc_per_pixel: Float): Unit = extern

  def nk_property_int(_0: Ptr[nk_context], name: CString, min: CInt, `val`: Ptr[CInt], max: CInt, step: CInt, inc_per_pixel: Float): Unit = extern

  def nk_propertyd(_0: Ptr[nk_context], name: CString, min: Double, `val`: Double, max: Double, step: Double, inc_per_pixel: Float): Double = extern

  def nk_propertyf(_0: Ptr[nk_context], name: CString, min: Float, `val`: Float, max: Float, step: Float, inc_per_pixel: Float): Float = extern

  def nk_propertyi(_0: Ptr[nk_context], name: CString, min: CInt, `val`: CInt, max: CInt, step: CInt, inc_per_pixel: Float): CInt = extern

  def nk_radio_label(_0: Ptr[nk_context], _1: CString, active: Ptr[nk_bool]): nk_bool = extern

  def nk_radio_text(_0: Ptr[nk_context], _1: CString, _2: CInt, active: Ptr[nk_bool]): nk_bool = extern

  def nk_select_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, value: nk_bool): nk_bool = extern

  def nk_select_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, align: nk_flags, value: nk_bool): nk_bool = extern

  def nk_select_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, align: nk_flags, value: nk_bool): nk_bool = extern

  def nk_select_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, value: nk_bool): nk_bool = extern

  def nk_selectable_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  def nk_selectable_symbol_label(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  def nk_selectable_symbol_text(_0: Ptr[nk_context], _1: nk_symbol_type, _2: CString, _3: CInt, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  def nk_selectable_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, value: Ptr[nk_bool]): nk_bool = extern

  def nk_slide_float(_0: Ptr[nk_context], min: Float, `val`: Float, max: Float, step: Float): Float = extern

  def nk_slide_int(_0: Ptr[nk_context], min: CInt, `val`: CInt, max: CInt, step: CInt): CInt = extern

  def nk_slider_float(_0: Ptr[nk_context], min: Float, `val`: Ptr[Float], max: Float, step: Float): nk_bool = extern

  def nk_slider_int(_0: Ptr[nk_context], min: CInt, `val`: Ptr[CInt], max: CInt, step: CInt): nk_bool = extern

  def nk_spacer(_0: Ptr[nk_context]): Unit = extern

  def nk_spacing(_0: Ptr[nk_context], cols: CInt): Unit = extern

  def nk_str_append_str_char(_0: Ptr[nk_str], _1: CString): CInt = extern

  def nk_str_append_str_runes(_0: Ptr[nk_str], _1: Ptr[nk_rune]): CInt = extern

  def nk_str_append_str_utf8(_0: Ptr[nk_str], _1: CString): CInt = extern

  def nk_str_append_text_char(_0: Ptr[nk_str], _1: CString, _2: CInt): CInt = extern

  def nk_str_append_text_runes(_0: Ptr[nk_str], _1: Ptr[nk_rune], _2: CInt): CInt = extern

  def nk_str_append_text_utf8(_0: Ptr[nk_str], _1: CString, _2: CInt): CInt = extern

  def nk_str_at_char(_0: Ptr[nk_str], pos: CInt): CString = extern

  def nk_str_at_char_const(_0: Ptr[nk_str], pos: CInt): CString = extern

  def nk_str_at_const(_0: Ptr[nk_str], pos: CInt, unicode: Ptr[nk_rune], len: Ptr[CInt]): CString = extern

  def nk_str_at_rune(_0: Ptr[nk_str], pos: CInt, unicode: Ptr[nk_rune], len: Ptr[CInt]): CString = extern

  def nk_str_clear(_0: Ptr[nk_str]): Unit = extern

  def nk_str_delete_chars(_0: Ptr[nk_str], pos: CInt, len: CInt): Unit = extern

  def nk_str_delete_runes(_0: Ptr[nk_str], pos: CInt, len: CInt): Unit = extern

  def nk_str_free(_0: Ptr[nk_str]): Unit = extern

  def nk_str_get(_0: Ptr[nk_str]): CString = extern

  def nk_str_get_const(_0: Ptr[nk_str]): CString = extern

  def nk_str_init(_0: Ptr[nk_str], _1: Ptr[nk_allocator], size: nk_size): Unit = extern

  def nk_str_init_fixed(_0: Ptr[nk_str], memory: Ptr[Byte], size: nk_size): Unit = extern

  def nk_str_insert_at_char(_0: Ptr[nk_str], pos: CInt, _2: CString, _3: CInt): CInt = extern

  def nk_str_insert_at_rune(_0: Ptr[nk_str], pos: CInt, _2: CString, _3: CInt): CInt = extern

  def nk_str_insert_str_char(_0: Ptr[nk_str], pos: CInt, _2: CString): CInt = extern

  def nk_str_insert_str_runes(_0: Ptr[nk_str], pos: CInt, _2: Ptr[nk_rune]): CInt = extern

  def nk_str_insert_str_utf8(_0: Ptr[nk_str], pos: CInt, _2: CString): CInt = extern

  def nk_str_insert_text_char(_0: Ptr[nk_str], pos: CInt, _2: CString, _3: CInt): CInt = extern

  def nk_str_insert_text_runes(_0: Ptr[nk_str], pos: CInt, _2: Ptr[nk_rune], _3: CInt): CInt = extern

  def nk_str_insert_text_utf8(_0: Ptr[nk_str], pos: CInt, _2: CString, _3: CInt): CInt = extern

  def nk_str_len(_0: Ptr[nk_str]): CInt = extern

  def nk_str_len_char(_0: Ptr[nk_str]): CInt = extern

  def nk_str_remove_chars(_0: Ptr[nk_str], len: CInt): Unit = extern

  def nk_str_remove_runes(str: Ptr[nk_str], len: CInt): Unit = extern

  def nk_str_rune_at(_0: Ptr[nk_str], pos: CInt): nk_rune = extern

  def nk_strfilter(text: CString, regexp: CString): CInt = extern

  def nk_stricmp(s1: CString, s2: CString): CInt = extern

  def nk_stricmpn(s1: CString, s2: CString, n: CInt): CInt = extern

  def nk_strlen(str: CString): CInt = extern

  def nk_strmatch_fuzzy_string(str: CString, pattern: CString, out_score: Ptr[CInt]): CInt = extern

  def nk_strmatch_fuzzy_text(txt: CString, txt_len: CInt, pattern: CString, out_score: Ptr[CInt]): CInt = extern

  def nk_strtod(str: CString, endptr: Ptr[CString]): Double = extern

  def nk_strtof(str: CString, endptr: Ptr[CString]): Float = extern

  def nk_strtoi(str: CString, endptr: Ptr[CString]): CInt = extern

  def nk_style_default(_0: Ptr[nk_context]): Unit = extern

  def nk_style_from_table(_0: Ptr[nk_context], _1: Ptr[nk_color]): Unit = extern

  def nk_style_get_color_by_name(_0: nk_style_colors): CString = extern

  def nk_style_hide_cursor(_0: Ptr[nk_context]): Unit = extern

  def nk_style_load_all_cursors(_0: Ptr[nk_context], _1: Ptr[nk_cursor]): Unit = extern

  def nk_style_load_cursor(_0: Ptr[nk_context], _1: nk_style_cursor, _2: Ptr[nk_cursor]): Unit = extern

  def nk_style_pop_color(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_pop_flags(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_pop_float(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_pop_font(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_pop_style_item(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_pop_vec2(_0: Ptr[nk_context]): nk_bool = extern

  def nk_style_push_flags(_0: Ptr[nk_context], _1: Ptr[nk_flags], _2: nk_flags): nk_bool = extern

  def nk_style_push_float(_0: Ptr[nk_context], _1: Ptr[Float], _2: Float): nk_bool = extern

  def nk_style_push_font(_0: Ptr[nk_context], _1: Ptr[nk_user_font]): nk_bool = extern

  def nk_style_set_cursor(_0: Ptr[nk_context], _1: nk_style_cursor): nk_bool = extern

  def nk_style_set_font(_0: Ptr[nk_context], _1: Ptr[nk_user_font]): Unit = extern

  def nk_style_show_cursor(_0: Ptr[nk_context]): Unit = extern

  def nk_text(_0: Ptr[nk_context], _1: CString, _2: CInt, _3: nk_flags): Unit = extern

  def nk_text_wrap(_0: Ptr[nk_context], _1: CString, _2: CInt): Unit = extern

  def nk_textedit_cut(_0: Ptr[nk_text_edit]): nk_bool = extern

  def nk_textedit_delete(_0: Ptr[nk_text_edit], where: CInt, len: CInt): Unit = extern

  def nk_textedit_delete_selection(_0: Ptr[nk_text_edit]): Unit = extern

  def nk_textedit_free(_0: Ptr[nk_text_edit]): Unit = extern

  def nk_textedit_init(_0: Ptr[nk_text_edit], _1: Ptr[nk_allocator], size: nk_size): Unit = extern

  def nk_textedit_init_fixed(_0: Ptr[nk_text_edit], memory: Ptr[Byte], size: nk_size): Unit = extern

  def nk_textedit_paste(_0: Ptr[nk_text_edit], _1: CString, len: CInt): nk_bool = extern

  def nk_textedit_redo(_0: Ptr[nk_text_edit]): Unit = extern

  def nk_textedit_select_all(_0: Ptr[nk_text_edit]): Unit = extern

  def nk_textedit_text(_0: Ptr[nk_text_edit], _1: CString, total_len: CInt): Unit = extern

  def nk_textedit_undo(_0: Ptr[nk_text_edit]): Unit = extern

  def nk_tooltip(_0: Ptr[nk_context], _1: CString): Unit = extern

  def nk_tooltip_begin(_0: Ptr[nk_context], width: Float): nk_bool = extern

  def nk_tooltip_end(_0: Ptr[nk_context]): Unit = extern

  def nk_tree_element_pop(_0: Ptr[nk_context]): Unit = extern

  def nk_tree_element_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, title: CString, initial_state: nk_collapse_states, selected: Ptr[nk_bool], hash: CString, len: CInt, seed: CInt): nk_bool = extern

  def nk_tree_pop(_0: Ptr[nk_context]): Unit = extern

  def nk_tree_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, title: CString, initial_state: nk_collapse_states, hash: CString, len: CInt, seed: CInt): nk_bool = extern

  def nk_tree_state_pop(_0: Ptr[nk_context]): Unit = extern

  def nk_tree_state_push(_0: Ptr[nk_context], _1: nk_tree_type, title: CString, state: Ptr[nk_collapse_states]): nk_bool = extern

  def nk_utf_at(buffer: CString, length: CInt, index: CInt, unicode: Ptr[nk_rune], len: Ptr[CInt]): CString = extern

  def nk_utf_decode(_0: CString, _1: Ptr[nk_rune], _2: CInt): CInt = extern

  def nk_utf_encode(_0: nk_rune, _1: CString, _2: CInt): CInt = extern

  def nk_utf_len(_0: CString, byte_len: CInt): CInt = extern

  def nk_widget(_0: Ptr[nk_rect], _1: Ptr[nk_context]): nk_widget_layout_states = extern

  def nk_widget_has_mouse_click_down(_0: Ptr[nk_context], _1: nk_buttons, down: nk_bool): nk_bool = extern

  def nk_widget_height(_0: Ptr[nk_context]): Float = extern

  def nk_widget_is_hovered(_0: Ptr[nk_context]): nk_bool = extern

  def nk_widget_is_mouse_clicked(_0: Ptr[nk_context], _1: nk_buttons): nk_bool = extern

  def nk_widget_width(_0: Ptr[nk_context]): Float = extern

  def nk_window_close(ctx: Ptr[nk_context], name: CString): Unit = extern

  def nk_window_collapse(_0: Ptr[nk_context], name: CString, state: nk_collapse_states): Unit = extern

  def nk_window_collapse_if(_0: Ptr[nk_context], name: CString, _2: nk_collapse_states, cond: CInt): Unit = extern

  def nk_window_find(ctx: Ptr[nk_context], name: CString): Ptr[nk_window] = extern

  def nk_window_get_canvas(_0: Ptr[nk_context]): Ptr[nk_command_buffer] = extern

  def nk_window_get_height(_0: Ptr[nk_context]): Float = extern

  def nk_window_get_panel(_0: Ptr[nk_context]): Ptr[nk_panel] = extern

  def nk_window_get_scroll(_0: Ptr[nk_context], offset_x: Ptr[nk_uint], offset_y: Ptr[nk_uint]): Unit = extern

  def nk_window_get_width(_0: Ptr[nk_context]): Float = extern

  def nk_window_has_focus(_0: Ptr[nk_context]): nk_bool = extern

  def nk_window_is_active(_0: Ptr[nk_context], _1: CString): nk_bool = extern

  def nk_window_is_any_hovered(_0: Ptr[nk_context]): nk_bool = extern

  def nk_window_is_closed(_0: Ptr[nk_context], _1: CString): nk_bool = extern

  def nk_window_is_collapsed(ctx: Ptr[nk_context], name: CString): nk_bool = extern

  def nk_window_is_hidden(_0: Ptr[nk_context], _1: CString): nk_bool = extern

  def nk_window_is_hovered(_0: Ptr[nk_context]): nk_bool = extern

  def nk_window_set_focus(_0: Ptr[nk_context], name: CString): Unit = extern

  def nk_window_set_scroll(_0: Ptr[nk_context], offset_x: nk_uint, offset_y: nk_uint): Unit = extern

  def nk_window_show(_0: Ptr[nk_context], name: CString, _2: nk_show_states): Unit = extern

  def nk_window_show_if(_0: Ptr[nk_context], name: CString, _2: nk_show_states, cond: CInt): Unit = extern

object functions: 
  import types.*, extern_functions.*

  export extern_functions.*

  def nk_begin(ctx: Ptr[nk_context], title: CString, bounds: nk_rect, flags: nk_flags)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = bounds
    __sn_wrap_nk_begin(ctx, title, _ptr_2, flags)

  def nk_begin_titled(ctx: Ptr[nk_context], name: CString, title: CString, bounds: nk_rect, flags: nk_flags)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = bounds
    __sn_wrap_nk_begin_titled(ctx, name, title, _ptr_3, flags)

  def nk_button_color(_0: Ptr[nk_context], _1: nk_color)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_button_color(_0, _ptr_1)

  def nk_button_image(_0: Ptr[nk_context], img: nk_image)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = img
    __sn_wrap_nk_button_image(_0, _ptr_1)

  def nk_button_image_label(_0: Ptr[nk_context], img: nk_image, _2: CString, text_alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = img
    __sn_wrap_nk_button_image_label(_0, _ptr_1, _2, text_alignment)

  def nk_button_image_label_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: nk_image, _3: CString, text_alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = img
    __sn_wrap_nk_button_image_label_styled(_0, _1, _ptr_2, _3, text_alignment)

  def nk_button_image_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: nk_image)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = img
    __sn_wrap_nk_button_image_styled(_0, _1, _ptr_2)

  def nk_button_image_text(_0: Ptr[nk_context], img: nk_image, _2: CString, _3: CInt, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = img
    __sn_wrap_nk_button_image_text(_0, _ptr_1, _2, _3, alignment)

  def nk_button_image_text_styled(_0: Ptr[nk_context], _1: Ptr[nk_style_button], img: nk_image, _3: CString, _4: CInt, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = img
    __sn_wrap_nk_button_image_text_styled(_0, _1, _ptr_2, _3, _4, alignment)

  def nk_chart_add_slot_colored(ctx: Ptr[nk_context], _1: nk_chart_type, _2: nk_color, active: nk_color, count: CInt, min_value: Float, max_value: Float)(using Zone): Unit = 
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = active
    __sn_wrap_nk_chart_add_slot_colored(ctx, _1, _ptr_2, _ptr_3, count, min_value, max_value)

  def nk_chart_begin_colored(_0: Ptr[nk_context], _1: nk_chart_type, _2: nk_color, active: nk_color, num: CInt, min: Float, max: Float)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = active
    __sn_wrap_nk_chart_begin_colored(_0, _1, _ptr_2, _ptr_3, num, min, max)

  def nk_color_cf(_0: nk_color)(using Zone): nk_colorf = 
    val _ptr_0 = alloc[nk_color](1)
    !_ptr_0 = _0
    val _ptr_return = alloc[nk_colorf](1)
    __sn_wrap_nk_color_cf(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_color_d(r: Ptr[Double], g: Ptr[Double], b: Ptr[Double], a: Ptr[Double], _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_color_d(r, g, b, a, _ptr_4)

  def nk_color_dv(rgba_out: Ptr[Double], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_dv(rgba_out, _ptr_1)

  def nk_color_f(r: Ptr[Float], g: Ptr[Float], b: Ptr[Float], a: Ptr[Float], _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_color_f(r, g, b, a, _ptr_4)

  def nk_color_fv(rgba_out: Ptr[Float], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_fv(rgba_out, _ptr_1)

  def nk_color_hex_rgb(output: CString, _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hex_rgb(output, _ptr_1)

  def nk_color_hex_rgba(output: CString, _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hex_rgba(output, _ptr_1)

  def nk_color_hsv_b(out_h: Ptr[nk_byte], out_s: Ptr[nk_byte], out_v: Ptr[nk_byte], _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_color_hsv_b(out_h, out_s, out_v, _ptr_3)

  def nk_color_hsv_bv(hsv_out: Ptr[nk_byte], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsv_bv(hsv_out, _ptr_1)

  def nk_color_hsv_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_color_hsv_f(out_h, out_s, out_v, _ptr_3)

  def nk_color_hsv_fv(hsv_out: Ptr[Float], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsv_fv(hsv_out, _ptr_1)

  def nk_color_hsv_i(out_h: Ptr[CInt], out_s: Ptr[CInt], out_v: Ptr[CInt], _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_color_hsv_i(out_h, out_s, out_v, _ptr_3)

  def nk_color_hsv_iv(hsv_out: Ptr[CInt], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsv_iv(hsv_out, _ptr_1)

  def nk_color_hsva_b(h: Ptr[nk_byte], s: Ptr[nk_byte], v: Ptr[nk_byte], a: Ptr[nk_byte], _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_color_hsva_b(h, s, v, a, _ptr_4)

  def nk_color_hsva_bv(hsva_out: Ptr[nk_byte], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsva_bv(hsva_out, _ptr_1)

  def nk_color_hsva_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], out_a: Ptr[Float], _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_color_hsva_f(out_h, out_s, out_v, out_a, _ptr_4)

  def nk_color_hsva_fv(hsva_out: Ptr[Float], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsva_fv(hsva_out, _ptr_1)

  def nk_color_hsva_i(h: Ptr[CInt], s: Ptr[CInt], v: Ptr[CInt], a: Ptr[CInt], _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_color_hsva_i(h, s, v, a, _ptr_4)

  def nk_color_hsva_iv(hsva_out: Ptr[CInt], _1: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = _1
    __sn_wrap_nk_color_hsva_iv(hsva_out, _ptr_1)

  def nk_color_picker(_0: Ptr[nk_context], _1: nk_colorf, _2: nk_color_format)(using Zone): nk_colorf = 
    val _ptr_1 = alloc[nk_colorf](1)
    !_ptr_1 = _1
    val _ptr_return = alloc[nk_colorf](1)
    __sn_wrap_nk_color_picker(_0, _ptr_1, _2, _ptr_return)
    !_ptr_return

  def nk_color_u32(_0: nk_color)(using Zone): nk_uint = 
    val _ptr_0 = alloc[nk_color](1)
    !_ptr_0 = _0
    __sn_wrap_nk_color_u32(_ptr_0)

  def nk_colorf_hsva_f(out_h: Ptr[Float], out_s: Ptr[Float], out_v: Ptr[Float], out_a: Ptr[Float], in: nk_colorf)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_colorf](1)
    !_ptr_4 = in
    __sn_wrap_nk_colorf_hsva_f(out_h, out_s, out_v, out_a, _ptr_4)

  def nk_colorf_hsva_fv(hsva: Ptr[Float], in: nk_colorf)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_colorf](1)
    !_ptr_1 = in
    __sn_wrap_nk_colorf_hsva_fv(hsva, _ptr_1)

  def nk_combo(_0: Ptr[nk_context], items: Ptr[CString], count: CInt, selected: CInt, item_height: CInt, size: nk_vec2)(using Zone): CInt = 
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_combo(_0, items, count, selected, item_height, _ptr_5)

  def nk_combo_begin_color(_0: Ptr[nk_context], color: nk_color, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_color](1)
    !_ptr_1 = color
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = size
    __sn_wrap_nk_combo_begin_color(_0, _ptr_1, _ptr_2)

  def nk_combo_begin_image(_0: Ptr[nk_context], img: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = img
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = size
    __sn_wrap_nk_combo_begin_image(_0, _ptr_1, _ptr_2)

  def nk_combo_begin_image_label(_0: Ptr[nk_context], selected: CString, _2: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = _2
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_combo_begin_image_label(_0, selected, _ptr_2, _ptr_3)

  def nk_combo_begin_image_text(_0: Ptr[nk_context], selected: CString, _2: CInt, _3: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_image](1)
    !_ptr_3 = _3
    val _ptr_4 = alloc[nk_vec2](1)
    !_ptr_4 = size
    __sn_wrap_nk_combo_begin_image_text(_0, selected, _2, _ptr_3, _ptr_4)

  def nk_combo_begin_label(_0: Ptr[nk_context], selected: CString, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = size
    __sn_wrap_nk_combo_begin_label(_0, selected, _ptr_2)

  def nk_combo_begin_symbol(_0: Ptr[nk_context], _1: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = size
    __sn_wrap_nk_combo_begin_symbol(_0, _1, _ptr_2)

  def nk_combo_begin_symbol_label(_0: Ptr[nk_context], selected: CString, _2: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_combo_begin_symbol_label(_0, selected, _2, _ptr_3)

  def nk_combo_begin_symbol_text(_0: Ptr[nk_context], selected: CString, _2: CInt, _3: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_4 = alloc[nk_vec2](1)
    !_ptr_4 = size
    __sn_wrap_nk_combo_begin_symbol_text(_0, selected, _2, _3, _ptr_4)

  def nk_combo_begin_text(_0: Ptr[nk_context], selected: CString, _2: CInt, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_combo_begin_text(_0, selected, _2, _ptr_3)

  def nk_combo_callback(_0: Ptr[nk_context], item_getter: Ptr[CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit]], userdata: Ptr[Byte], selected: CInt, count: CInt, item_height: CInt, size: nk_vec2)(using Zone): CInt = 
    val _ptr_6 = alloc[nk_vec2](1)
    !_ptr_6 = size
    __sn_wrap_nk_combo_callback(_0, item_getter, userdata, selected, count, item_height, _ptr_6)

  def nk_combo_item_image_label(_0: Ptr[nk_context], _1: nk_image, _2: CString, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_combo_item_image_label(_0, _ptr_1, _2, alignment)

  def nk_combo_item_image_text(_0: Ptr[nk_context], _1: nk_image, _2: CString, _3: CInt, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_combo_item_image_text(_0, _ptr_1, _2, _3, alignment)

  def nk_combo_separator(_0: Ptr[nk_context], items_separated_by_separator: CString, separator: CInt, selected: CInt, count: CInt, item_height: CInt, size: nk_vec2)(using Zone): CInt = 
    val _ptr_6 = alloc[nk_vec2](1)
    !_ptr_6 = size
    __sn_wrap_nk_combo_separator(_0, items_separated_by_separator, separator, selected, count, item_height, _ptr_6)

  def nk_combo_string(_0: Ptr[nk_context], items_separated_by_zeros: CString, selected: CInt, count: CInt, item_height: CInt, size: nk_vec2)(using Zone): CInt = 
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_combo_string(_0, items_separated_by_zeros, selected, count, item_height, _ptr_5)

  def nk_combobox(_0: Ptr[nk_context], items: Ptr[CString], count: CInt, selected: Ptr[CInt], item_height: CInt, size: nk_vec2)(using Zone): Unit = 
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_combobox(_0, items, count, selected, item_height, _ptr_5)

  def nk_combobox_callback(_0: Ptr[nk_context], item_getter: Ptr[CFuncPtr3[Ptr[Byte], CInt, Ptr[CString], Unit]], _2: Ptr[Byte], selected: Ptr[CInt], count: CInt, item_height: CInt, size: nk_vec2)(using Zone): Unit = 
    val _ptr_6 = alloc[nk_vec2](1)
    !_ptr_6 = size
    __sn_wrap_nk_combobox_callback(_0, item_getter, _2, selected, count, item_height, _ptr_6)

  def nk_combobox_separator(_0: Ptr[nk_context], items_separated_by_separator: CString, separator: CInt, selected: Ptr[CInt], count: CInt, item_height: CInt, size: nk_vec2)(using Zone): Unit = 
    val _ptr_6 = alloc[nk_vec2](1)
    !_ptr_6 = size
    __sn_wrap_nk_combobox_separator(_0, items_separated_by_separator, separator, selected, count, item_height, _ptr_6)

  def nk_combobox_string(_0: Ptr[nk_context], items_separated_by_zeros: CString, selected: Ptr[CInt], count: CInt, item_height: CInt, size: nk_vec2)(using Zone): Unit = 
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_combobox_string(_0, items_separated_by_zeros, selected, count, item_height, _ptr_5)

  def nk_contextual_begin(_0: Ptr[nk_context], _1: nk_flags, _2: nk_vec2, trigger_bounds: nk_rect)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = _2
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = trigger_bounds
    __sn_wrap_nk_contextual_begin(_0, _1, _ptr_2, _ptr_3)

  def nk_contextual_item_image_label(_0: Ptr[nk_context], _1: nk_image, _2: CString, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_contextual_item_image_label(_0, _ptr_1, _2, alignment)

  def nk_contextual_item_image_text(_0: Ptr[nk_context], _1: nk_image, _2: CString, len: CInt, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_contextual_item_image_text(_0, _ptr_1, _2, len, alignment)

  def nk_draw_image(_0: Ptr[nk_command_buffer], _1: nk_rect, _2: Ptr[nk_image], _3: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_draw_image(_0, _ptr_1, _2, _ptr_3)

  def nk_draw_nine_slice(_0: Ptr[nk_command_buffer], _1: nk_rect, _2: Ptr[nk_nine_slice], _3: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_draw_nine_slice(_0, _ptr_1, _2, _ptr_3)

  def nk_draw_text(_0: Ptr[nk_command_buffer], _1: nk_rect, text: CString, len: CInt, _4: Ptr[nk_user_font], _5: nk_color, _6: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_5 = alloc[nk_color](1)
    !_ptr_5 = _5
    val _ptr_6 = alloc[nk_color](1)
    !_ptr_6 = _6
    __sn_wrap_nk_draw_text(_0, _ptr_1, text, len, _4, _ptr_5, _ptr_6)

  def nk_fill_arc(_0: Ptr[nk_command_buffer], cx: Float, cy: Float, radius: Float, a_min: Float, a_max: Float, _6: nk_color)(using Zone): Unit = 
    val _ptr_6 = alloc[nk_color](1)
    !_ptr_6 = _6
    __sn_wrap_nk_fill_arc(_0, cx, cy, radius, a_min, a_max, _ptr_6)

  def nk_fill_circle(_0: Ptr[nk_command_buffer], _1: nk_rect, _2: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    __sn_wrap_nk_fill_circle(_0, _ptr_1, _ptr_2)

  def nk_fill_polygon(_0: Ptr[nk_command_buffer], _1: Ptr[Float], point_count: CInt, _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_fill_polygon(_0, _1, point_count, _ptr_3)

  def nk_fill_rect(_0: Ptr[nk_command_buffer], _1: nk_rect, rounding: Float, _3: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_fill_rect(_0, _ptr_1, rounding, _ptr_3)

  def nk_fill_rect_multi_color(_0: Ptr[nk_command_buffer], _1: nk_rect, left: nk_color, top: nk_color, right: nk_color, bottom: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = left
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = top
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = right
    val _ptr_5 = alloc[nk_color](1)
    !_ptr_5 = bottom
    __sn_wrap_nk_fill_rect_multi_color(_0, _ptr_1, _ptr_2, _ptr_3, _ptr_4, _ptr_5)

  def nk_fill_triangle(_0: Ptr[nk_command_buffer], x0: Float, y0: Float, x1: Float, y1: Float, x2: Float, y2: Float, _7: nk_color)(using Zone): Unit = 
    val _ptr_7 = alloc[nk_color](1)
    !_ptr_7 = _7
    __sn_wrap_nk_fill_triangle(_0, x0, y0, x1, y1, x2, y2, _ptr_7)

  def nk_get_null_rect()(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_get_null_rect(_ptr_return)
    !_ptr_return

  def nk_hsv(h: CInt, s: CInt, v: CInt)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsv(h, s, v, _ptr_return)
    !_ptr_return

  def nk_hsv_bv(hsv: Ptr[nk_byte])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsv_bv(hsv, _ptr_return)
    !_ptr_return

  def nk_hsv_f(h: Float, s: Float, v: Float)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsv_f(h, s, v, _ptr_return)
    !_ptr_return

  def nk_hsv_fv(hsv: Ptr[Float])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsv_fv(hsv, _ptr_return)
    !_ptr_return

  def nk_hsv_iv(hsv: Ptr[CInt])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsv_iv(hsv, _ptr_return)
    !_ptr_return

  def nk_hsva(h: CInt, s: CInt, v: CInt, a: CInt)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsva(h, s, v, a, _ptr_return)
    !_ptr_return

  def nk_hsva_bv(hsva: Ptr[nk_byte])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsva_bv(hsva, _ptr_return)
    !_ptr_return

  def nk_hsva_colorf(h: Float, s: Float, v: Float, a: Float)(using Zone): nk_colorf = 
    val _ptr_return = alloc[nk_colorf](1)
    __sn_wrap_nk_hsva_colorf(h, s, v, a, _ptr_return)
    !_ptr_return

  def nk_hsva_colorfv(c: Ptr[Float])(using Zone): nk_colorf = 
    val _ptr_return = alloc[nk_colorf](1)
    __sn_wrap_nk_hsva_colorfv(c, _ptr_return)
    !_ptr_return

  def nk_hsva_f(h: Float, s: Float, v: Float, a: Float)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsva_f(h, s, v, a, _ptr_return)
    !_ptr_return

  def nk_hsva_fv(hsva: Ptr[Float])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsva_fv(hsva, _ptr_return)
    !_ptr_return

  def nk_hsva_iv(hsva: Ptr[CInt])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_hsva_iv(hsva, _ptr_return)
    !_ptr_return

  def nk_image(_0: Ptr[nk_context], _1: nk_image)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_image(_0, _ptr_1)

  def nk_image_color(_0: Ptr[nk_context], _1: nk_image, _2: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    __sn_wrap_nk_image_color(_0, _ptr_1, _ptr_2)

  def nk_image_handle(_0: nk_handle)(using Zone): nk_image = 
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_image_handle(_0, _ptr_return)
    !_ptr_return

  def nk_image_id(_0: CInt)(using Zone): nk_image = 
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_image_id(_0, _ptr_return)
    !_ptr_return

  def nk_image_ptr(_0: Ptr[Byte])(using Zone): nk_image = 
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_image_ptr(_0, _ptr_return)
    !_ptr_return

  def nk_input_any_mouse_click_in_rect(_0: Ptr[nk_input], _1: nk_rect)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    __sn_wrap_nk_input_any_mouse_click_in_rect(_0, _ptr_1)

  def nk_input_has_mouse_click_down_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: nk_rect, down: nk_bool)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = _2
    __sn_wrap_nk_input_has_mouse_click_down_in_rect(_0, _1, _ptr_2, down)

  def nk_input_has_mouse_click_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: nk_rect)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = _2
    __sn_wrap_nk_input_has_mouse_click_in_rect(_0, _1, _ptr_2)

  def nk_input_is_mouse_click_down_in_rect(i: Ptr[nk_input], id: nk_buttons, b: nk_rect, down: nk_bool)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = b
    __sn_wrap_nk_input_is_mouse_click_down_in_rect(i, id, _ptr_2, down)

  def nk_input_is_mouse_click_in_rect(_0: Ptr[nk_input], _1: nk_buttons, _2: nk_rect)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = _2
    __sn_wrap_nk_input_is_mouse_click_in_rect(_0, _1, _ptr_2)

  def nk_input_is_mouse_hovering_rect(_0: Ptr[nk_input], _1: nk_rect)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    __sn_wrap_nk_input_is_mouse_hovering_rect(_0, _ptr_1)

  def nk_input_is_mouse_prev_hovering_rect(_0: Ptr[nk_input], _1: nk_rect)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    __sn_wrap_nk_input_is_mouse_prev_hovering_rect(_0, _ptr_1)

  def nk_input_mouse_clicked(_0: Ptr[nk_input], _1: nk_buttons, _2: nk_rect)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = _2
    __sn_wrap_nk_input_mouse_clicked(_0, _1, _ptr_2)

  def nk_input_scroll(_0: Ptr[nk_context], `val`: nk_vec2)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_vec2](1)
    !_ptr_1 = `val`
    __sn_wrap_nk_input_scroll(_0, _ptr_1)

  def nk_label_colored(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_label_colored(_0, _1, align, _ptr_3)

  def nk_label_colored_wrap(_0: Ptr[nk_context], _1: CString, _2: nk_color)(using Zone): Unit = 
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    __sn_wrap_nk_label_colored_wrap(_0, _1, _ptr_2)

  def nk_layout_space_bounds(_0: Ptr[nk_context])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_layout_space_bounds(_0, _ptr_return)
    !_ptr_return

  def nk_layout_space_push(_0: Ptr[nk_context], bounds: nk_rect)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = bounds
    __sn_wrap_nk_layout_space_push(_0, _ptr_1)

  def nk_layout_space_rect_to_local(_0: Ptr[nk_context], _1: nk_rect)(using Zone): nk_rect = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_layout_space_rect_to_local(_0, _ptr_1, _ptr_return)
    !_ptr_return

  def nk_layout_space_rect_to_screen(_0: Ptr[nk_context], _1: nk_rect)(using Zone): nk_rect = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_layout_space_rect_to_screen(_0, _ptr_1, _ptr_return)
    !_ptr_return

  def nk_layout_space_to_local(_0: Ptr[nk_context], _1: nk_vec2)(using Zone): nk_vec2 = 
    val _ptr_1 = alloc[nk_vec2](1)
    !_ptr_1 = _1
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_layout_space_to_local(_0, _ptr_1, _ptr_return)
    !_ptr_return

  def nk_layout_space_to_screen(_0: Ptr[nk_context], _1: nk_vec2)(using Zone): nk_vec2 = 
    val _ptr_1 = alloc[nk_vec2](1)
    !_ptr_1 = _1
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_layout_space_to_screen(_0, _ptr_1, _ptr_return)
    !_ptr_return

  def nk_layout_widget_bounds(_0: Ptr[nk_context])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_layout_widget_bounds(_0, _ptr_return)
    !_ptr_return

  def nk_menu_begin_image(_0: Ptr[nk_context], _1: CString, _2: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = _2
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_menu_begin_image(_0, _1, _ptr_2, _ptr_3)

  def nk_menu_begin_image_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_image](1)
    !_ptr_3 = _3
    val _ptr_4 = alloc[nk_vec2](1)
    !_ptr_4 = size
    __sn_wrap_nk_menu_begin_image_label(_0, _1, align, _ptr_3, _ptr_4)

  def nk_menu_begin_image_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, _4: nk_image, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_4 = alloc[nk_image](1)
    !_ptr_4 = _4
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_menu_begin_image_text(_0, _1, _2, align, _ptr_4, _ptr_5)

  def nk_menu_begin_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_menu_begin_label(_0, _1, align, _ptr_3)

  def nk_menu_begin_symbol(_0: Ptr[nk_context], _1: CString, _2: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_3 = alloc[nk_vec2](1)
    !_ptr_3 = size
    __sn_wrap_nk_menu_begin_symbol(_0, _1, _2, _ptr_3)

  def nk_menu_begin_symbol_label(_0: Ptr[nk_context], _1: CString, align: nk_flags, _3: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_4 = alloc[nk_vec2](1)
    !_ptr_4 = size
    __sn_wrap_nk_menu_begin_symbol_label(_0, _1, align, _3, _ptr_4)

  def nk_menu_begin_symbol_text(_0: Ptr[nk_context], _1: CString, _2: CInt, align: nk_flags, _4: nk_symbol_type, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_5 = alloc[nk_vec2](1)
    !_ptr_5 = size
    __sn_wrap_nk_menu_begin_symbol_text(_0, _1, _2, align, _4, _ptr_5)

  def nk_menu_begin_text(_0: Ptr[nk_context], title: CString, title_len: CInt, align: nk_flags, size: nk_vec2)(using Zone): nk_bool = 
    val _ptr_4 = alloc[nk_vec2](1)
    !_ptr_4 = size
    __sn_wrap_nk_menu_begin_text(_0, title, title_len, align, _ptr_4)

  def nk_menu_item_image_label(_0: Ptr[nk_context], _1: nk_image, _2: CString, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_menu_item_image_label(_0, _ptr_1, _2, alignment)

  def nk_menu_item_image_text(_0: Ptr[nk_context], _1: nk_image, _2: CString, len: CInt, alignment: nk_flags)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_menu_item_image_text(_0, _ptr_1, _2, len, alignment)

  def nk_nine_slice_handle(_0: nk_handle, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_nine_slice_handle(_0, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_nine_slice_id(_0: CInt, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_nine_slice_id(_0, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_nine_slice_ptr(_0: Ptr[Byte], l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_nine_slice_ptr(_0, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_popup_begin(_0: Ptr[nk_context], _1: nk_popup_type, _2: CString, _3: nk_flags, bounds: nk_rect)(using Zone): nk_bool = 
    val _ptr_4 = alloc[nk_rect](1)
    !_ptr_4 = bounds
    __sn_wrap_nk_popup_begin(_0, _1, _2, _3, _ptr_4)

  def nk_push_custom(_0: Ptr[nk_command_buffer], _1: nk_rect, _2: nk_command_custom_callback, usr: nk_handle)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    __sn_wrap_nk_push_custom(_0, _ptr_1, _2, usr)

  def nk_push_scissor(_0: Ptr[nk_command_buffer], _1: nk_rect)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    __sn_wrap_nk_push_scissor(_0, _ptr_1)

  def nk_rect(x: Float, y: Float, w: Float, h: Float)(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_rect(x, y, w, h, _ptr_return)
    !_ptr_return

  def nk_rect_pos(_0: nk_rect)(using Zone): nk_vec2 = 
    val _ptr_0 = alloc[nk_rect](1)
    !_ptr_0 = _0
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_rect_pos(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_rect_size(_0: nk_rect)(using Zone): nk_vec2 = 
    val _ptr_0 = alloc[nk_rect](1)
    !_ptr_0 = _0
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_rect_size(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_recta(pos: nk_vec2, size: nk_vec2)(using Zone): nk_rect = 
    val _ptr_0 = alloc[nk_vec2](1)
    !_ptr_0 = pos
    val _ptr_1 = alloc[nk_vec2](1)
    !_ptr_1 = size
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_recta(_ptr_0, _ptr_1, _ptr_return)
    !_ptr_return

  def nk_recti(x: CInt, y: CInt, w: CInt, h: CInt)(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_recti(x, y, w, h, _ptr_return)
    !_ptr_return

  def nk_rectiv(xywh: Ptr[CInt])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_rectiv(xywh, _ptr_return)
    !_ptr_return

  def nk_rectv(xywh: Ptr[Float])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_rectv(xywh, _ptr_return)
    !_ptr_return

  def nk_rgb(r: CInt, g: CInt, b: CInt)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb(r, g, b, _ptr_return)
    !_ptr_return

  def nk_rgb_bv(rgb: Ptr[nk_byte])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_bv(rgb, _ptr_return)
    !_ptr_return

  def nk_rgb_cf(c: nk_colorf)(using Zone): nk_color = 
    val _ptr_0 = alloc[nk_colorf](1)
    !_ptr_0 = c
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_cf(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_rgb_f(r: Float, g: Float, b: Float)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_f(r, g, b, _ptr_return)
    !_ptr_return

  def nk_rgb_fv(rgb: Ptr[Float])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_fv(rgb, _ptr_return)
    !_ptr_return

  def nk_rgb_hex(rgb: CString)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_hex(rgb, _ptr_return)
    !_ptr_return

  def nk_rgb_iv(rgb: Ptr[CInt])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgb_iv(rgb, _ptr_return)
    !_ptr_return

  def nk_rgba(r: CInt, g: CInt, b: CInt, a: CInt)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba(r, g, b, a, _ptr_return)
    !_ptr_return

  def nk_rgba_bv(rgba: Ptr[nk_byte])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_bv(rgba, _ptr_return)
    !_ptr_return

  def nk_rgba_cf(c: nk_colorf)(using Zone): nk_color = 
    val _ptr_0 = alloc[nk_colorf](1)
    !_ptr_0 = c
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_cf(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_rgba_f(r: Float, g: Float, b: Float, a: Float)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_f(r, g, b, a, _ptr_return)
    !_ptr_return

  def nk_rgba_fv(rgba: Ptr[Float])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_fv(rgba, _ptr_return)
    !_ptr_return

  def nk_rgba_hex(rgb: CString)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_hex(rgb, _ptr_return)
    !_ptr_return

  def nk_rgba_iv(rgba: Ptr[CInt])(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_iv(rgba, _ptr_return)
    !_ptr_return

  def nk_rgba_u32(_0: nk_uint)(using Zone): nk_color = 
    val _ptr_return = alloc[nk_color](1)
    __sn_wrap_nk_rgba_u32(_0, _ptr_return)
    !_ptr_return

  def nk_select_image_label(_0: Ptr[nk_context], _1: nk_image, _2: CString, align: nk_flags, value: nk_bool)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_select_image_label(_0, _ptr_1, _2, align, value)

  def nk_select_image_text(_0: Ptr[nk_context], _1: nk_image, _2: CString, _3: CInt, align: nk_flags, value: nk_bool)(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_select_image_text(_0, _ptr_1, _2, _3, align, value)

  def nk_selectable_image_label(_0: Ptr[nk_context], _1: nk_image, _2: CString, align: nk_flags, value: Ptr[nk_bool])(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_selectable_image_label(_0, _ptr_1, _2, align, value)

  def nk_selectable_image_text(_0: Ptr[nk_context], _1: nk_image, _2: CString, _3: CInt, align: nk_flags, value: Ptr[nk_bool])(using Zone): nk_bool = 
    val _ptr_1 = alloc[nk_image](1)
    !_ptr_1 = _1
    __sn_wrap_nk_selectable_image_text(_0, _ptr_1, _2, _3, align, value)

  def nk_stroke_arc(_0: Ptr[nk_command_buffer], cx: Float, cy: Float, radius: Float, a_min: Float, a_max: Float, line_thickness: Float, _7: nk_color)(using Zone): Unit = 
    val _ptr_7 = alloc[nk_color](1)
    !_ptr_7 = _7
    __sn_wrap_nk_stroke_arc(_0, cx, cy, radius, a_min, a_max, line_thickness, _ptr_7)

  def nk_stroke_circle(_0: Ptr[nk_command_buffer], _1: nk_rect, line_thickness: Float, _3: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_stroke_circle(_0, _ptr_1, line_thickness, _ptr_3)

  def nk_stroke_curve(_0: Ptr[nk_command_buffer], _1: Float, _2: Float, _3: Float, _4: Float, _5: Float, _6: Float, _7: Float, _8: Float, line_thickness: Float, _10: nk_color)(using Zone): Unit = 
    val _ptr_10 = alloc[nk_color](1)
    !_ptr_10 = _10
    __sn_wrap_nk_stroke_curve(_0, _1, _2, _3, _4, _5, _6, _7, _8, line_thickness, _ptr_10)

  def nk_stroke_line(b: Ptr[nk_command_buffer], x0: Float, y0: Float, x1: Float, y1: Float, line_thickness: Float, _6: nk_color)(using Zone): Unit = 
    val _ptr_6 = alloc[nk_color](1)
    !_ptr_6 = _6
    __sn_wrap_nk_stroke_line(b, x0, y0, x1, y1, line_thickness, _ptr_6)

  def nk_stroke_polygon(_0: Ptr[nk_command_buffer], _1: Ptr[Float], point_count: CInt, line_thickness: Float, _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_stroke_polygon(_0, _1, point_count, line_thickness, _ptr_4)

  def nk_stroke_polyline(_0: Ptr[nk_command_buffer], points: Ptr[Float], point_count: CInt, line_thickness: Float, col: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = col
    __sn_wrap_nk_stroke_polyline(_0, points, point_count, line_thickness, _ptr_4)

  def nk_stroke_rect(_0: Ptr[nk_command_buffer], _1: nk_rect, rounding: Float, line_thickness: Float, _4: nk_color)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = _1
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_stroke_rect(_0, _ptr_1, rounding, line_thickness, _ptr_4)

  def nk_stroke_triangle(_0: Ptr[nk_command_buffer], _1: Float, _2: Float, _3: Float, _4: Float, _5: Float, _6: Float, line_thichness: Float, _8: nk_color)(using Zone): Unit = 
    val _ptr_8 = alloc[nk_color](1)
    !_ptr_8 = _8
    __sn_wrap_nk_stroke_triangle(_0, _1, _2, _3, _4, _5, _6, line_thichness, _ptr_8)

  def nk_style_item_color(_0: nk_color)(using Zone): nk_style_item = 
    val _ptr_0 = alloc[nk_color](1)
    !_ptr_0 = _0
    val _ptr_return = alloc[nk_style_item](1)
    __sn_wrap_nk_style_item_color(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_style_item_hide()(using Zone): nk_style_item = 
    val _ptr_return = alloc[nk_style_item](1)
    __sn_wrap_nk_style_item_hide(_ptr_return)
    !_ptr_return

  def nk_style_item_image(img: nk_image)(using Zone): nk_style_item = 
    val _ptr_0 = alloc[nk_image](1)
    !_ptr_0 = img
    val _ptr_return = alloc[nk_style_item](1)
    __sn_wrap_nk_style_item_image(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_style_item_nine_slice(slice: nk_nine_slice)(using Zone): nk_style_item = 
    val _ptr_0 = alloc[nk_nine_slice](1)
    !_ptr_0 = slice
    val _ptr_return = alloc[nk_style_item](1)
    __sn_wrap_nk_style_item_nine_slice(_ptr_0, _ptr_return)
    !_ptr_return

  def nk_style_push_color(_0: Ptr[nk_context], _1: Ptr[nk_color], _2: nk_color)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_color](1)
    !_ptr_2 = _2
    __sn_wrap_nk_style_push_color(_0, _1, _ptr_2)

  def nk_style_push_style_item(_0: Ptr[nk_context], _1: Ptr[nk_style_item], _2: nk_style_item)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_style_item](1)
    !_ptr_2 = _2
    __sn_wrap_nk_style_push_style_item(_0, _1, _ptr_2)

  def nk_style_push_vec2(_0: Ptr[nk_context], _1: Ptr[nk_vec2], _2: nk_vec2)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = _2
    __sn_wrap_nk_style_push_vec2(_0, _1, _ptr_2)

  def nk_sub9slice_handle(_0: nk_handle, w: nk_ushort, h: nk_ushort, sub_region: nk_rect, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_sub9slice_handle(_0, w, h, _ptr_3, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_sub9slice_id(_0: CInt, w: nk_ushort, h: nk_ushort, sub_region: nk_rect, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_sub9slice_id(_0, w, h, _ptr_3, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_sub9slice_ptr(_0: Ptr[Byte], w: nk_ushort, h: nk_ushort, sub_region: nk_rect, l: nk_ushort, t: nk_ushort, r: nk_ushort, b: nk_ushort)(using Zone): nk_nine_slice = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_nine_slice](1)
    __sn_wrap_nk_sub9slice_ptr(_0, w, h, _ptr_3, l, t, r, b, _ptr_return)
    !_ptr_return

  def nk_subimage_handle(_0: nk_handle, w: nk_ushort, h: nk_ushort, sub_region: nk_rect)(using Zone): nk_image = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_subimage_handle(_0, w, h, _ptr_3, _ptr_return)
    !_ptr_return

  def nk_subimage_id(_0: CInt, w: nk_ushort, h: nk_ushort, sub_region: nk_rect)(using Zone): nk_image = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_subimage_id(_0, w, h, _ptr_3, _ptr_return)
    !_ptr_return

  def nk_subimage_ptr(_0: Ptr[Byte], w: nk_ushort, h: nk_ushort, sub_region: nk_rect)(using Zone): nk_image = 
    val _ptr_3 = alloc[nk_rect](1)
    !_ptr_3 = sub_region
    val _ptr_return = alloc[nk_image](1)
    __sn_wrap_nk_subimage_ptr(_0, w, h, _ptr_3, _ptr_return)
    !_ptr_return

  def nk_text_colored(_0: Ptr[nk_context], _1: CString, _2: CInt, _3: nk_flags, _4: nk_color)(using Zone): Unit = 
    val _ptr_4 = alloc[nk_color](1)
    !_ptr_4 = _4
    __sn_wrap_nk_text_colored(_0, _1, _2, _3, _ptr_4)

  def nk_text_wrap_colored(_0: Ptr[nk_context], _1: CString, _2: CInt, _3: nk_color)(using Zone): Unit = 
    val _ptr_3 = alloc[nk_color](1)
    !_ptr_3 = _3
    __sn_wrap_nk_text_wrap_colored(_0, _1, _2, _ptr_3)

  def nk_tree_element_image_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, _2: nk_image, title: CString, initial_state: nk_collapse_states, selected: Ptr[nk_bool], hash: CString, len: CInt, seed: CInt)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = _2
    __sn_wrap_nk_tree_element_image_push_hashed(_0, _1, _ptr_2, title, initial_state, selected, hash, len, seed)

  def nk_tree_image_push_hashed(_0: Ptr[nk_context], _1: nk_tree_type, _2: nk_image, title: CString, initial_state: nk_collapse_states, hash: CString, len: CInt, seed: CInt)(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = _2
    __sn_wrap_nk_tree_image_push_hashed(_0, _1, _ptr_2, title, initial_state, hash, len, seed)

  def nk_tree_state_image_push(_0: Ptr[nk_context], _1: nk_tree_type, _2: nk_image, title: CString, state: Ptr[nk_collapse_states])(using Zone): nk_bool = 
    val _ptr_2 = alloc[nk_image](1)
    !_ptr_2 = _2
    __sn_wrap_nk_tree_state_image_push(_0, _1, _ptr_2, title, state)

  def nk_triangle_from_direction(result: Ptr[nk_vec2], r: nk_rect, pad_x: Float, pad_y: Float, _4: nk_heading)(using Zone): Unit = 
    val _ptr_1 = alloc[nk_rect](1)
    !_ptr_1 = r
    __sn_wrap_nk_triangle_from_direction(result, _ptr_1, pad_x, pad_y, _4)

  def nk_vec2(x: Float, y: Float)(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_vec2(x, y, _ptr_return)
    !_ptr_return

  def nk_vec2i(x: CInt, y: CInt)(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_vec2i(x, y, _ptr_return)
    !_ptr_return

  def nk_vec2iv(xy: Ptr[CInt])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_vec2iv(xy, _ptr_return)
    !_ptr_return

  def nk_vec2v(xy: Ptr[Float])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_vec2v(xy, _ptr_return)
    !_ptr_return

  def nk_widget_bounds(_0: Ptr[nk_context])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_widget_bounds(_0, _ptr_return)
    !_ptr_return

  def nk_widget_fitting(_0: Ptr[nk_rect], _1: Ptr[nk_context], _2: nk_vec2)(using Zone): nk_widget_layout_states = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = _2
    __sn_wrap_nk_widget_fitting(_0, _1, _ptr_2)

  def nk_widget_position(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_widget_position(_0, _ptr_return)
    !_ptr_return

  def nk_widget_size(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_widget_size(_0, _ptr_return)
    !_ptr_return

  def nk_window_get_bounds(ctx: Ptr[nk_context])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_window_get_bounds(ctx, _ptr_return)
    !_ptr_return

  def nk_window_get_content_region(_0: Ptr[nk_context])(using Zone): nk_rect = 
    val _ptr_return = alloc[nk_rect](1)
    __sn_wrap_nk_window_get_content_region(_0, _ptr_return)
    !_ptr_return

  def nk_window_get_content_region_max(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_window_get_content_region_max(_0, _ptr_return)
    !_ptr_return

  def nk_window_get_content_region_min(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_window_get_content_region_min(_0, _ptr_return)
    !_ptr_return

  def nk_window_get_content_region_size(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_window_get_content_region_size(_0, _ptr_return)
    !_ptr_return

  def nk_window_get_position(ctx: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_window_get_position(ctx, _ptr_return)
    !_ptr_return

  def nk_window_get_size(_0: Ptr[nk_context])(using Zone): nk_vec2 = 
    val _ptr_return = alloc[nk_vec2](1)
    __sn_wrap_nk_window_get_size(_0, _ptr_return)
    !_ptr_return

  def nk_window_set_bounds(_0: Ptr[nk_context], name: CString, bounds: nk_rect)(using Zone): Unit = 
    val _ptr_2 = alloc[nk_rect](1)
    !_ptr_2 = bounds
    __sn_wrap_nk_window_set_bounds(_0, name, _ptr_2)

  def nk_window_set_position(_0: Ptr[nk_context], name: CString, pos: nk_vec2)(using Zone): Unit = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = pos
    __sn_wrap_nk_window_set_position(_0, name, _ptr_2)

  def nk_window_set_size(_0: Ptr[nk_context], name: CString, _2: nk_vec2)(using Zone): Unit = 
    val _ptr_2 = alloc[nk_vec2](1)
    !_ptr_2 = _2
    __sn_wrap_nk_window_set_size(_0, name, _ptr_2)




























































































































































































