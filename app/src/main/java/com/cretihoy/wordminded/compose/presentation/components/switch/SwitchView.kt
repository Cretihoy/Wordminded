package com.cretihoy.wordminded.compose.presentation.components.switch

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.theme.Shapes

@Composable
fun SwitchView(
    model: SwitchModel? = null,
    modifier: Modifier = Modifier
) {
    model?.textAttr?.let {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clip(Shapes.medium)
                .clickable { model.isChecked.value = !model.isChecked.value },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = it),
                color = colors.onSecondary,
                fontSize = model.fontSize.value.sp
            )
            SpacerView(Modifier.weight(1f))
            Switch(
                checked = model.isChecked.value,
                onCheckedChange = { model.isChecked.value = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = if (model.isSecondary)
                        colors.primary
                    else
                        colors.primaryVariant,
                    uncheckedThumbColor = if (model.isSecondary)
                        colors.surface
                    else
                        colors.onSurface
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSwitchView() {
    val model = SwitchModel(
        fontSize = mutableStateOf(18f),
        textAttr = R.string.settings_switch_change_orientation,
        isChecked = mutableStateOf(true)
    )
    SwitchView(model)
}