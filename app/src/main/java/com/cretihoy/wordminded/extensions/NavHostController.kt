package com.cretihoy.wordminded.extensions

import androidx.navigation.NavHostController
import com.cretihoy.wordminded.compose.NavRoutes

fun NavHostController.openGameScreen() {
    this.navigate(NavRoutes.GameNavRoute.route)
}
fun NavHostController.openRulesScreen() {
    this.navigate(NavRoutes.RulesNavRoute.route)
}
fun NavHostController.openSettingsScreen() {
    this.navigate(NavRoutes.SettingsNavRoute.route)
}