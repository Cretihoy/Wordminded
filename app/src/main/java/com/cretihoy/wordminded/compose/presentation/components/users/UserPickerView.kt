package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.modal.ModalView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView

@Composable
fun UserPickerView(
    isShown: MutableState<Boolean>
) {
    val viewModel = hiltViewModel<UserPickerViewModel>()
    ModalView(isShown = isShown) {
        TextView(viewModel.titleModel)
        ButtonView(viewModel.nextButtonModel)
    }
}