package com.cretihoy.wordminded.compose.presentation.screen.timer

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.R
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
    val titleInt = R.string.timer_dialog
    val currentNumber = mutableStateOf<Int?>(null)
    val canIGoNow = mutableStateOf(false)

    fun loadGameScreen() {

        CoroutineScope(Dispatchers.Main).launch {
            for (i in 3 downTo 0) {

                currentNumber.value = i
                delay(1000L)
            }
            canIGoNow.value = true
        }

    }
}