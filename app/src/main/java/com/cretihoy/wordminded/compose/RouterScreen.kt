package com.cretihoy.wordminded.compose

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cretihoy.wordminded.compose.presentation.screen.game.GameScreen
import com.cretihoy.wordminded.compose.presentation.screen.game.GameViewModel
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuScreen
import com.cretihoy.wordminded.compose.presentation.screen.menu.MenuViewModel
import com.cretihoy.wordminded.compose.presentation.screen.rules.RulesScreen
import com.cretihoy.wordminded.compose.presentation.screen.rules.RulesViewModel
import com.cretihoy.wordminded.compose.presentation.screen.settings.SettingsScreen
import com.cretihoy.wordminded.compose.presentation.screen.settings.SettingsViewModel

@Composable
fun RouterScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoutes.MenuNavRoute.route,
    ) {

        composable(NavRoutes.MenuNavRoute.route) {
            val viewModel = hiltViewModel<MenuViewModel>()
            MenuScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(NavRoutes.GameNavRoute.route) {
            val viewModel = hiltViewModel<GameViewModel>()
            GameScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(NavRoutes.RulesNavRoute.route) {
            val viewModel = hiltViewModel<RulesViewModel>()
            RulesScreen(
                navController = navController,
                viewModel = viewModel
            )
        }

        composable(NavRoutes.SettingsNavRoute.route) {
            val viewModel = hiltViewModel<SettingsViewModel>()
            SettingsScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}