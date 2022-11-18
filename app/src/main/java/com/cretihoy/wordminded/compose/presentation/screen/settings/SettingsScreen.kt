package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun SettingsScreen(
    navController: NavHostController,
    viewModel: SettingsViewModel
) {
    ScreenContent(viewModel)
}

@Composable
private fun ScreenContent(
    viewModel: SettingsViewModel? = null
) {
    Column(
        Modifier
            .padding(spacingLarge)
    ) {
        TextView(viewModel?.settingsTitle, Modifier.weight(1f))
        SwitchView(viewModel?.orientationSettingsSwitch)
        CounterView(viewModel?.counterModel)
    }
}