package com.cretihoy.wordminded.compose.presentation.screen.users

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cretihoy.wordminded.compose.presentation.components.SpacerView
import com.cretihoy.wordminded.compose.presentation.components.button.ButtonView
import com.cretihoy.wordminded.compose.presentation.components.text.TextView
import com.cretihoy.wordminded.compose.presentation.components.user.UserView
import com.cretihoy.wordminded.compose.presentation.theme.spacingMedium

@Composable
fun UsersScreen(
    viewModel: UsersViewModel
) {
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        TextView(viewModel.titleModel)
        SpacerView()
        LazyVerticalGrid(
            columns = GridCells.Adaptive(96.dp),
            horizontalArrangement = Arrangement.spacedBy(spacingMedium),
            verticalArrangement = Arrangement.spacedBy(spacingMedium)
        ) {
            items(viewModel.userModelList) {
                UserView(it)
            }
        }
        SpacerView()
        ButtonView(viewModel.newUserButtonModel)
    }
}