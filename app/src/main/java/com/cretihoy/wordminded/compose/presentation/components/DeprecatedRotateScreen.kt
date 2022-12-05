package com.cretihoy.wordminded.compose.presentation.components

import android.content.res.Configuration
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalConfiguration

@Composable
@Deprecated("Replace it with RotateView later")
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