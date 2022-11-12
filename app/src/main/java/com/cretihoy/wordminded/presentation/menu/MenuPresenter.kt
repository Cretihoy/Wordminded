package com.cretihoy.wordminded.presentation.menu

import com.arellomobile.mvp.InjectViewState
import com.cretihoy.wordminded.presentation.base.BasePresenter

@InjectViewState
class MenuPresenter : BasePresenter<MenView>() {

    fun onButtonPlayClicked() {
        viewState.openGameScreen()
    }

    fun onButtonRulesClicked() {
        viewState.openRulesScreen()
    }

    fun onButtonSettingsClicked() {
        viewState.openSettingsScreen()
    }
}