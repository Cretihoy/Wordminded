package com.cretihoy.wordminded.compose.presentation.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun SpacerView(size: Dp = spacingMedium) {
    Spacer(modifier = Modifier.size(size))
}