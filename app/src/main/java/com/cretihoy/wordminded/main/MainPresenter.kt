package com.cretihoy.wordminded.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

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