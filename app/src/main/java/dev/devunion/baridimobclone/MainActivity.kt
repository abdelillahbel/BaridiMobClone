package dev.devunion.baridimobclone

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dev.devunion.baridimobclone.navigation.NavGraph
import dev.devunion.baridimobclone.navigation.Screens
import dev.devunion.baridimobclone.ui.main.MainScreen
import dev.devunion.baridimobclone.ui.theme.BaridiMobCloneTheme


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            navController = rememberNavController()
            NavGraph(
                navController = navController
            )
            val currentApiVersion = Build.VERSION.SDK_INT
            if (currentApiVersion < Build.VERSION_CODES.S) {
                navigateToSplashScreen()
            } else {
                navigateToMainScreen()
            }
        }
    }

    private fun navigateToSplashScreen() {
        navController.popBackStack()
        navController.navigate(route = Screens.SplashScreen.route)
    }


    private fun navigateToMainScreen() {
        navController.popBackStack()
        navController.navigate(route = Screens.MainScreen.route)
    }
}
