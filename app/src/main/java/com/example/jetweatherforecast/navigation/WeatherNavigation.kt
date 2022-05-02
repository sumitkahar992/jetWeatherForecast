package com.example.jetweatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetweatherforecast.screens.MainScreen
import com.example.jetweatherforecast.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val navController =  rememberNavController()
    NavHost(navController = navController,
        startDestination = WeatherScreens.SplashScreen.name){

        composable(WeatherScreens.SplashScreen.name){
            WeatherSplashScreen(navController = navController)
        }

        composable(WeatherScreens.MainScreen.name){
            MainScreen(navController = navController)
        }

    }
}