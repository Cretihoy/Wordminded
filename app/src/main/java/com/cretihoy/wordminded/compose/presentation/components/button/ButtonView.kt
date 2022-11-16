package com.cretihoy.wordminded.compose.presentation.components.button

import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R.string
import com.cretihoy.wordminded.compose.presentation.theme.Shapes

@Composable
fun ButtonView(
    model: ButtonModel? = null,
    modifier: Modifier = Modifier
) {
    model?.let {
        Button(
            onClick = it.action,
            modifier = modifier
                .sizeIn(minWidth = 48.dp, minHeight = 48.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (it.isSecondary)
                    colors.secondary
                else
                    colors.primary,
                contentColor = colors.onPrimary
            ),
            shape = Shapes.medium,
        ) {
            it.textAttr?.let { text ->
                Text(
                    text = stringResource(id = text),
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewButton() {
    val model = ButtonModel(
        textAttr = string.app_start,
        isSecondary = true
    )
    ButtonView(model)
}