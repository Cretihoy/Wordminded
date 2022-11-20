package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.RotateScreen

@Composable
fun RulesScreen(
    navController: NavHostController,
    viewModel: RulesViewModel
) {
    RotateScreen(
        horizontal = {
            RulesHorizontalScreen(
                navController = navController,
                viewModel = viewModel
            )
        },
        vertical = {
            RulesVerticalScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}
