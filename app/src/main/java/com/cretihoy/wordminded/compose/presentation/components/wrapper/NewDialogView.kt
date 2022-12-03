package com.cretihoy.wordminded.compose.presentation.components.wrapper

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun NewDialogView(
    isShown: MutableState<Boolean>,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    if (isShown.value) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .clickable { isShown.value = false }
                .fillMaxSize()
                .alpha(0.1f)
                .background(MaterialTheme.colors.onBackground)) {
            Column(
                modifier = Modifier
                    .padding(spacingMedium)
                    .clip(Shapes.large)
                    .background(MaterialTheme.colors.background)
                    .padding(spacingMedium)
            ) {
                content.invoke()
            }
        }
    }
}

@Preview
@Composable
fun PreviewDialogView() {
    val model = ButtonModel(
        fontSize = mutableStateOf(18f),
        text = "Button"
    )
    NewDialogView(mutableStateOf(true)) {
        Column {
            Text(text = "BLAHBLAH")
            SpacerView()
            Text(text = "This is text")
            SpacerView()
            ButtonView(model)
        }
    }
}


















