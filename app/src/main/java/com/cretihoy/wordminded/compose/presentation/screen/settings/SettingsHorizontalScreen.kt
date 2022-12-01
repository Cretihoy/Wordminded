package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.dialog.DialogView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun SettingsHorizontalScreen(
    viewModel: SettingsViewModel
) {
    Box {
        Row(
            Modifier
                .padding(end = spacingLarge)
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
                    .padding(end = spacingLarge)
                    .verticalScroll(rememberScrollState())
            ) {
                SwitchView(viewModel.orientationSettingsSwitch)
                SpacerView()
                SwitchView(viewModel.themeSettingsSwitch)
                SpacerView()
                SwitchView(viewModel.infinityGameSwitch)
                SpacerView()
                CounterView(viewModel.counterModel)
                SpacerView()
                ButtonView(viewModel.resetSettingsButtonModel,
                    Modifier.fillMaxWidth(),
                    clickAction = {
                        viewModel.isShown.value = true
                    })
            }
        }
        DialogView(
            viewModel.isShown,
            model = viewModel.dialog,
            leftClick = {
                viewModel.isShown.value = false
            }, rightClick = {
                viewModel.onResetSettingsClicked()
                viewModel.isShown.value = false
            }
        )
    }
}
