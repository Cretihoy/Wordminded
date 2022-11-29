package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.data.Storage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel
@Inject constructor(
    private val factory: SettingsModelFactory,
    private val storage: Storage
) : ViewModel() {

    val settingsTitle by lazy { factory.getTitleSettingsModel() }
    val orientationSettingsSwitch by lazy { factory.getOrientationSwitchSettingsModel() }
    val themeSettingsSwitch by lazy { factory.getThemeSwitchSettingsModel() }
    val infinityGameSwitch by lazy { factory.getInfinityGameModel() }
    val counterModel by lazy { factory.getCounterModel() }
    val resetSettings by lazy { factory.getResetSettingsModel() }

    fun onResetSettingsClicked() {
        storage.resetSettings()
    }
}