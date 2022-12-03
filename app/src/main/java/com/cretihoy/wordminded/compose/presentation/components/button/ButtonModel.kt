package com.cretihoy.wordminded.compose.presentation.components.button

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class ButtonModel(
    val fontSize: MutableState<Float>,
    val text: String? = null,
    val textAttr: MutableState<Int?> = mutableStateOf(null),
    val isSecondary: Boolean = false
)