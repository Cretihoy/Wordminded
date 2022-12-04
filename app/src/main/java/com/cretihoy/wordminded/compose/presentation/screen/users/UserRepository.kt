package com.cretihoy.wordminded.compose.presentation.screen.users

import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.db.dao.UserDao
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val database: UserDao,
    private val mapper: UserMapper
) {

    suspend fun getUsers(): List<UserModel> {
        return database.getAll().map { mapper.map(it) }
    }

    suspend fun addUser(model: UserModel) {
        val user = mapper.map(model)
        database.add(user)
    }

    suspend fun removeUser(it: UserModel) {
        val user = mapper.map(it)
        database.remove(user)
    }
}
