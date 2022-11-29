package com.cretihoy.wordminded.compose.presentation.screen.end

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.screen.game.EndGameModel

@Composable
fun EndGameHorizontalScreen(
    model: EndGameModel,
    clickAction: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        TextView(
            model.title,
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        SpacerView()
        ButtonView(
            model = model.button,
            modifier = Modifier.fillMaxWidth(),
            clickAction = clickAction
        )
    }
}