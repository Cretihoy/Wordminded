package com.cretihoy.wordminded.compose.presentation.components.input

import androidx.compose.runtime.MutableState
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class InputModel(
    val text: MutableState<String>? = null,
    val button: ButtonModel? = null
)