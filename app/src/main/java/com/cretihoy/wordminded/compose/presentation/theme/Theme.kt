package com.cretihoy.wordminded.compose.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

private val LightColorPalette = lightColors(
    background = White,
    onBackground = Black,

    primary = LightBlue,
    primaryVariant = DarkBlue,
    onPrimary = White,

    secondary = LightRed,
    secondaryVariant = DarkRed,
    onSecondary = Black
)

private val DarkColorPalette = darkColors(
    background = Black,
    onBackground = White,

    primary = DarkBlue,
    primaryVariant = LightBlue,
    onPrimary = Black,

    secondary = DarkRed,
    secondaryVariant = LightRed,
    onSecondary = White
)

@Composable
fun WordmindedTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val viewModel = hiltViewModel<ThemeViewModel>()

    val altTheme = if (viewModel.isAltTheme.value) {
        !darkTheme
    } else {
        darkTheme
    }

    val colors = if (altTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}