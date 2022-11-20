package com.cretihoy.wordminded.compose.presentation.components.textBlock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun TextBlockView(
    model: TextBlockModel? = null,
    modifier: Modifier = Modifier
) {
    model?.let {
        Box(
            modifier = modifier.clip(Shapes.large)
        ) {
            it.textAttr?.let { text ->
                Text(
                    modifier = Modifier
                        .background(if (model.isSecondary) colors.secondary else colors.primary)
                        .padding(spacingMedium),
                    text = stringResource(id = text),
                    color = Color.White,
                    fontSize = model.fontSize.value.sp,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTextBlock() {
    val model = TextBlockModel(
        fontSize = mutableStateOf(18f),
        textAttr = R.string.rules_text1,
        isSecondary = true
    )
    TextBlockView(model)
}