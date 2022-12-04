package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.cretihoy.wordminded.compose.presentation.components.dialog.DialogView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.screen.users.UsersViewModel

@Composable
fun UserPickerView(
    viewModel: UserPickerViewModel
) {
    DialogView(isShown = viewModel.isShown)
    TextView(viewModel.titleModel)
}