package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.cretihoy.wordminded.compose.presentation.screen.users.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserPickerViewModel
@Inject constructor(
    private val repository: UserRepository,
    private val factory: UserPickerFactory
) {

    val isShown: MutableState<Boolean> = mutableStateOf(false)
    val titleModel by lazy { factory.getTitleModel() }
}
