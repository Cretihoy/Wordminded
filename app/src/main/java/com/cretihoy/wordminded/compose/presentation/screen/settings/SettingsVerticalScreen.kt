package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterView
import com.cretihoy.wordminded.compose.presentation.components.dialog.DialogView
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge
import com.cretihoy.wordminded.extensions.openUsersScreen

@Composable
fun SettingsVerticalScreen(
    viewModel: SettingsViewModel,
    navController: NavHostController
) {
    Box {
        Column(
            Modifier
                .padding(spacingLarge)
        ) {
            TextView(
                viewModel.settingsTitle,
                Modifier
                    .weight(1f)
                    .align(CenterHorizontally)
            )
            SwitchView(viewModel.orientationSettingsSwitch)
            SpacerView()
            SwitchView(viewModel.themeSettingsSwitch)
            SpacerView()
            SwitchView(viewModel.infinityGameSwitch)
            SpacerView()
            CounterView(viewModel.counterModel)
            SpacerView()
            ButtonView(viewModel.manageUsersButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = {
                    navController.openUsersScreen()
                })
            SpacerView(viewModel.manageUsersButtonModel, viewModel.resetSettingsButtonModel)
            ButtonView(viewModel.resetSettingsButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = {
                    viewModel.isShown.value = true
                })
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
