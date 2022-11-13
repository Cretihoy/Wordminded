package com.cretihoy.wordminded.compose.presentation.view

data class ButtonModel(
    val textAttr: Int? = null,
    val isSecondary: Boolean = false,
    val action: () -> Unit = {}
)