package com.cretihoy.wordminded.compose.presentation.components.user

import androidx.compose.runtime.MutableState
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class UserModel(
    val id: Long,
    var score: MutableState<Int?>,
    val nameButton: ButtonModel,
    val removeButton: ButtonModel
)