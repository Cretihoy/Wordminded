package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cretihoy.wordminded.compose.presentation.components.user.UserModel
import com.cretihoy.wordminded.compose.presentation.screen.users.UserRepository
import com.cretihoy.wordminded.extensions.replace
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val MAX_PLAYERS = 2

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

    fun onUserClicked(user: UserModel) {
        val isNotFullUsers = users.filter { it.nameButton.isSecondary }.size < MAX_PLAYERS
        val isDeactivate = user.nameButton.isSecondary

        if (isNotFullUsers || isDeactivate) {
            val isSecondaryToggle = !user.nameButton.isSecondary
            val newButton = user.nameButton.copy(isSecondary = isSecondaryToggle)
            val newUser = user.copy(nameButton = newButton)
            users.replace(user, newUser)
        }
    }
}
