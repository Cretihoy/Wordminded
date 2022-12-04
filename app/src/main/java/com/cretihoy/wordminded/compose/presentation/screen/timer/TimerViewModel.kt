package com.cretihoy.wordminded.compose.presentation.screen.timer

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val SECOND_IN_MILLS = 1000L
private const val SECONDS = 3

@HiltViewModel
class TimerViewModel
@Inject constructor(
    private val factory: TimerModelFactory
) : ViewModel() {

    val titleModel = factory.getTitleModel()
    val counterModel: MutableState<TextModel?> = mutableStateOf(null)

    var isProgressNow = false
    val canGoNext = mutableStateOf(false)

    fun loadGameScreen() {
        if (!isProgressNow) {
            isProgressNow = true
            viewModelScope.launch {
                for (number in SECONDS downTo 1) {
                    counterModel.value = factory.getCounterModel(number)
                    delay(SECOND_IN_MILLS)
                }
                canGoNext.value = true
            }
        }
    }
}