package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import javax.inject.Inject

class GameModelFactory
@Inject constructor(
    private val factory: QuestionFactory
) {

    var task: MutableState<Int?> = mutableStateOf(null)
    var letter: MutableState<Int?> = mutableStateOf(null)

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

    fun reloadTasks() {
        task.value = factory.getRandomTask()
        letter.value = factory.getRandomLetter()
    }
}