package com.cretihoy.wordminded.game

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.cretihoy.wordminded.card.CardModel

interface GameView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCards(letter: CardModel, task: CardModel)
}