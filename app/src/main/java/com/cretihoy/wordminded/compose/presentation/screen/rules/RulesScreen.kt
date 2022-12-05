package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.rotate.RotateView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun RulesScreen(
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
            Column(
                modifier = it
            ) {
                SpacerView(Modifier.size(spacingLarge))
                TextBlockView(viewModel.rulesOne)
                SpacerView()
                TextBlockView(viewModel.rulesTwo)
                SpacerView()
                TextBlockView(viewModel.rulesThree)
                SpacerView(Modifier.size(spacingLarge))
            }
        })
}