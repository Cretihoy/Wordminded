package com.cretihoy.wordminded.compose.presentation.screen.rules

import com.cretihoy.wordminded.R
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
            isTitle = true
        )
    }

    fun getOneRulesModel(): TextBlockModel {
        return TextBlockModel(
            textAttr = R.string.rules_text1,
        )
    }

    fun getTwoRules2Model(): TextBlockModel {
        return TextBlockModel(
            textAttr = R.string.rules_text2,
            isSecondary = true
        )
    }

    fun getThreeRules3Model(): TextBlockModel {
        return TextBlockModel(
            textAttr = R.string.rules_text3,
        )
    }
}