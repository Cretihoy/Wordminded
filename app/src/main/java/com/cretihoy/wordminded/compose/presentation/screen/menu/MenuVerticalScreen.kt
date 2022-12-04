package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.image.ImageView
import com.cretihoy.wordminded.compose.presentation.components.users.UserPickerView
import com.cretihoy.wordminded.compose.presentation.screen.timer.TimerScreen
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge
import com.cretihoy.wordminded.extensions.openRulesScreen
import com.cretihoy.wordminded.extensions.openSettingsScreen

@Composable
fun MenuVerticalScreen(
    navController: NavHostController,
    viewModel: MenuViewModel
) {
    Box {
        Column(
            modifier = Modifier
                .padding(spacingLarge)
                .fillMaxSize()
        ) {
            ImageView(
                model = viewModel.imageModel,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
            )
            SpacerView()
            ButtonView(
                viewModel.startButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = {
                    viewModel.isUsersShown.value = true
//                    viewModel.isCounterShown.value = true
                }
            )
            SpacerView()
            ButtonView(
                viewModel.rulesButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = { navController.openRulesScreen() }
            )
            SpacerView()
            ButtonView(
                viewModel.settingsButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = { navController.openSettingsScreen() }
            )
        }
        TimerScreen(
            isShown = viewModel.isCounterShown,
            navController = navController,
            modifier = Modifier
        )
        UserPickerView(isShown = viewModel.isUsersShown)
    }
}