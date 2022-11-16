package com.cretihoy.wordminded.compose.presentation.components.counter

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class CounterModel(
    val textAttr: Int? = null,
    val value: Int? = null,
    val leftButton: ButtonModel? = null,
    val rightButton: ButtonModel? = null,
)