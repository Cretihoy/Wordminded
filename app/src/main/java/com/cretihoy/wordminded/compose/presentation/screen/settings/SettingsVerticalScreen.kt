package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun SettingsVerticalScreen(
    navController: NavHostController,
    viewModel: SettingsViewModel
) {
    Column(
        Modifier
            .padding(spacingLarge)
    ) {
        TextView(viewModel.settingsTitle, Modifier.weight(1f))
        SwitchView(viewModel.orientationSettingsSwitch)
        CounterView(viewModel.counterModel)
    }
}