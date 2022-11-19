package com.cretihoy.wordminded.compose.presentation

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun RotateScreen(
    horizontal: @Composable () -> Unit,
    vertical: @Composable () -> Unit,
) {
    var orientation by remember { mutableStateOf(Configuration.ORIENTATION_PORTRAIT) }

    val configuration = LocalConfiguration.current
    // If our configuration changes then this will launch a new coroutine scope for it
    LaunchedEffect(configuration) {
        // Save any changes to the orientation value on the configuration object
        snapshotFlow { configuration.orientation }
            .collect { orientation = it }
    }

    when (orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            horizontal.invoke()
        }
        else -> {
            vertical.invoke()
        }
    }
}