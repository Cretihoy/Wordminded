package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersViewModel
@Inject constructor(
    private val factory: UserModelFactory,
    private val repository: UserRepository
) : ViewModel() {

    val titleModel by lazy { factory.getTitleModel() }
    val users = mutableStateListOf<UserModel>()
    val newUserButtonModel by lazy { factory.getNewUserButtonModel() }
    val inputModel by lazy { factory.getInputModel() }
    val isShown = mutableStateOf(false)

    fun addUser(name: String) {
        viewModelScope.launch {
            val user = factory.getUserModel(name)
            users.add(user)
            repository.addUser(user)
        }
    }

    fun loadUsers() {
        viewModelScope.launch {
            users.addAll(repository.getUsers())
        }
    }
}