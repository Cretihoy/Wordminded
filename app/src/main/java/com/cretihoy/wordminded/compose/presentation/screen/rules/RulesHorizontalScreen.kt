package com.cretihoy.wordminded.compose.presentation.screen.rules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockView
import com.cretihoy.wordminded.compose.presentation.theme.Shapes

@Composable
fun RulesHorizontalScreen(
    viewModel: RulesViewModel
) {
    Row(
        modifier = Modifier
            .padding(32.dp)
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
                .clip(shape = Shapes.large)
                .align(Alignment.CenterVertically)
                .verticalScroll(rememberScrollState())
        ) {
            TextBlockView(viewModel.rulesOne)
            SpacerView()
            TextBlockView(viewModel.rulesTwo)
            SpacerView()
            TextBlockView(viewModel.rulesThree)
        }
    }
}