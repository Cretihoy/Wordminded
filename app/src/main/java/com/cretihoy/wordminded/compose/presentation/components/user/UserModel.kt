package com.cretihoy.wordminded.compose.presentation.components.user

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel

data class UserModel(
    val id: Long,
    var score: Long,
    val nameButton: ButtonModel,
    val removeButton: ButtonModel
)