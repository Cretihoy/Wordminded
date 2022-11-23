package com.cretihoy.wordminded.compose.presentation.components.image

import androidx.compose.runtime.MutableState

data class ImageModel(
    val src: Int,
    val srcAlt: Int,
    val isInverted: MutableState<Boolean>
)