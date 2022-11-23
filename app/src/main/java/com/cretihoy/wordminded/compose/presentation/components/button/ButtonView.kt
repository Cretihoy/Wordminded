package com.cretihoy.wordminded.compose.presentation.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingSmall

@Composable
fun ButtonView(
    model: ButtonModel? = null,
    modifier: Modifier = Modifier,
    clickAction: () -> Unit = {}
) {
    model?.let {
        Button(
            onClick = clickAction,
            modifier = modifier
                .sizeIn(
                    minWidth = 48.dp,
                    minHeight = 48.dp
                ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (it.isSecondary)
                    colors.secondary
                else
                    colors.primary,
            ),
            shape = Shapes.medium,
        ) {
            it.textAttr.value?.let { text ->
                Text(
                    modifier = Modifier.padding(spacingSmall),
                    text = stringResource(id = text),
                    color = colors.onSecondary,
                    fontSize = model.fontSize.value.sp
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewButton() {
    val model = ButtonModel(
        fontSize = mutableStateOf(18f),
        textAttr = mutableStateOf(R.string.app_start),
        isSecondary = true
    )
    ButtonView(model)
}