package com.cretihoy.wordminded.compose.presentation.components.dialog

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.modal.ModalView
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.minWidth

@Composable
fun DialogView(
    isShown: MutableState<Boolean>,
    model: DialogModel? = null,
    modifier: Modifier = Modifier,
    leftClick: () -> Unit = {},
    rightClick: () -> Unit = {}
) {
    model?.let {
        ModalView(
            isShown = isShown,
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextView(model.title)
            SpacerView(model.title, model.description)
            TextView(model.description)
            SpacerView()
            Row {
                ButtonView(
                    model.leftButton,
                    clickAction = leftClick,
                    modifier = Modifier.sizeIn(minWidth = minWidth)
                )
                SpacerView(model.leftButton, model.rightButton)
                ButtonView(
                    model.rightButton,
                    clickAction = rightClick,
                    modifier = Modifier.sizeIn(minWidth = minWidth)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewDialog() {
    val model = DialogModel(
        title = TextModel(
            fontSize = mutableStateOf(18f),
            text = "Oh, shit!",
            isTitle = false
        ),
        leftButton = ButtonModel(
            fontSize = mutableStateOf(18f),
            text = "yes"
        ),
        rightButton = ButtonModel(
            fontSize = mutableStateOf(18f),
            text = "no"
        ),
    )
    DialogView(isShown = mutableStateOf(true), model = model)
}