package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.Composable
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun GameScreen(
    viewModel: GameViewModel
) {
    RotateScreen(
        horizontal = {
            GameHorizontalScreen(
                viewModel = viewModel
            )
        },
        vertical = {
            GameVerticalScreen(
                viewModel = viewModel
            )
        }
    )
}