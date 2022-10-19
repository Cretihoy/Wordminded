package com.cretihoy.wordminded

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun onButtonClicked() {
        viewState.openGameScreen()
    }
}