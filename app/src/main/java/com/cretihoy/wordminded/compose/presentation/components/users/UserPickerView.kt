package com.cretihoy.wordminded.compose.presentation.components.users

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.modal.ModalView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.user.UserView
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun UserPickerView(
    isShown: MutableState<Boolean>,
    action: () -> Unit
) {
    val viewModel = hiltViewModel<UserPickerViewModel>()
    viewModel.loadUsers(isShown.value)

    ModalView(
        isShown = isShown,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextView(viewModel.titleModel)
        SpacerView(viewModel.titleModel, viewModel.users.firstOrNull())
        LazyVerticalGrid(
            columns = GridCells.Adaptive(120.dp),
            horizontalArrangement = Arrangement.spacedBy(spacingMedium),
            verticalArrangement = Arrangement.spacedBy(spacingMedium)
        ) {
            items(viewModel.users) {
                UserView(model = it,
                    editAction = { model ->
                        viewModel.onUserClicked(model)
                    })
            }
        }
        SpacerView(viewModel.nextButtonModel, viewModel.users.firstOrNull())
        ButtonView(
            model = viewModel.nextButtonModel,
            modifier = Modifier.fillMaxWidth(),
            clickAction = action
        )
    }
}