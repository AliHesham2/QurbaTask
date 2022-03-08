package com.example.qurbatask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.qurbatask.ui.dashboard.DashBoardScreen
import com.example.qurbatask.ui.splash.SplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = AppRoute.Splash.route) {
        composable(route = AppRoute.Splash.route) { SplashScreen(navController = navController) }
        composable(route = AppRoute.DashBoard.route) { DashBoardScreen(navController = navController) }
    }
}