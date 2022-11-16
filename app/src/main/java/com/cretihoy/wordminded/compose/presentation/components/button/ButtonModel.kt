package com.cretihoy.wordminded.compose.presentation.components.button

data class ButtonModel(
    val textAttr: Int? = null,
    val isSecondary: Boolean = false,
    val action: () -> Unit = {}
)