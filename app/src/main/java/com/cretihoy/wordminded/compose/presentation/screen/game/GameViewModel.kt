package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel
@Inject constructor(
    private val factory: GameModelFactory
) : ViewModel() {

    val gameSide = mutableStateOf(factory.getGameSideModel())

    fun onClick() {
        factory.reloadTasks()
    }

    init {
        factory.startGame()
    }
}