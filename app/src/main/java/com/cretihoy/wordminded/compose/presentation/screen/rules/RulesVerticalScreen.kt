package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView

@Composable
fun RulesVerticalScreen(
    viewModel: RulesViewModel
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        TextView(
            viewModel.rulesTitle,
            Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        )
        SpacerView()
        TextBlockView(viewModel.rulesOne)
        SpacerView()
        TextBlockView(viewModel.rulesTwo)
        SpacerView()
        TextBlockView(viewModel.rulesThree)
    }
}