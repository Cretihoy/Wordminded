package com.cretihoy.wordminded.presentation.main

import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.cretihoy.wordminded.presentation.base.BaseView

interface MainView : BaseView {

    @StateStrategyType(SkipStrategy::class)
    fun openGameScreen()

    @StateStrategyType(SkipStrategy::class)
    fun openRulesScreen()

    @StateStrategyType(SkipStrategy::class)
    fun openSettingsScreen()
}