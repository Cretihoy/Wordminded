package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonModel
import com.cretihoy.wordminded.compose.presentation.screen.users.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserPickerViewModel
@Inject constructor(
    private val repository: UserRepository,
    private val factory: UserPickerFactory
) : ViewModel() {

    val nextButtonModel by lazy { factory.getNextButtonModel() }
    val titleModel by lazy { factory.getTitleModel() }
}
