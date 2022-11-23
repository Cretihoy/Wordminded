package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView

@Composable
fun SettingsHorizontalScreen(
    viewModel: SettingsViewModel
) {
    Row(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        TextView(
            viewModel.settingsTitle,
            Modifier
                .weight(1f)
                .align(CenterVertically)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically)
        ) {
            SwitchView(viewModel.orientationSettingsSwitch)
            SpacerView()
            SwitchView(viewModel.themeSettingsSwitch)
            SpacerView()
            CounterView(viewModel.counterModel)
        }
    }
}