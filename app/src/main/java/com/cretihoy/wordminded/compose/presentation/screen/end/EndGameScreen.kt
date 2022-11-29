package com.cretihoy.wordminded.compose.presentation.screen.end

import androidx.compose.runtime.Composable
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen
import com.cretihoy.wordminded.compose.presentation.screen.game.EndGameModel

@Composable
fun EndGameScreen(
    model: EndGameModel,
    clickAction: () -> Unit = {}
) {
    RotateScreen(
        horizontal = {
            EndGameHorizontalScreen(
                model = model,
                clickAction = clickAction
            )
        },
        vertical = {
            EndGameVerticalScreen(
                model = model,
                clickAction = clickAction
            )
        }
    )
}