package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun RulesVerticalScreen(
    viewModel: RulesViewModel
) {
    Column(
        modifier = Modifier
            .padding(spacingLarge)
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