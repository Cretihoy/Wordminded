package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel
import com.cretihoy.wordminded.compose.presentation.components.input.InputModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.compose.presentation.theme.EMPTY_STRING
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class UserModelFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getInputModel(name: String = EMPTY_STRING): InputModel {
        return InputModel(
            text = mutableStateOf(name),
            button = ButtonModel(
                fontSize = storage.fontSize,
                text = "x"
            )
        )
    }

    fun getNewUserButtonModel(): ButtonModel {
        return ButtonModel(
            fontSize = storage.fontSize,
            textAttr = mutableStateOf(R.string.plus)
        )
    }

    fun getTitleModel(): TextModel {
        return TextModel(
            fontSize = storage.fontSize,
            textAttr = R.string.user_management,
            isTitle = true,
            image = ImageModel(
                src = R.drawable.logo,
                srcAlt = R.drawable.logo_inverted,
                isInverted = storage.isAltTheme
            )
        )
    }

    fun getUserModel(name: String): UserModel {
        return UserModel(
            nameButton = ButtonModel(
                fontSize = storage.fontSize,
                text = name
            ),
            removeButton = ButtonModel(
                fontSize = storage.fontSize,
                textAttr = mutableStateOf(R.string.plus)
            )
        )
    }
}
