package com.cretihoy.wordminded.compose.presentation.components.counter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.theme.spacingSmall

@Composable
fun CounterView(
    model: CounterModel? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        model?.let { model ->
            model.textAttr?.let { text ->
                Text(
                    modifier = Modifier.weight(1f),
                    text = stringResource(id = text),
                    color = colors.onSecondary,
                    fontSize = model.fontSize.value.sp
                )
            }
            SpacerView(Modifier.weight(1f))
            model.leftButton?.let { buttonModel ->
                ButtonView(
                    model = buttonModel,
                    clickAction = { buttonModel.fontSize.value-- }
                )
            }
            Text(
                modifier = Modifier.padding(spacingSmall),
                text = model.fontSize.value.toInt().toString(),
                color = colors.onSecondary,
                fontSize = model.fontSize.value.sp
            )
            model.rightButton?.let { buttonModel ->
                ButtonView(
                    model = buttonModel,
                    clickAction = { buttonModel.fontSize.value++ }
                )
            }
        }
    }
}

@Preview(widthDp = 250)
@Composable
fun PreviewCounterView() {
    val fontsize = 28f
    val model = CounterModel(
        fontSize = mutableStateOf(fontsize),
        textAttr = R.string.app_name,
        leftButton = ButtonModel(
            fontSize = mutableStateOf(fontsize),
            text = "-"
        ),
        rightButton = ButtonModel(
            fontSize = mutableStateOf(fontsize),
            text = "+"
        ),
    )
    CounterView(model)
}