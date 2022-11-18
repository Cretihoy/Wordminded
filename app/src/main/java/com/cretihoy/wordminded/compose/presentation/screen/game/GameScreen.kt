package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView

@Composable
fun GameScreen(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        ButtonView(viewModel.topLetter,
            Modifier
                .fillMaxWidth()
                .weight(1f))
        SpacerView()
        ButtonView(viewModel.topTask,
            Modifier
                .fillMaxWidth()
                .weight(1f))
        SpacerView()
        ButtonView(viewModel.bottomTask,
            Modifier
                .fillMaxWidth()
                .weight(1f))
        SpacerView()
        ButtonView(viewModel.bottomLetter,
            Modifier
                .fillMaxWidth()
                .weight(1f))
    }
}