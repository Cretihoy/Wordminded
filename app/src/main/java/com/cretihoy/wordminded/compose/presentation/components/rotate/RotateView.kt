package com.cretihoy.wordminded.compose.presentation.components.rotate

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun RotateView(
    header: @Composable (modifier: Modifier) -> Unit,
    content: @Composable (modifier: Modifier) -> Unit,
) {
    var orientation by remember { mutableStateOf(Configuration.ORIENTATION_PORTRAIT) }

    val configuration = LocalConfiguration.current
    LaunchedEffect(configuration) {
        snapshotFlow { configuration.orientation }.collect { orientation = it }
    }
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column {
            header.invoke(
                modifier = Modifier
                    .padding(horizontal = spacingLarge)
                    .weight(1f)
                    .fillMaxWidth()
            )
            content.invoke(
                modifier = Modifier
                    .padding(horizontal = spacingLarge)
                    .verticalScroll(rememberScrollState())
            )
        }
    } else {
        Row {
            header.invoke(
                Modifier
                    .padding(start = spacingLarge)
                    .weight(1f)
                    .fillMaxHeight()
            )
            content.invoke(
                Modifier
                    .padding(horizontal = spacingLarge)
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .verticalScroll(rememberScrollState())
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRotateView() {
    val fontSize = mutableStateOf(18f)
    val isInverted = mutableStateOf(true)

    RotateView(header = {
        val model = TextModel(
            fontSize = fontSize,
            text = "I add text for long preview\n\n" +
                    "to show how bad long text is look",
            isTitle = true,
            image = ImageModel(
                src = R.drawable.logo,
                srcAlt = R.drawable.logo_inverted,
                isInverted = isInverted
            )
        )
        TextView(
            model = model,
            modifier = it
        )
    }, content = {
        val model = ButtonModel(
            fontSize = fontSize,
            text = "Button Text"
        )
        Column(modifier = it) {
            SpacerView(Modifier.size(spacingLarge))
            ButtonView(model, Modifier.fillMaxWidth())
            SpacerView()
            ButtonView(model, Modifier.fillMaxWidth())
            SpacerView()
            ButtonView(model, Modifier.fillMaxWidth())
            SpacerView(Modifier.size(spacingLarge))
        }
    })
}