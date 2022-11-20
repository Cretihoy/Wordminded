package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun SettingsScreen(
    navController: NavHostController,
    viewModel: SettingsViewModel
) {
    RotateScreen(
        horizontal = {
            SettingsHorizontalScreen(
                navController = navController,
                viewModel = viewModel
            )
        },
        vertical = {
            SettingsVerticalScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}