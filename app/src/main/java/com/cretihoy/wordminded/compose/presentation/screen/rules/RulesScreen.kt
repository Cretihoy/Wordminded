package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun RulesScreen(
    navController: NavHostController,
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
