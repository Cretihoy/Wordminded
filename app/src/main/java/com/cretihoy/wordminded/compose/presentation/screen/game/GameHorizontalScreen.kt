package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.gameside.GameSideView
import com.cretihoy.wordminded.compose.presentation.screen.end.EndGameScreen
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun GameHorizontalScreen(
    viewModel: GameViewModel
) {
    Row(
        modifier = Modifier
            .padding(spacingLarge)
            .fillMaxSize()
    ) {
        if (viewModel?.gameSide?.value?.task?.textAttr?.value != null && viewModel?.gameSide?.value?.letter?.textAttr?.value != null) {
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
        } else {
            EndGameScreen(viewModel.endGameModel) {
                viewModel.newGame()
            }
        }
    }
}