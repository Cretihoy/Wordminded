package com.cretihoy.wordminded.compose.presentation.screen.game

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.gameside.GameSideView

@Composable
fun GameHorizontalScreen(
    viewModel: GameViewModel
) {
    Row(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxSize()
    ) {
        if (viewModel?.gameSide?.value?.task?.textAttr?.value != null && viewModel?.gameSide?.value?.letter?.textAttr?.value != null) {
            GameSideView(viewModel.gameSide.value,
                Modifier
                    .weight(1f)
                    .rotate(180f),
                actionLetter = { viewModel.onClick() },
                actionTask = { viewModel.onClick() }
            )
            SpacerView()
            GameSideView(viewModel.gameSide.value, Modifier.weight(1f),
                actionLetter = { viewModel.onClick() },
                actionTask = { viewModel.onClick() }
            )
        } else {
            Log.d("asdasd", "NUL")
            Text(
                text = "Ну всё, пиздец, поиграли блеать.",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}