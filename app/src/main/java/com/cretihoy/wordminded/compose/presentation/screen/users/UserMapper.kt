package com.cretihoy.wordminded.compose.presentation.screen.users

import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.data.db.entity.User
import javax.inject.Inject

class UserMapper @Inject constructor(
    private val storage: Storage
) {

    fun map(model: UserModel): User {
        return User(
            id = System.currentTimeMillis(),
            name = model.nameButton.text.orEmpty(),
            score = 1337
        )
    }

    fun map(user: User): UserModel {
        return UserModel(
            nameButton = ButtonModel(
                fontSize = storage.fontSize,
                text = "${user.id} ${user.name} ${user.score}"
            ),
            removeButton = ButtonModel(
                fontSize = storage.fontSize,
                text = "Remove?"
            )
        )
    }
}
