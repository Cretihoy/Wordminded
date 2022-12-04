package com.cretihoy.wordminded.compose.presentation.components.users

import com.cretihoy.wordminded.R
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

}