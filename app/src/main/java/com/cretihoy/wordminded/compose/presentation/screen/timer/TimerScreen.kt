package com.cretihoy.wordminded.compose.presentation.screen.timer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge
import com.cretihoy.wordminded.extensions.openGameScreen

@Composable
fun TimerScreen(
    isShown: MutableState<Boolean>,
    navController: NavHostController,
    viewModel: TimerViewModel,
    modifier: Modifier
) {
    Box(contentAlignment = Alignment.Center) {
        Box(
            Modifier
                .clickable {
                    isShown.value = false
                }
                .fillMaxSize()
                .alpha(0.1f)
                .background(colors.onBackground)
        )

        Column(
            modifier = modifier
                .clip(Shapes.large)
                .background(colors.background)
                .padding(spacingLarge)
        ) {
            if (viewModel.counterText.value == null) {
                viewModel.loadGameScreen()
            }
            TextView(viewModel.titleModel)
            TextView(
                model = viewModel.counterText.value,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            if (viewModel.canIGoNow.value) {
                navController.openGameScreen()
                isShown.value = false
                viewModel.canIGoNow.value = false
                viewModel.counterText.value = null
            }
        }
    }
}