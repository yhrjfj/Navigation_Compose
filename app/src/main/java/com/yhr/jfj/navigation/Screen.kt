package com.yhr.jfj.navigation

sealed class Screen(val route: String){
    data object Home: Screen("home")
    data object SecondScreen: Screen("second")
    data object LastScreen: Screen("last")
}
