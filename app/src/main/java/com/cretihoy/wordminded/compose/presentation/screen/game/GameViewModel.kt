package com.cretihoy.wordminded.compose.presentation.screen.game

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel
@Inject constructor(
    private val factory: GameModelFactory
) : ViewModel() {

    val topTask by lazy { factory.getTaskTopButtonModel() }
    val topLetter by lazy { factory.getLetterTopButtonModel() }
    val bottomTask by lazy { factory.getTaskBottomButtonModel() }
    val bottomLetter by lazy { factory.getLetterBottomButtonModel() }

    fun onClick() {
        factory.reloadTasks()
    } // blah blah
}