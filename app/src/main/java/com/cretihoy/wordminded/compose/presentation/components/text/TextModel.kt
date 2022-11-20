package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.runtime.MutableState

data class TextModel(
    val fontSize: MutableState<Float>,
    val textAttr: Int? = null,
    val isTitle: Boolean = false
)