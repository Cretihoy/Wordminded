package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.image.ImageView
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun TextView(
    model: TextModel? = null,
    modifier: Modifier = Modifier
) {
    val textFromAttr = model?.textAttr?.let { stringResource(it) }
    val text = model?.text ?: textFromAttr

    text?.let {
        Box(
            modifier = modifier
                .padding(spacingMedium),
//                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            if (model!!.isTitle) {
                ImageView(
                    model = model.image,
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(1.5f)
                        .blur(32.dp)
                )
            }
            Text(
                modifier = if (model.isTitle)
                    Modifier
                        .align(Alignment.Center)
                else
                    Modifier,
                text = if (model.isTitle)
                    it.uppercase()
                else
                    it,
                color = colors.onSecondary,
                fontSize = if (model.isTitle) {
                    (model.fontSize.value * 2).sp
                } else {
                    model.fontSize.value.sp
                },
                fontWeight = if (model.isTitle)
                    FontWeight.Bold
                else
                    FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextView() {
    Column {
        val title = TextModel(
            mutableStateOf(18f),
            textAttr = R.string.app_rules
        )
        TextView(title)
        SpacerView()
        val regular =
            TextModel(
                mutableStateOf(18f),
                textAttr = R.string.app_settings, isTitle = true
            )
        TextView(regular)
    }
}