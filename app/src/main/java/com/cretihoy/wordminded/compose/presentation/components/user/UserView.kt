package com.cretihoy.wordminded.compose.presentation.components.user

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView

@Composable
fun UserView(
    model: UserModel
) {
    Row {
        ButtonView(model.nameButton)
        SpacerView()
        ButtonView(model.editButton)
        SpacerView()
        ButtonView(model.removeButton)
    }
}