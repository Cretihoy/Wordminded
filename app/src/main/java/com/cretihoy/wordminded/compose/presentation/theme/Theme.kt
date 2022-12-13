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
    onPrimary = White,
    primaryVariant = DarkBlue,

    onError = LightYellow,

    secondary = LightRed,
    onSecondary = Black,
    secondaryVariant = DarkRed
)

private val DarkColorPalette = darkColors(
    background = Black,
    onBackground = White,

    primary = DarkBlue,
    onPrimary = Black,
    primaryVariant = LightBlue,

    onError = DarkYellow,

    secondary = DarkRed,
    onSecondary = White,
    secondaryVariant = LightRed
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