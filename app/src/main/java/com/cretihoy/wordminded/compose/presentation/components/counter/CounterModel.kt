package com.cretihoy.wordminded.compose.presentation.components.counter

import androidx.compose.runtime.MutableState
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class CounterModel(
    val fontSize: MutableState<Float>,
    val textAttr: Int? = null,
    val leftButton: ButtonModel? = null,
    val rightButton: ButtonModel? = null,
)