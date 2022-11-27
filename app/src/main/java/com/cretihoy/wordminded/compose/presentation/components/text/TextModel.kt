package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.runtime.MutableState
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel

data class TextModel(
    val fontSize: MutableState<Float>,
    val text: String? = null,
    val textAttr: Int? = null,
    val isTitle: Boolean = false,
    val image: ImageModel? = null
)