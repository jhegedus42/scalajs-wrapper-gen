package com.olvind.muigen

object FunctionTypes {
  def apply(compName: String, name: String): String =
    (compName, name) match {
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

      case ("MuiAppBar", "onLeftIconButtonTouchTap") => "ReactTouchEventH => Callback"
      case ("MuiAppBar", "onRightIconButtonTouchTap") => "ReactTouchEventH => Callback"
      case ("MuiAppBar", "onTitleTouchTap") => "ReactTouchEventH => Callback"
      case ("MuiAutoComplete", "onNewRequest") => "(js.Any, Int, js.Array[js.Any] | js.Any) => Callback"
      case ("MuiAutoComplete", "onUpdateInput") => "(String, js.Array[js.Any] | js.Any) => Callback"
      case ("MuiAutoComplete", "filter") => "(String, String, js.UndefOr[js.Any]) => Callback"
      case ("MuiCard", "onExpandChange") => "Boolean => Callback"
      case ("MuiCardExpandable", "onExpanding") => "Callback"
      case ("MuiDatePicker", "DateTimeFormat") => "js.Function"
      case ("MuiDatePicker", "onChange") => "(js.UndefOr[Nothing], js.Date) => Callback"
      case ("MuiDatePicker", "shouldDisableDate") => "js.Date => Boolean"
      case ("MuiDatePicker", "formatDate") => "js.Date => String"
      case ("MuiDatePickerDialog", "onAccept") => "js.Date => Callback"
      case ("MuiDatePickerDialog", "DateTimeFormat") => "js.Function"
      case ("MuiDatePickerDialog", "shouldDisableDate") => "js.Date => Boolean"
      case ("MuiDialog", "onRequestClose") => "Boolean => Callback"
      case ("MuiDialogInline", "onRequestClose") => "Boolean => Callback"
      case ("MuiDropDownIcon", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("MuiDropDownMenu", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("MuiEnhancedButton", "onBlur") => "ReactEventH => Callback"
      case ("MuiIconButton", "onBlur") => "ReactEventH => Callback"
      case ("MuiIconMenu", "onItemTouchTap") => "(ReactTouchEventH, ReactElement) => Callback"
      case ("MuiIconMenu", "onChange") => "(ReactEventH, js.UndefOr[String]) => Callback"
      case ("MuiLeftNav", "onChange") => "(ReactEventH, Int, js.Any) => Callback"
      case ("MuiLeftNav", "onNavOpen") => "Callback"
      case ("MuiLeftNav", "onNavClose") => "Callback"
      case ("MuiLeftNav", "onChangeRequest") => "(Boolean, String) => Callback"
      case ("MuiListItem", "onNestedListToggle") => "js.Any => Callback"
      case ("MuiMenu", "onEscKeyDown") => "ReactKeyboardEventH => Callback"
      case ("MuiMenu", "onItemTouchTap") => "(ReactTouchEventH, ReactElement) => Callback"
      case ("MuiMenu", "onChange") => "(ReactEventH, String | js.Array[String]) => Callback"
      case ("MuiMenuItem", "onClick") => "ReactEventH => Callback"
      case ("MuiPopover", "onRequestClose") => "Callback"
      case ("MuiSelectField", "onBlur") => "ReactEventH => Callback"
      case ("MuiSelectField", "onChange") => "(ReactEventI, Int, js.Any) => Callback"
      case ("MuiSlider", "onBlur") => "ReactEventH => Callback"
      case ("MuiSlider", "onChange") => "(ReactEventI, Double) => Callback"
      case ("MuiSlider", "onDragStart") => "ReactDragEventH => Callback"
      case ("MuiSlider", "onDragStop") => "ReactDragEventH => Callback"
      case ("MuiSnackbar", "onActionTouchTap") => "ReactTouchEventH => Callback"
      case ("MuiRadioButtonGroup", "onChange") => "(ReactEventI, String) => Callback"
      case ("MuiToggle", "onToggle") => "(ReactEventI, Boolean) => Callback"
      case (_, "onRowSelection") if compName.startsWith("MuiTable") => "String | js.Array[Int] => Callback"
      case (_, "onCellClick") if compName.startsWith("MuiTable") => "(Int, Int) => Callback"
      case (_, "onRowHover") if compName.startsWith("MuiTable") => "Int => Callback"
      case (_, "onRowHoverExit") if compName.startsWith("MuiTable") => "Int => Callback"
      case (_, "onCellHover") if compName.startsWith("MuiTable") => "(Int, Int) => Callback"
      case (_, "onCellHoverExit") if compName.startsWith("MuiTable") => "(Int, Int) => Callback"
      case ("MuiTableHeader", "onSelectAll") => "Boolean => Callback"
      case ("MuiTableHeaderColumn", "onClick") => "(ReactEventH, Int) => Callback"
      case ("MuiTableRow", "onRowClick") => "(ReactEventH, Int) => Callback"
      case ("MuiTableRowColumn", "onClick") => "(ReactEventH, Int) => Callback"
      case ("MuiTableRowColumn", "onHover") => "(ReactEventH, Int) => Callback"
      case ("MuiTableRowColumn", "onHoverExit") => "(ReactEventH, Int) => Callback"
      case ("MuiTab", "onActive") => "ReactElement => Callback"
      case ("MuiTabs", "onChange") => "(String, ReactEventH, ReactElement) => Callback"
      case ("MuiTabs", "tabTemplate") => "js.Any"
      case ("MuiTextField", "onBlur") => "ReactEventI => Callback"
      case ("MuiTextField", "onChange") => "ReactEventI => Callback"
      case ("MuiTextField", "onEnterKeyDown") => "ReactKeyboardEventI => Callback"
      case ("MuiTimePicker", "onChange") => "(js.UndefOr[Nothing], js.Date) => Callback"
    }
}
