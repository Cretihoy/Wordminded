package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class GameModelFactory
@Inject constructor(
    private val factory: QuestionFactory,
    private val storage: Storage
) {

    var task: MutableState<Int?> = mutableStateOf(null)
    var letter: MutableState<Int?> = mutableStateOf(null)

    fun getLetterTopButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = letter,
            isRotated = true
        )
    }

    fun getTaskTopButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = task,
            isSecondary = true,
            isRotated = true
        )
    }

    fun getTaskBottomButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = task,
            isSecondary = true
        )
    }

    fun getLetterBottomButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = letter
        )
    }

    fun reloadTasks() {
        task.value = factory.getRandomTask()
        letter.value = factory.getRandomLetter()
    }
}