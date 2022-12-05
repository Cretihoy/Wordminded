package com.cretihoy.wordminded.compose.presentation.components.button

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.theme.EMPTY_STRING
import com.cretihoy.wordminded.compose.presentation.theme.Shapes
import com.cretihoy.wordminded.compose.presentation.theme.spacingSmall

@Composable
fun ButtonView(
    model: ButtonModel? = null,
    modifier: Modifier = Modifier,
    clickAction: () -> Unit = {}
) {
    model?.let { it ->
        Button(
            onClick = clickAction,
            modifier = modifier
                .sizeIn(
                    minWidth = 56.dp,
                    minHeight = 56.dp
                ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (it.isSecondary)
                    colors.secondary
                else
                    colors.primary,
            ),
            shape = Shapes.medium,
        ) {
            it.icon?.let { image ->
                Icon(
                    imageVector = image,
                    tint = colors.onSecondary,
                    contentDescription = EMPTY_STRING
                )
            }
            val text = it.text ?: it.textAttr.value?.let { stringResource(it) }
            text?.let {
                Text(
                    modifier = Modifier.padding(spacingSmall),
                    text = it,
                    color = colors.onSecondary,
                    fontSize = model.fontSize.value.sp,
                    textAlign = TextAlign.Center
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
        icon = Icons.Default.Check,
        textAttr = mutableStateOf(R.string.app_start),
        isSecondary = true
    )
    ButtonView(model)
}