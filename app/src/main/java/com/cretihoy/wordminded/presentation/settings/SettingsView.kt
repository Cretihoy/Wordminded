package com.cretihoy.wordminded.presentation.settings

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.cretihoy.wordminded.presentation.base.BaseView

interface SettingsView : BaseView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showFontSize(fontSize: Float)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setChecked(horizontal: Boolean)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setFontSize(fontSize: Float)
}