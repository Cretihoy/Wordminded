package com.cretihoy.wordminded.compose

sealed class NavRoutes(val route: String) {

    //menu
    object MenuNavRoute : NavRoutes("MenuNavRote")

    //game
    object GameNavRoute : NavRoutes("GameNavRote")

    //rules
    object RulesNavRoute : NavRoutes("RulesNavRote")

    //settings
    object SettingsNavRoute : NavRoutes("SettingsNavRote")
}