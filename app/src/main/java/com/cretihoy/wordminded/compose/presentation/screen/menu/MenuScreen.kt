package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun MenuScreen(
    navController: NavHostController,
    viewModel: MenuViewModel
) {
    RotateScreen(
        horizontal = {
            MenuHorizontalScreen(
                navController = navController,
                viewModel = viewModel
            )
        },
        vertical = {
            MenuVerticalScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}