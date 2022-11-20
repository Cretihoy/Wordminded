package com.cretihoy.wordminded.presentation.game

import com.arellomobile.mvp.InjectViewState
import com.cretihoy.wordminded.data.CardFactory.getRandomLetter
import com.cretihoy.wordminded.data.CardFactory.getRandomTask
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.presentation.base.BasePresenter

@InjectViewState
class GamePresenter : BasePresenter<GameView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        sendCardsToView()
        setupScreen()
    }

    private fun setupScreen() {
//        viewState.setOrientation(Storage.isHorizontal)
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