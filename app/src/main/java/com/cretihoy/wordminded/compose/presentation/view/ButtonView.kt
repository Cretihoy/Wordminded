package com.cretihoy.wordminded.compose.presentation.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun ButtonView(
    model: ButtonModel? = null
) {
    model?.let {
        Button(
            onClick = it.action,
            modifier = Modifier
                .sizeIn(minWidth = 48.dp, minHeight = 48.dp)
                .fillMaxWidth(),
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
                    modifier = Modifier.padding(spacingMedium),
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
        textAttr = R.string.app_start,
        isSecondary = true
    )
    ButtonView(model)
}