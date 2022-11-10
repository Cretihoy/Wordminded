package com.cretihoy.wordminded.presentation.game

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.cretihoy.wordminded.data.CardModel
import com.cretihoy.wordminded.presentation.base.BaseView

interface GameView : BaseView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCards(letter: CardModel, task: CardModel)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setOrientation(isHorizontal: Boolean)
}