package com.olvind
package mui

object MuiTypeMapperFunction {
  def apply(compName: CompName, name: PropName): String =
    (compName.value, name.value) match {
      case ("AppBar", "onLeftIconButtonTouchTap") => "ReactTouchEventH => Callback"
      case ("AppBar", "onRightIconButtonTouchTap") => "ReactTouchEventH => Callback"
      case ("AppBar", "onTitleTouchTap") => "ReactTouchEventH => Callback"
      case ("AutoComplete", "onNewRequest") => "(Value, js.UndefOr[Int], js.Array[Value]) => Callback"
      case ("AutoComplete", "onUpdateInput") => "(SearchText, js.Array[Value]) => Callback"
      case ("AutoComplete", "filter") => "AutoCompleteFilter"
      case ("Card", "onExpandChange") => "Boolean => Callback"
      case ("CardExpandable", "onExpanding") => "Callback"
      case ("DatePicker", "DateTimeFormat") => "js.Function"
      case ("DatePicker", "onChange") => "(js.UndefOr[Nothing], js.Date) => Callback"
      case ("DatePicker", "shouldDisableDate") => "js.Date => Boolean"
      case ("DatePicker", "formatDate") => "js.Date => String"
      case ("DatePicker", "onAccept") => "js.Date => Callback"
      case ("DatePickerDialog", "onAccept") => "js.Date => Callback"
      case ("DatePickerDialog", "DateTimeFormat") => "js.Function"
      case ("DatePickerDialog", "shouldDisableDate") => "js.Date => Boolean"
      case ("Dialog", "onRequestClose") => "Boolean => Callback"
      case ("DialogInline", "onRequestClose") => "Boolean => Callback"
      case ("DropDownIcon", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("DropDownMenu", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("EnhancedSwitch", "onParentShouldUpdate") => "Boolean => Callback"
      case ("EnhancedSwitch", "onSwitch") => "(ReactEventI, Boolean) => Callback"
      case ("IconButton", "onBlur") => "ReactEventH => Callback"
      case ("IconMenu", "onItemTouchTap") => "(ReactTouchEventH, ReactElement) => Callback"
      case ("IconMenu", "onChange") => "(ReactEventH, js.UndefOr[String]) => Callback"
      case ("IconMenu", "onRequestChange") => "(Boolean, String) => Callback"
      case ("LeftNav", "onChange") => "(ReactEventH, Int, js.Any) => Callback"
      case ("LeftNav", "onNavOpen") => "Callback"
      case ("LeftNav", "onNavClose") => "Callback"
      case ("LeftNav", "onChangeRequest") => "(Boolean, String) => Callback"
      case ("LeftNav", "onRequestChange") => "(Boolean, String) => Callback"
      case ("ListItem", "onNestedListToggle") => "js.Any => Callback"
      case ("Menu", "onEscKeyDown") => "ReactKeyboardEventH => Callback"
      case ("Menu", "onItemTouchTap") => "(ReactUIEventH, JsComponentM[MuiMenuItemProps, _, TopNode]) => Callback"
      case ("Menu", "onChange") => "(ReactEventH, String | js.Array[String]) => Callback"
      case ("MenuItem", "onClick") => "ReactEventH => Callback"
      case ("Popover", "onRequestClose") => "Callback"
      case ("Popover", "animation") => "js.Any"
      case ("SelectField", "onBlur") => "ReactEventH => Callback"
      case ("SelectField", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("Slider", "onBlur") => "ReactEventH => Callback"
      case ("Slider", "onChange") => "(ReactEventH, Double) => Callback"
      case ("Slider", "onDragStart") => "ReactDragEventH => Callback"
      case ("Slider", "onDragStop") => "ReactDragEventH => Callback"
      case ("Slider", "onFocus") => "ReactFocusEventH => Callback"
      case ("Snackbar", "onActionTouchTap") => "ReactTouchEventH => Callback"
      case ("Snackbar", "onRequestClose") => "String => Callback"
      case ("RadioButtonGroup", "onChange") => "(ReactEventI, String) => Callback"
      case ("Toggle", "onToggle") => "(ReactEventI, Boolean) => Callback"
      case (_, "onRowSelection") if compName.value.startsWith("Table") => "String | js.Array[Int] => Callback"
      case (_, "onCellClick") if compName.value.startsWith("Table") => "(Int, Int) => Callback"
      case (_, "onRowHover") if compName.value.startsWith("Table") => "Int => Callback"
      case (_, "onRowHoverExit") if compName.value.startsWith("Table") => "Int => Callback"
      case (_, "onCellHover") if compName.value.startsWith("Table") => "(Int, Int) => Callback"
      case (_, "onCellHoverExit") if compName.value.startsWith("Table") => "(Int, Int) => Callback"
      case ("TableHeader", "onSelectAll") => "Boolean => Callback"
      case ("TableHeaderColumn", "onClick") => "(ReactEventH, Int) => Callback"
      case ("TableRow", "onRowClick") => "(ReactEventH, Int) => Callback"
      case ("TableRowColumn", "onClick") => "(ReactEventH, Int) => Callback"
      case ("TableRowColumn", "onHover") => "(ReactEventH, Int) => Callback"
      case ("TableRowColumn", "onHoverExit") => "(ReactEventH, Int) => Callback"
      case ("Tab", "onActive") => "ReactElement => Callback"
      case ("Tabs", "onChange") => "(String, ReactEventH, ReactElement) => Callback"
      case ("Tabs", "tabTemplate") => "js.Any"
      case ("TextField", "onBlur") => "ReactEventI => Callback"
      case ("TextField", "onChange") => "ReactEventI => Callback"
      case ("TextField", "onEnterKeyDown") => "ReactKeyboardEventI => Callback"
      case ("TimePicker", "onChange") => "(js.UndefOr[Nothing], js.Date) => Callback"
      case (_, "onBlur") => "ReactEventH => Callback"
      case (_, "onCheck") => "(ReactEventH, Boolean) => Callback"
      case (_, "onFocus") => "ReactFocusEventH => Callback"
      case (_, "onShow") => "Callback"
      case (_, "onDismiss") => "Callback"
      case (_, "onEnterKeyDown") => "ReactKeyboardEventH => Callback"
      case (_, "onKeyboardFocus") => "ReactKeyboardEventH => Callback"
      case (_, "onKeyDown") => "ReactKeyboardEventH => Callback"
      case (_, "onKeyUp") => "ReactKeyboardEventH => Callback"
      case (_, "onMouseEnter") => "ReactMouseEventH => Callback"
      case (_, "onMouseLeave") => "ReactMouseEventH => Callback"
      case (_, "onMouseUp") => "ReactMouseEventH => Callback"
      case (_, "onMouseDown") => "ReactMouseEventH => Callback"
      case (_, "onTouchStart") => "ReactTouchEventH => Callback"
      case (_, "onTouchEnd") => "ReactTouchEventH => Callback"
      case (_, "onTouchTap") => "ReactTouchEventH => Callback"
    }
}
