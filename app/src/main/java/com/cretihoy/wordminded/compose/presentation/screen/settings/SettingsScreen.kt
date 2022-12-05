package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel,
    navController: NavHostController
) {
    RotateScreen(
        horizontal = {
            SettingsHorizontalScreen(
                viewModel = viewModel,
                navController = navController
            )
        },
        vertical = {
            SettingsVerticalScreen(
                viewModel = viewModel,
                navController = navController
            )
        }
    )
}