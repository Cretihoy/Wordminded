package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.image.ImageView
import com.cretihoy.wordminded.compose.presentation.screen.timer.TimerScreen
import com.cretihoy.wordminded.compose.presentation.screen.timer.TimerViewModel
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge
import com.cretihoy.wordminded.extensions.openRulesScreen
import com.cretihoy.wordminded.extensions.openSettingsScreen

@Composable
fun MenuHorizontalScreen(
    navController: NavHostController,
    viewModel: MenuViewModel
) {
    Box {
        Row(
            modifier = Modifier
                .padding(spacingLarge)
                .fillMaxSize()
        ) {
            ImageView(
                model = viewModel.imageModel,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                ButtonView(
                    viewModel.startButtonModel,
                    Modifier.fillMaxWidth(),
                    clickAction = { viewModel.isShown.value = true }
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
        }
        if (viewModel.isShown.value) {
            val timerViewModel = hiltViewModel<TimerViewModel>()
            TimerScreen(
                isShown = viewModel.isShown,
                navController = navController,
                viewModel = timerViewModel,
                modifier = Modifier
            )
        }
    }
}