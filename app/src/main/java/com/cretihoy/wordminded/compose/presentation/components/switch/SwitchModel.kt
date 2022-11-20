package com.cretihoy.wordminded.compose.presentation.components.switch

import androidx.compose.runtime.MutableState

data class SwitchModel(
    val fontSize: MutableState<Float>,
    val textAttr: Int? = null,
    var isChecked: Boolean = false,
)