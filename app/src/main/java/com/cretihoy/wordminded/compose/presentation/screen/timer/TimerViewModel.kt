package com.cretihoy.wordminded.compose.presentation.screen.timer

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.data.Storage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TimerViewModel
@Inject constructor(
    private val storage: Storage
) : ViewModel() {

    val titleModel = TextModel(
        fontSize = storage.fontSize,
        textAttr = R.string.timer_dialog,
        isTitle = false
    )
    val counterText: MutableState<TextModel?> = mutableStateOf(null)
    val canIGoNow = mutableStateOf(false)

    fun loadGameScreen() {
        if (counterText.value == null) {
            CoroutineScope(Dispatchers.Main).launch {
                for (number in 3 downTo 1) {
                    counterText.value = TextModel(
                        fontSize = storage.fontSize,
                        text = number.toString(),
                        isTitle = true
                    )
                    delay(1000L)
                }
                canIGoNow.value = true
            }
        }
    }
}