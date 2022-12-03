package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.data.db.dao.UserDao
import com.cretihoy.wordminded.data.db.entity.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersViewModel
@Inject constructor(
    private val factory: UserModelFactory,
    private val database: UserDao,
    private val mapper: UserMapper
) : ViewModel() {

    val titleModel by lazy { factory.getTitleModel() }
    val userModelList = mutableStateOf(mutableListOf<UserModel>())
    val newUserButtonModel by lazy { factory.getNewUserButtonModel() }

    fun addUser(name: String) {
        viewModelScope.launch(Dispatchers.IO) {
            database.add(
                User(
                    id = System.currentTimeMillis(),
                    name = name,
                    score = 0,
                )
            )
        }
    }

    fun loadUsers() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val users: List<UserModel> = database.getAll().map { mapper.map(it) }
                userModelList.value.clear()
                userModelList.value.addAll(users)
            } catch (e: Exception) {

            }
        }
    }
}