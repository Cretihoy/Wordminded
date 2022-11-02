package com.cretihoy.wordminded.main

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

interface MainView : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun openGameScreen()

    @StateStrategyType(SkipStrategy::class)
    fun openRulesScreen()

    @StateStrategyType(SkipStrategy::class)
    fun openSettingsScreen()
}