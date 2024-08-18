package dev.devunion.baridimobclone.navigation

sealed class Screens(val route: String) {
//    object OnboardingScreen : Screens("onboarding_screen")
//
//    // Onboarding screens
//   data object OnboardingScreen1 : Screens("onboarding_screen_1")
//   data object OnboardingScreen2 : Screens("onboarding_screen_2")
//   data object OnboardingScreen3 : Screens("onboarding_screen_3")
//   data object OnboardingScreen4 : Screens("onboarding_screen_4")

    // App screens
    data object MainScreen : Screens("main_screen")
    data object HomeScreen : Screens("home_screen")
    data object SplashScreen : Screens("splash_screen")
    data object AuthScreen : Screens("auth_screen")
    data object CardsScreen : Screens("cards_screen")
    data object MenuScreen : Screens("menu_screen")
    data object AccountScreen : Screens("account_screen")
    data object ContestScreen : Screens("contest_screen")
    data object StatsScreen : Screens("stats_screen")
}
