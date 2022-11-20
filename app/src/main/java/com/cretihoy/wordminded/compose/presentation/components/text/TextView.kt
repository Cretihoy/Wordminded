package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun TextView(
    model: TextModel? = null,
    modifier: Modifier = Modifier
) {
    model?.textAttr?.let {
        Box(
            modifier = modifier
                .padding(spacingMedium)
                .fillMaxWidth()
        ) {
            Text(
                modifier = if (model.isTitle)
                    Modifier.align(Alignment.Center)
                else
                    Modifier,
                text = if (model.isTitle)
                    stringResource(id = it).uppercase()
                else
                    stringResource(id = it),
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