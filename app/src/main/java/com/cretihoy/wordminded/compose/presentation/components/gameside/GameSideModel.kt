package com.cretihoy.wordminded.compose.presentation.components.gameside

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class GameSideModel(
    val task: ButtonModel? = null,
    val letter: ButtonModel? = null,
    val isHorizontal: MutableState<Boolean> = mutableStateOf(false),
    val isInfinityGame: MutableState<Boolean> = mutableStateOf(false)
)