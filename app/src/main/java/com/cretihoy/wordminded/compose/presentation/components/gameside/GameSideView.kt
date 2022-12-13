package com.cretihoy.wordminded.compose.presentation.components.gameside

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.EMPTY_STRING
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.icCheck
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun GameSideView(
    icon: ImageVector? = null,
    model: GameSideModel? = null,
    modifier: Modifier = Modifier,
    actionTask: () -> Unit = {},
    actionLetter: () -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        GameSideLayout(
            model = model
        ) {
            ButtonView(
                model = model?.task,
                clickAction = actionTask,
                modifier = it
            )
            SpacerView()
            ButtonView(
                model = model?.letter,
                clickAction = actionLetter,
                modifier = it
            )
        }
        icon?.let {
            Icon(
                imageVector = it,
                contentDescription = EMPTY_STRING,
                modifier = Modifier
                    .scale(2f)
                    .clip(Shapes.large)
                    .background(colors.onError)
                    .padding(spacingLarge)
            )
        }
    }
}

@Composable
fun GameSideLayout(
    model: GameSideModel? = null,
    modifier: Modifier = Modifier,
    content: @Composable (modifier: Modifier) -> Unit = {}
) {
    if (model?.isHorizontal?.value == true) {
        Column(modifier = modifier) {
            Row(modifier = Modifier.weight(1f)) {
                content.invoke(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                )
            }
            TextView(model.name)
        }
    } else {
        Column(modifier = modifier) {
            content.invoke(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            )
            TextView(model?.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGameSide() {
    val fontSize = mutableStateOf(18f)
    val isHorizontal = mutableStateOf(true)
    val model = GameSideModel(
        name = TextModel(
            fontSize = fontSize,
            text = "Sashka",
            isTitle = true
        ),
        task = ButtonModel(
            fontSize = fontSize,
            text = "Task",
            isSecondary = true
        ),
        letter = ButtonModel(
            fontSize = fontSize,
            text = "Letter"
        ),
        isHorizontal = isHorizontal
    )
    Column {
        GameSideView(
            icon = icCheck,
            model = model,
            modifier = Modifier
                .weight(1f)
                .rotate(180f)
        )
        SpacerView()
        GameSideView(
            icon = icCheck,
            model = model,
            modifier = Modifier.weight(1f)
        )
    }
}