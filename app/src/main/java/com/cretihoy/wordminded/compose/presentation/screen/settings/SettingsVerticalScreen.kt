package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun SettingsVerticalScreen(
    viewModel: SettingsViewModel
) {
    Column(
        Modifier
            .padding(spacingLarge)
    ) {
        TextView(
            viewModel.settingsTitle,
            Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        )
        SwitchView(viewModel.orientationSettingsSwitch)
        SpacerView()
        SwitchView(viewModel.themeSettingsSwitch)
        SpacerView()
        CounterView(viewModel.counterModel)
    }
}