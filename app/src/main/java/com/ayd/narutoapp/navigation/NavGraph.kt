package com.ayd.narutoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ayd.narutoapp.presentation.screens.splash.SplashScreen
import com.ayd.narutoapp.presentation.screens.welcome.WelcomeScreen
import com.ayd.narutoapp.util.Constant.DETAILS_ARGUMENT_KEY
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Welcome.route){

        composable(route = Screens.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screens.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screens.Home.route){

        }
        composable(
            route = Screens.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
                type = NavType.IntType
            })
        ){

        }
        composable(route = Screens.Search.route){

        }

    }

}