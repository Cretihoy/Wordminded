package com.cretihoy.wordminded.compose.presentation.components.text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium
import com.cretihoy.wordminded.compose.presentation.components.SpacerView

@Composable
fun TextView(
    model: TextModel? = null,
    modifier: Modifier = Modifier
) {
    model?.let {
        Box(
            modifier = modifier
                .padding(spacingMedium)
                .fillMaxWidth()
        ) {
            Text(
                modifier = if (it.isTitle)
                    Modifier.align(Alignment.Center)
                else
                    Modifier,
                text = if (it.isTitle)
                    stringResource(id = R.string.app_rules).uppercase()
                else
                    stringResource(id = R.string.app_rules),
                color = colors.onSecondary,
                fontSize = if (it.isTitle) 28.sp else 18.sp,
                fontWeight = if (it.isTitle)
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
        val title = TextModel(textAttr = R.string.app_rules)
        TextView(title)
        SpacerView()
        val regular = TextModel(textAttr = R.string.app_settings, isTitle = true)
        TextView(regular)
    }
}