package com.example.navigation_compose.ControllerNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.navigation_compose.screen.Horizontal
import com.example.navigation_compose.screen.parte4

@Composable
fun NavComponent(){
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination = "view_1"){
        composable(route="view_1"){
            Horizontal(navegationController)
        }
        composable(route="view_2"){
            parte4(navegationController)
        }
    }
}