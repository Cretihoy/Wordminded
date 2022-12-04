package com.cretihoy.wordminded.compose.presentation.components.user

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView

@Composable
fun UserView(
    model: UserModel,
    action: (UserModel) -> Unit = {},
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        ButtonView(model.nameButton, Modifier.weight(1f))
        SpacerView()
        ButtonView(model.removeButton, clickAction = {
            action.invoke(model)
        })
    }
}

@Preview
@Composable
fun PreviewUserView() {
    val model = UserModel(
        id = 123,
        nameButton = ButtonModel(
            fontSize = mutableStateOf(18f),
            text = "Sashka"
        ),
        removeButton = ButtonModel(
            fontSize = mutableStateOf(18f),
            textAttr = mutableStateOf(R.string.plus)
        )
    )
    UserView(model)
}