package com.cretihoy.wordminded.compose.presentation.screen.rules

import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.textBlock.TextBlockModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class RulesModelFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getTitleRulesModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.rules_title,
            isTitle = true,
            image = ImageModel(
                src = R.drawable.logo,
                srcAlt = R.drawable.logo_inverted,
                isInverted = storage.isAltTheme
            )
        )
    }

    fun getOneRulesModel(): TextBlockModel {
        return TextBlockModel(
            fontSize = storage.fontSize,
            textAttr = R.string.rules_text_one,
        )
    }

    fun getTwoRules2Model(): TextBlockModel {
        return TextBlockModel(
            fontSize = storage.fontSize,
            textAttr = R.string.rules_text_two,
            isSecondary = true
        )
    }

    fun getThreeRules3Model(): TextBlockModel {
        return TextBlockModel(
            fontSize = storage.fontSize,
            textAttr = R.string.rules_text_three,
        )
    }
}