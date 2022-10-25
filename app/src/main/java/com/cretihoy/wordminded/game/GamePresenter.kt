package com.cretihoy.wordminded.game

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.cretihoy.wordminded.card.CardFactory.getRandomLetter
import com.cretihoy.wordminded.card.CardFactory.getRandomTask

@InjectViewState
class GamePresenter : MvpPresenter<GameView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        sendCardsToView()
    }

    fun onScreenClicked() {
        sendCardsToView()
    }

    private fun sendCardsToView() {
        val letter = getRandomLetter()
        val task = getRandomTask()
        viewState.showCards(letter, task)
    }
}