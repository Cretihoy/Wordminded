package com.cretihoy.wordminded.game

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.cretihoy.wordminded.card.CardFactory.getRandomLetter
import com.cretihoy.wordminded.card.CardFactory.getRandomTask
import com.cretihoy.wordminded.storage.Storage

@InjectViewState
class GamePresenter : MvpPresenter<GameView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        sendCardsToView()
        setupScreen()
    }

    private fun setupScreen() {
        viewState.setOrientation(Storage.isHorizontal)
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