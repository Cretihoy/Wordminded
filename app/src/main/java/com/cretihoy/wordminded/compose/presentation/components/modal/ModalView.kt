package com.cretihoy.wordminded.compose.presentation.components.modal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun ModalView(
    isShown: MutableState<Boolean>,
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit
) {
    if (isShown.value) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .clickable { isShown.value = false }
                    .fillMaxSize()
                    .alpha(0.1f)
                    .background(colors.onBackground))
            Column(
                verticalArrangement = verticalArrangement,
                horizontalAlignment = horizontalAlignment,
                modifier = modifier
                    .padding(spacingMedium)
                    .clip(Shapes.large)
                    .background(colors.background)
                    .padding(spacingMedium)
            ) {
                content.invoke(this)
            }
        }
    }
}

@Preview
@Composable
fun PreviewModalView() {
    ModalView(mutableStateOf(true)) {
        Box(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxSize()
        )
    }
}