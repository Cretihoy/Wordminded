package com.cretihoy.wordminded.compose.presentation.components.input

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.modal.ModalView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.EMPTY_STRING
import com.cretihoy.wordminded.compose.presentation.theme.Shapes

@Composable
fun InputView(
    isShown: MutableState<Boolean>,
    model: InputModel,
    action: (String) -> Unit = {}
) {
    ModalView(isShown = isShown) {
        TextView(model.title)
        SpacerView()
        Row {
            TextField(
                modifier = Modifier
                    .weight(1f)
                    .clip(Shapes.medium)
                    .border(
                        1.dp,
                        colors.onBackground,
                        Shapes.medium
                    ),
                value = model.text?.value.orEmpty(),
                onValueChange = {
                    model.text?.value = it
                }
            )
            SpacerView(model.text, model.button)
            ButtonView(
                model = model.button,
                clickAction = {
                    if (model.text?.value.orEmpty().isNotEmpty()) {
                        action.invoke(model.text?.value.orEmpty())
                        model.text?.value = EMPTY_STRING
                        isShown.value = false
                    }
                })
        }
    }
}

@Preview
@Composable
fun PreviewInputView() {
    val model = InputModel(
        text = mutableStateOf("This is text"),
        button = ButtonModel(
            fontSize = mutableStateOf(18f),
            text = "Ok"
        )
    )
    InputView(
        isShown = mutableStateOf(true),
        model = model
    )
}