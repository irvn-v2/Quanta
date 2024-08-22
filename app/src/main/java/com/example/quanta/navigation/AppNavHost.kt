package com.example.quanta.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quanta.ui.theme.screens.category.CategoryScreen
import com.example.quanta.ui.theme.screens.contact.ContactScreen
import com.example.quanta.ui.theme.screens.home.HomeScreen
import com.example.quanta.ui.theme.screens.login.LoginScreen
import com.example.quanta.ui.theme.screens.menu.MenuScreen
import com.example.quanta.ui.theme.screens.notification.NotificationScreen
import com.example.quanta.ui.theme.screens.signup.SignupScreen
import com.example.quanta.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }


        composable(ROUT_MENU) {
            MenuScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }


        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ROUT_CATEGORY) {
            CategoryScreen(navController = navController)
        }

        composable(ROUT_NOTIFICATION) {
            NotificationScreen(navController = navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController = navController)
        }

    }

}