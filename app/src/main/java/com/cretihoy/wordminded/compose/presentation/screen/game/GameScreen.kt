package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.SpacerView

@Composable
fun GameScreen(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    ScreenContent(viewModel)
}

@Composable
private fun ScreenContent(
    viewModel: GameViewModel? = null
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        ButtonView(viewModel?.topTask)
        SpacerView()
        ButtonView(viewModel?.topLetter)
        SpacerView()
        ButtonView(viewModel?.bottomTask)
        SpacerView()
        ButtonView(viewModel?.bottomLetter)
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewScreenContent() {
    ScreenContent()
}
