package com.cretihoy.wordminded.compose.presentation.screen.users

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
    val userModelList = mutableStateOf(mutableListOf<UserModel>())
    val newUserButtonModel by lazy { factory.getNewUserButtonModel() }

    fun addUser(name: String) {
        viewModelScope.launch {
            repository.addUser(name)
        }
    }

    fun loadUsers() {
        viewModelScope.launch {
            userModelList.value.addAll(repository.getUsers())
        }
    }
}