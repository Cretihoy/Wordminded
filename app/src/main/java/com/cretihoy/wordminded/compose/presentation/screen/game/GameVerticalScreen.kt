package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.gameside.GameSideView
import com.cretihoy.wordminded.compose.presentation.screen.end.EndGameScreen

@Composable
fun GameVerticalScreen(
    viewModel: GameViewModel
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        if (viewModel.task?.value != null && viewModel.letter?.value != null) {
            GameSideView(viewModel.gameSide.value,
                Modifier
                    .weight(1f)
                    .rotate(180f),
                actionLetter = { viewModel.onClick() },
                actionTask = { viewModel.onClick() }
            )
            SpacerView()
            GameSideView(
                viewModel.gameSide.value, Modifier.weight(1f),
                actionLetter = { viewModel.onClick() },
                actionTask = { viewModel.onClick() }
            )
        } else {
            EndGameScreen(viewModel.endGameModel) {
                viewModel.newGame()
            }
        }
    }
}