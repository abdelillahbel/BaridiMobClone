package dev.devunion.baridimobclone.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.devunion.baridimobclone.ui.account.AccountScreen
import dev.devunion.baridimobclone.ui.cards.CardsScreen
import dev.devunion.baridimobclone.ui.home.HomeScreen
import dev.devunion.baridimobclone.ui.main.MainScreen
import dev.devunion.baridimobclone.ui.menu.MenuScreen
import dev.devunion.baridimobclone.ui.splash.SplashScreen


@Composable
fun NavGraph(navController: NavHostController) {
    // val user = Firebase.auth.currentUser
    // val context = LocalContext.current
    // val preferenceHelper:  PreferenceHelper = PreferenceHelper(context)

    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {

        composable(route = Screens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(route = Screens.MainScreen.route) {
            MainScreen(navController)
        }

        // startDestination = when (user) {
        //     null -> Screens.AuthScreen.route
        //     else -> Screens.MainScreen.route
        // }

        /*   composable(route = Screens.OnboardingScreen.route) {
               OnboardingScreen {
                   navController.popBackStack()
                   navController.navigate(route = Screens.AuthScreen.route)
               }
           }

           composable(route = Screens.AuthScreen.route, enterTransition = {
               slideIntoContainer(
                   AnimatedContentTransitionScope.SlideDirection.Left, animationSpec = tween(700)
               )
           }, exitTransition = {
               slideOutOfContainer(
                   AnimatedContentTransitionScope.SlideDirection.Right, animationSpec = tween(700)
               )
           }) {
               AuthScreen(navigateToMainScreen = {
                   navController.popBackStack()
                   navController.navigate(route = Screens.MainScreen.route)
               })
           }*/



    }
}

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.route
    ) {

        composable(route = Screens.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(route = Screens.CardsScreen.route) {
            CardsScreen(navController)
        }
        composable(route = Screens.MenuScreen.route) {
            MenuScreen(navController)
        }
        composable(route = Screens.AccountScreen.route) {
            AccountScreen(navController)
        }

    }
}
