package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView

@Composable
fun RulesScreen(
    navController: NavHostController,
    viewModel: RulesViewModel
) {
    ScreenContent(viewModel)
}

@Composable
private fun ScreenContent(
    viewModel: RulesViewModel? = null
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        TextView(viewModel?.rulesTitle, Modifier.weight(1f))
        SpacerView()
        TextBlockView(viewModel?.rulesOne)
        SpacerView()
        TextBlockView(viewModel?.rulesTwo)
        SpacerView()
        TextBlockView(viewModel?.rulesThree)
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewScreenContent() {
    ScreenContent()
}