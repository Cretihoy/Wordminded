package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.runtime.Composable
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun RulesScreen(
    viewModel: RulesViewModel
) {
    RotateScreen(
        horizontal = {
            RulesHorizontalScreen(
                viewModel = viewModel
            )
        },
        vertical = {
            RulesVerticalScreen(
                viewModel = viewModel
            )
        }
    )
}
