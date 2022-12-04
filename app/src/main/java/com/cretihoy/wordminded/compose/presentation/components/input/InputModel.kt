package com.cretihoy.wordminded.compose.presentation.components.input

import androidx.compose.runtime.MutableState
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel

data class InputModel(
    val title: TextModel? = null,
    val text: MutableState<String>? = null,
    val button: ButtonModel? = null
)