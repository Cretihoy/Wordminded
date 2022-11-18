package com.cretihoy.wordminded.compose.presentation.screen.game

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import javax.inject.Inject

class GameModelFactory
@Inject constructor(
    private val factory: QuestionFactory
) {

    val task = factory.getRandomTask()
    val letter = factory.getRandomLetter()

    fun getLetterTopButtonModel(): ButtonModel {
        return ButtonModel(
            textAttr = letter,
            isRotated = true
        )
    }

    fun getTaskTopButtonModel(): ButtonModel {
        return ButtonModel(
            textAttr = task,
            isSecondary = true,
            isRotated = true
        )
    }

    fun getTaskBottomButtonModel(): ButtonModel {
        return ButtonModel(
            textAttr = task,
            isSecondary = true
        )
    }

    fun getLetterBottomButtonModel(): ButtonModel {
        return ButtonModel(
            textAttr = letter
        )
    }
}