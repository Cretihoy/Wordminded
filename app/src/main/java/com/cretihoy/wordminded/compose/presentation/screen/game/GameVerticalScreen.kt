package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.gameside.GameSideView

@Composable
fun GameVerticalScreen(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        GameSideView(viewModel.gameSide.value,
            Modifier
                .weight(1f)
                .rotate(180f),
            actionLetter = { viewModel.onClick() },
            actionTask = { viewModel.onClick() }
        )
        SpacerView()
        GameSideView(viewModel.gameSide.value, Modifier.weight(1f),
            actionLetter = { viewModel.onClick() },
            actionTask = { viewModel.onClick() }
        )
    }
}