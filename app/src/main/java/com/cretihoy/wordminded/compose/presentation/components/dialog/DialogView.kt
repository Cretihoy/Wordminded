package com.cretihoy.wordminded.compose.presentation.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.minWidth
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun DialogView(
    isShown: MutableState<Boolean>,
    model: DialogModel? = null,
    modifier: Modifier = Modifier,
    leftClick: () -> Unit = {},
    rightClick: () -> Unit = {}
) {
    if (isShown.value) {
        model?.let {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Box(
                    Modifier
                        .clickable {
                            isShown.value = false
                        }
                        .fillMaxSize()
                        .alpha(0.1f)
                        .background(colors.onBackground))
                Column(
                    modifier = modifier
                        .padding(spacingMedium)
                        .clip(Shapes.large)
                        .background(colors.background)
                        .padding(spacingMedium)
                ) {
                    TextView(
                        model = model.title,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
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
            textAttr = mutableStateOf(R.string.app_name),
        ),
        rightButton = ButtonModel(
            fontSize = mutableStateOf(18f),
            textAttr = mutableStateOf(R.string.app_name),
        ),
    )
    DialogView(isShown = mutableStateOf(true), model = model)
}