package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun RulesHorizontalScreen(
    viewModel: RulesViewModel
) {
    Row(
        modifier = Modifier
            .padding(end = spacingLarge)
            .fillMaxSize()
    ) {
        TextView(
            viewModel.rulesTitle,
            Modifier
                .weight(1f)
                .align(CenterVertically)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically)
                .verticalScroll(rememberScrollState())
        ) {
            SpacerView(Modifier.size(spacingLarge))
            TextBlockView(viewModel.rulesOne)
            SpacerView()
            TextBlockView(viewModel.rulesTwo)
            SpacerView()
            TextBlockView(viewModel.rulesThree)
            SpacerView(Modifier.size(spacingLarge))
        }
    }
}