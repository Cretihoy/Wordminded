package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.dialog.DialogView
import com.cretihoy.wordminded.compose.presentation.components.input.InputView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.user.UserView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun UsersScreen(
    viewModel: UsersViewModel
) {
    viewModel.loadUsers()
    Box {
        LazyColumn(
            verticalArrangement = Arrangement.Bottom,
            contentPadding = PaddingValues(spacingLarge),
            modifier = Modifier
                .fillMaxSize()
        ) {
            item {
                TextView(viewModel.titleModel, modifier = Modifier.fillMaxWidth())
                SpacerView()
            }
            items(viewModel.users) {
                UserView(
                    model = it,
                    editAction = { model ->
                        viewModel.onEditClicked(model)
                    },
                    removeAction = { model ->
                        viewModel.isDialogShown.value = true
                        viewModel.currentUser = model
                    }
                )
                SpacerView()
            }
            item {
                ButtonView(
                    viewModel.newUserButtonModel,
                    modifier = Modifier.fillMaxWidth(),
                    clickAction = {
                        viewModel.isShownAdding.value = true
                    })
            }
        }
        viewModel.editInputModel.value?.let { model ->
            InputView(
                isShown = viewModel.isShownEdit,
                model = model,
                action = { name ->
                    viewModel.onEditFinished(name)
                }
            )
        }
        InputView(
            isShown = viewModel.isShownAdding,
            model = viewModel.addingInputModel,
            action = { name ->
                viewModel.addUser(name)
            }
        )
        DialogView(
            viewModel.isDialogShown,
            model = viewModel.dialogModel,
            leftClick = {
                viewModel.isDialogShown.value = false
            }, rightClick = {
                viewModel.onRemoveClicked()

            }
        )
    }
}