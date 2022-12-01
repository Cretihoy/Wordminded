package com.cretihoy.wordminded.compose.presentation.screen.end

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.screen.game.EndGameModel
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun EndGameHorizontalScreen(
    model: EndGameModel,
    clickAction: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .padding(spacingLarge)
            .fillMaxSize()
    ) {
        TextView(
            model.title,
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        ) {
            ButtonView(
                model = model.button,
                modifier = Modifier.fillMaxWidth(),
                clickAction = clickAction,

                )
        }
    }
}