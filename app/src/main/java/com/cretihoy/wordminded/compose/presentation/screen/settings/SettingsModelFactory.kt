package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterModel
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class SettingsModelFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getTitleSettingsModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.settings_title,
            isTitle = true
        )
    }

    fun getOrientationSwitchSettingsModel(): SwitchModel {
        return SwitchModel(
            fontSize = storage.fontSize,
            textAttr = R.string.card_orientation,
            isChecked = storage.isHorizontal
        )
    }

    fun getCounterModel(): CounterModel {
        return CounterModel(
            fontSize = storage.fontSize,
            textAttr = R.string.font_size,
            leftButton = ButtonModel(
                fontSize = storage.fontSize,
                textAttr = mutableStateOf(R.string.minus),
                isSecondary = true
            ),
            rightButton = ButtonModel(
                fontSize = storage.fontSize,
                textAttr = mutableStateOf(R.string.plus)
            )
        )
    }
}