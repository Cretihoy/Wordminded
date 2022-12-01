package com.cretihoy.wordminded.compose.presentation.components.dialog

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel

data class DialogModel(
    val title: TextModel? = null,
    val description: TextModel? = null,
    val leftButton: ButtonModel? = null,
    val rightButton: ButtonModel? = null,
)