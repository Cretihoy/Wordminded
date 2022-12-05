package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.rotate.RotateView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView

@Composable
fun RulesVerticalScreen(
    viewModel: RulesViewModel
) {
    RotateView(
        header = {
            TextView(
                modifier = it,
                model = viewModel.rulesTitle
            )
        },
        content = {
            Column {
                TextBlockView(viewModel.rulesOne)
                SpacerView()
                TextBlockView(viewModel.rulesTwo)
                SpacerView()
                TextBlockView(viewModel.rulesThree)
            }
        })
}