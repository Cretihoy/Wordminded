package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.image.ImageModel
import com.cretihoy.wordminded.compose.presentation.components.text.TextModel
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.Storage
import javax.inject.Inject

class UserModelFactory
@Inject constructor(
    private val storage: Storage
) {

    fun getUserModelList(): List<UserModel> {
        return listOf(
            UserModel(
                nameButton = ButtonModel(
                    fontSize = storage.fontSize,
                    text = "Sashka"
                ),
                removeButton = ButtonModel(
                    fontSize = storage.fontSize,
                    textAttr = mutableStateOf(R.string.plus)
                ),
            ),
             UserModel(
                nameButton = ButtonModel(
                    fontSize = storage.fontSize,
                    text = "Ellie"
                ),
                removeButton = ButtonModel(
                    fontSize = storage.fontSize,
                    textAttr = mutableStateOf(R.string.plus)
                ),
            ),
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

}
