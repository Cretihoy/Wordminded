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

    val topTask = mutableStateOf(factory.getTaskTopButtonModel())
    val topLetter = mutableStateOf(factory.getLetterTopButtonModel())
    val bottomTask = mutableStateOf(factory.getTaskBottomButtonModel())
    val bottomLetter = mutableStateOf(factory.getLetterBottomButtonModel())

    fun onClick() {
        factory.reloadTasks()
    }
}