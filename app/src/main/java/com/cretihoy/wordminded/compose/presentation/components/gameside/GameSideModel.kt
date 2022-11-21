package com.cretihoy.wordminded.compose.presentation.components.gameside

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class GameSideModel(
    val task: ButtonModel? = null,
    val letter: ButtonModel? = null
)