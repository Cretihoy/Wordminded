package com.cretihoy.wordminded.presentation.settings

import android.app.Activity
import com.arellomobile.mvp.InjectViewState
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.presentation.base.BasePresenter

@InjectViewState
class SettingPresenter : BasePresenter<SettingsView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setChecked(Storage.isHorizontal)
        viewState.showFontSize(Storage.fontSize)
    }

    fun onSwitchChecked(checked: Boolean) {
        Storage.isHorizontal = checked
    }

    fun onPlusButtonClicked() {
        Storage.fontSize++
        viewState.showFontSize(Storage.fontSize)
        viewState.setFontSize(Storage.fontSize)
    }

    fun onMinusButtonClicked() {
        Storage.fontSize--
        viewState.showFontSize(Storage.fontSize)
        viewState.setFontSize(Storage.fontSize)
    }

    fun saveSettings(activity: Activity) {
        Storage.saveSettings(activity)
    }
}