package com.cretihoy.wordminded.compose.presentation.components.gameside

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView

@Composable
fun GameSideView(
    model: GameSideModel? = null,
    modifier: Modifier = Modifier,
    actionTask: () -> Unit = {},
    actionLetter: () -> Unit = {}
) {
    Column(modifier = modifier) {
        ButtonView(
            model?.task,
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .weight(1f),
            clickAction = actionTask
        )
        SpacerView()
        ButtonView(
            model?.letter,
            Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .weight(1f),
            clickAction = actionLetter
        )
    }
}