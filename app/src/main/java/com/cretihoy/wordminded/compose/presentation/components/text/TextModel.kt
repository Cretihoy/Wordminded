package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class TextModel(
    val fontSize: MutableState<Float> = mutableStateOf(18f),
    val textAttr: Int? = null,
    val isTitle: Boolean = false
)