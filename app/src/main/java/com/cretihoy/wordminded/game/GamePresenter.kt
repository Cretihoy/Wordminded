package com.cretihoy.wordminded.game

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.cretihoy.wordminded.card.CardFactory.getRandomLetter
import com.cretihoy.wordminded.card.CardFactory.getRandomTask

@InjectViewState
class GamePresenter : MvpPresenter<GameView>() {

    fun onScreenClicked() {
        val letter = getRandomLetter()
        val task = getRandomTask()
        viewState.showCards(letter, task)
    }
}