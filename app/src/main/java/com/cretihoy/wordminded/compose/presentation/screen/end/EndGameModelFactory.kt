package com.cretihoy.wordminded.compose.presentation.screen.end

import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class EndGameModelFactory @Inject constructor(
    private val storage: Storage
) {
    fun getTitleEndGameModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.game_end,
            isTitle = true
        )
    }

    fun getDescriptionEndGameModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.play_again,
        )
    }
}