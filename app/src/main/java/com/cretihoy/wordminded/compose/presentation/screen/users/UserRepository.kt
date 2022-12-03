package com.cretihoy.wordminded.compose.presentation.screen.users

import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.db.dao.UserDao
import com.cretihoy.wordminded.data.db.entity.User
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val database: UserDao,
    private val mapper: UserMapper
) {

    suspend fun getUsers(): List<UserModel> {
        return database.getAll().map { mapper.map(it) }
    }

    suspend fun addUser(name: String) {
        database.add(
            User(
                id = System.currentTimeMillis(),
                name = name,
                score = 0,
            )
        )
    }
}
