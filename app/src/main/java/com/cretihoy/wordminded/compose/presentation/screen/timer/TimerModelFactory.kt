package com.cretihoy.wordminded.compose.presentation.screen.timer

import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class TimerModelFactory
@Inject constructor(
    private val storage: Storage,
) {

    fun getTitleModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.timer_dialog,
            isTitle = false
        )
    }

    fun getCounterModel(counter: Int? = null): TextModel? {
        return counter?.let {
            TextModel(
                fontSize = storage.fontSize,
                text = counter.toString(),
                isTitle = true
            )
        }
    }
}
