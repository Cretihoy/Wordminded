package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.image.ImageView
import com.cretihoy.wordminded.extensions.openGameScreen
import com.cretihoy.wordminded.extensions.openRulesScreen
import com.cretihoy.wordminded.extensions.openSettingsScreen

@Composable
fun MenuHorizontalScreen(
    navController: NavHostController,
    viewModel: MenuViewModel
) {
    Row(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        ImageView(
            model = viewModel.imageModel,
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically)
        ) {
            ButtonView(
                viewModel.startButtonModel,
                Modifier.fillMaxWidth(),
                clickAction = { navController.openGameScreen() }
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
}