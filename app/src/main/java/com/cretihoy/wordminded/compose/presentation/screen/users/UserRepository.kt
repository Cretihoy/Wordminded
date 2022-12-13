package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.runtime.mutableStateListOf
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.db.dao.UserDao
import com.cretihoy.wordminded.extensions.replace
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val database: UserDao,
    private val mapper: UserMapper,
    private val factory: UserModelFactory
) {

    val users = mutableStateListOf<UserModel>()

    suspend fun loadUsers() {
        if (users.isEmpty()) {
            users.addAll(database.getAll().map { mapper.map(it) })
        }
    }

    suspend fun addUser(name: String) {
        val user = factory.getUserModel(name)
        users.add(user)
        database.add(mapper.map(user))
    }

    suspend fun removeUser(user: UserModel) {
        users.remove(user)
        database.remove(mapper.map(user))
    }

    suspend fun replaceUser(remove: UserModel, put: UserModel) {
        users.replace(remove, put)
        database.add(mapper.map(put))
    }
}