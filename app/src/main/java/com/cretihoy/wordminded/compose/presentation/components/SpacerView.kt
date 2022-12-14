package com.cretihoy.wordminded.compose.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun SpacerView(
    modifier: Modifier = Modifier
) {
    Spacer(modifier.size(spacingMedium))
}

@Composable
fun SpacerView(
    from: Any?,
    to: Any?,
    modifier: Modifier = Modifier
) {
    if (from != null && to != null) {
        Spacer(modifier.size(spacingMedium))
    }
}