package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.user.UserView
import com.cretihoy.wordminded.compose.presentation.theme.spacingLarge

@Composable
fun UsersScreen(
    viewModel: UsersViewModel
) {
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
        items(viewModel.userModelList) {
            UserView(it)
            SpacerView()
        }
        item {
            ButtonView(viewModel.newUserButtonModel, modifier = Modifier.fillMaxWidth())
        }
    }
}