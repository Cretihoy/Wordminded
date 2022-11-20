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
    val counterModel by lazy { factory.getCounterModel() }

    fun onSwitchChanged(isHorizontal: Boolean) {
        storage.isHorizontal.value = isHorizontal
    }

    fun onPlusButtonClicked() {
        storage.fontSize.value++
    }

    fun onMinusButtonClicked() {
        storage.fontSize.value--
    }
}