package com.cretihoy.wordminded.compose.presentation.screen.users

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.compose.presentation.theme.icDelete
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.data.db.entity.User
import javax.inject.Inject

class UserMapper @Inject constructor(
    private val storage: Storage
) {

    fun map(model: UserModel): User {
        return User(
            id = model.id,
            name = model.nameButton.text.orEmpty(),
            score = model.score
        )
    }

    fun map(user: User): UserModel {
        return UserModel(
            id = user.id,
            score = user.score,
            nameButton = ButtonModel(
                fontSize = storage.fontSize,
                text = user.name
            ),
            removeButton = ButtonModel(
                fontSize = storage.fontSize,
                icon = icDelete,
                isSecondary = true
            )
        )
    }
}
