package com.cretihoy.wordminded.compose.presentation.screen.end

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.screen.game.EndGameModel
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun EndGameVerticalScreen(
    model: EndGameModel,
    clickAction: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .padding(spacingMedium)
            .fillMaxSize()
    ) {
        TextView(
            model.title,
            Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        )
        SpacerView()
        ButtonView(
            model = model.button,
            modifier = Modifier.fillMaxWidth(),
            clickAction = clickAction
        )
    }
}