package com.cretihoy.wordminded.compose.presentation.screen.end

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.rotate.RotateView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.screen.game.EndGameModel

@Composable
fun EndGameVerticalScreen(
    model: EndGameModel,
    clickAction: () -> Unit = {}
) {
    RotateView(
        header = {
            TextView(
                model.title,
                modifier = it
            )
        },
        content = {
            SpacerView()
            ButtonView(
                model = model.button,
                modifier = Modifier.fillMaxWidth(),
                clickAction = clickAction
            )
        })
}