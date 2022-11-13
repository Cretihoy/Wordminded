package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.view.ButtonView
import com.cretihoy.wordminded.compose.presentation.view.ImageView
import com.cretihoy.wordminded.compose.presentation.view.SpacerView

@Composable
fun MenuScreen(
    navController: NavHostController,
    viewModel: MenuViewModel
) {
    ScreenContent(viewModel)
}

@Composable
private fun ScreenContent(
    viewModel: MenuViewModel? = null
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        ImageView(
            model = viewModel?.imageModel,
            modifier = Modifier.weight(1f)
        )
        SpacerView()
        ButtonView(viewModel?.startButtonModel)
        SpacerView()
        ButtonView(viewModel?.rulesButtonModel)
        SpacerView()
        ButtonView(viewModel?.settingsButtonModel)
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewScreenContent() {
    ScreenContent()
}