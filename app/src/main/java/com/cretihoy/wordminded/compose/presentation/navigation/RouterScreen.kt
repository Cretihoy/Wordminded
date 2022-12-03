package com.cretihoy.wordminded.compose.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cretihoy.wordminded.compose.presentation.navigation.NavRoutes.*
import com.cretihoy.wordminded.compose.presentation.screen.game.GameScreen
import com.cretihoy.wordminded.compose.presentation.screen.game.GameViewModel
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuScreen
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuViewModel
import com.cretihoy.wordminded.compose.presentation.screen.rules.RulesScreen
import com.cretihoy.wordminded.compose.presentation.screen.rules.RulesViewModel
import com.cretihoy.wordminded.compose.presentation.screen.settings.SettingsScreen
import com.cretihoy.wordminded.compose.presentation.screen.settings.SettingsViewModel
import com.cretihoy.wordminded.compose.presentation.screen.users.UsersScreen
import com.cretihoy.wordminded.compose.presentation.screen.users.UsersViewModel

@Composable
fun RouterScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MenuNavRoute.route,
    ) {

        composable(MenuNavRoute.route) {
            val viewModel = hiltViewModel<MenuViewModel>()
            MenuScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(GameNavRoute.route) {
            val viewModel = hiltViewModel<GameViewModel>()
            GameScreen(
                viewModel = viewModel,
            )
        }

        composable(RulesNavRoute.route) {
            val viewModel = hiltViewModel<RulesViewModel>()
            RulesScreen(
                viewModel = viewModel
            )
        }

        composable(SettingsNavRoute.route) {
            val viewModel = hiltViewModel<SettingsViewModel>()
            SettingsScreen(
                viewModel = viewModel
            )
        }

        composable(UsersNavRoute.route) {
            val viewModel = hiltViewModel<UsersViewModel>()
            UsersScreen(
                viewModel = viewModel
            )
        }
    }
}