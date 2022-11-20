package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.RotateScreen
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuHorizontalScreen
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuVerticalScreen

@Composable
fun GameScreen(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    RotateScreen(
        horizontal = {
            GameHorizontalScreen(
                navController = navController,
                viewModel = viewModel
            )
        },
        vertical = {
            GameVerticalScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}