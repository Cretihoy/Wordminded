package com.cretihoy.wordminded.compose.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = LightBlue,
    primaryVariant = DarkBlue,
    onPrimary = White,

    secondary = LightRed,
    secondaryVariant = DarkRed,
    onSecondary = Black
)

private val DarkColorPalette = darkColors(
    primary = DarkBlue,
    primaryVariant = LightBlue,
    onPrimary = Black,

    secondary = DarkRed,
    secondaryVariant = LightRed,
    onSecondary = White
)

@Composable
fun WordmindedTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
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