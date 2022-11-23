package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.RotateScreen

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel
) {
    RotateScreen(
        horizontal = {
            SettingsHorizontalScreen(
                viewModel = viewModel
            )
        },
        vertical = {
            SettingsVerticalScreen(
                viewModel = viewModel
            )
        }
    )
}