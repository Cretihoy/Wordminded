package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.compose.presentation.screen.users.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserPickerViewModel
@Inject constructor(
    private val repository: UserRepository,
    private val factory: UserPickerFactory
) : ViewModel() {

    val users = mutableStateListOf<UserModel>()

    val nextButtonModel by lazy { factory.getNextButtonModel() }
    val titleModel by lazy { factory.getTitleModel() }

    fun loadUsers() {
        viewModelScope.launch {
            if (users.isEmpty()) users.addAll(repository.getUsers())
        }
    }
}
