package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.gameside.GameSideModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class GameModelFactory
@Inject constructor(
    private val factory: QuestionFactory,
    private val storage: Storage
) {

    private var task: MutableState<Int?> = mutableStateOf(factory.getRandomTask())
    private var letter: MutableState<Int?> = mutableStateOf(factory.getRandomLetter())

    fun getGameSideModel(): GameSideModel {
        return GameSideModel(
            task = getTaskModel(),
            letter = getLetterModel(),
            isHorizontal = storage.isHorizontal,
            isInfinityGame = storage.isInfinityGame
        )
    }

    private fun getLetterModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = letter,
            isSecondary = true
        )
    }

    private fun getTaskModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = task,
        )
    }

    fun startGame() {
        factory.resetLists()
        reloadTasks()
    }

    fun reloadTasks() {
        task.value = factory.getRandomTask()
        letter.value = factory.getRandomLetter()
    }
}