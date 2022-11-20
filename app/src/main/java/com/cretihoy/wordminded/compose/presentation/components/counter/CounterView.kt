package com.cretihoy.wordminded.compose.presentation.components.counter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.theme.spacingSmall

@Composable
fun CounterView(
    model: CounterModel? = null,
    modifier: Modifier = Modifier,
    actionPlus: () -> Unit = {},
    actionMinus: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        model?.let { model ->
            model.textAttr?.let { text ->
                Text(
                    text = stringResource(id = text),
                    color = MaterialTheme.colors.onSecondary,
                    fontSize = model.fontSize.value.sp
                )
            }
            SpacerView(Modifier.weight(1f))
            model.leftButton?.let { buttonModel ->
                ButtonView(
                    model = buttonModel,
                    clickAction = actionMinus
                )
            }
            Text(
                modifier = Modifier.padding(spacingSmall),
                text = model.fontSize.value.toInt().toString(),
                color = MaterialTheme.colors.onSecondary,
                fontSize = model.fontSize.value.sp
            )
            model.rightButton?.let { buttonModel ->
                ButtonView(
                    model = buttonModel,
                    clickAction = actionPlus
                )
            }
        }
    }
}
