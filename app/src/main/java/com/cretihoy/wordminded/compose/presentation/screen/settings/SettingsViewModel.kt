package com.cretihoy.wordminded.compose.presentation.screen.settings

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel
@Inject constructor(
    private val factory: SettingsModelFactory
) : ViewModel() {

    val settingsTitle by lazy { factory.getTitleSettingsModel() }
    val orientationSettingsSwitch by lazy { factory.getOrientationSwitchSettingsModel() }
    val themeSettingsSwitch by lazy { factory.getThemeSwitchSettingsModel() }
    val infinityGameSwitch by lazy { factory.getInfinityGameModel() }
    val counterModel by lazy { factory.getCounterModel() }
}