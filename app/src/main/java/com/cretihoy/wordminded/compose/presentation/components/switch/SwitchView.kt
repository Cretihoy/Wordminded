package com.cretihoy.wordminded.compose.presentation.components.switch

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.SpacerView

@Composable
fun SwitchView(
    model: SwitchModel? = null,
    modifier: Modifier = Modifier
) {
    model?.textAttr?.let {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = it),
                color = colors.onSecondary,
                fontSize = 18.sp
            )
            SpacerView(Modifier.weight(1f))
            Switch(
                checked = model.isChecked,
                onCheckedChange = { }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSwitchView() {
    val model = SwitchModel(
        textAttr = R.string.card_orientation,
        isChecked = true
    )
    SwitchView(model)
}