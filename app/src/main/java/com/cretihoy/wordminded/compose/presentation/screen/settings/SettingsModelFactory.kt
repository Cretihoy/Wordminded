package com.cretihoy.wordminded.compose.presentation.screen.settings

import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.counter.CounterModel
import com.cretihoy.wordminded.compose.presentation.components.switch.SwitchModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import javax.inject.Inject

class SettingsModelFactory
@Inject constructor() {

    fun getTitleSettingsModel(): TextModel {
        return TextModel(
            textAttr = R.string.settings_title,
            isTitle = true
        )
    }

    fun getOrientationSwitchSettingsModel(): SwitchModel {
        return SwitchModel(
            textAttr = R.string.card_orientation
        )
    }

    fun getCounterModel(): CounterModel {
        return CounterModel(
            textAttr = R.string.font_size,
            leftButton = ButtonModel(
                textAttr = R.string.minus,
                isSecondary = true
            ),
            rightButton = ButtonModel(
                textAttr = R.string.plus
            ),
            value = 18
        )
    }

    fun getFontMinusButtonSettingsModel(): ButtonModel {
        return ButtonModel(
            textAttr = R.string.minus
        )
    }

    fun getFontSizeSettingsModel(): TextModel {
        return TextModel(
            textAttr = R.string.yes,
        )
    }

    fun getFontPlusButtonSettingsModel(): ButtonModel {
        return ButtonModel(
            textAttr = R.string.plus
        )
    }
}