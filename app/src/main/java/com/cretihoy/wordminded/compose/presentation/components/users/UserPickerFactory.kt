package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class UserPickerFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getTitleModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.who_are_play,
            isTitle = true
        )
    }

    fun getNextButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = mutableStateOf(R.string.go),
            isSecondary = true
        )
    }

}