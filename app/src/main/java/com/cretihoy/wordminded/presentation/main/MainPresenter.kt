package com.cretihoy.wordminded.presentation.main

import com.arellomobile.mvp.InjectViewState
import com.cretihoy.wordminded.presentation.base.BasePresenter

@InjectViewState
class MainPresenter : BasePresenter<MainView>() {

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