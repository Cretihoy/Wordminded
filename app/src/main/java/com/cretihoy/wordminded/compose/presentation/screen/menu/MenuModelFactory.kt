package com.cretihoy.wordminded.compose.presentation.screen.menu

import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class MenuModelFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getImageModel(): ImageModel {
        return ImageModel(
            src = R.drawable.logo,
            srcAlt = R.drawable.logo_inverted,
            isInverted = storage.isAltTheme
        )
    }

    fun getStartButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = mutableStateOf(R.string.app_start),
            isSecondary = true
        )
    }

    fun getRulesButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = mutableStateOf(R.string.app_rules)
        )
    }

    fun getSettingsButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = mutableStateOf(R.string.app_settings),
            isSecondary = true
        )
    }
}
