package dev.devunion.baridimobclone.ui.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.devunion.baridimobclone.R
import dev.devunion.baridimobclone.utils.PreferenceHelper


@Preview
@Composable
fun SplashScreenPreview() {
    val navController = rememberNavController()
    SplashScreen(navController = navController)
}

@Composable
fun SplashScreen(navController: NavController) {
    val context = LocalContext.current
    val preferenceHelper: PreferenceHelper = PreferenceHelper(context)

    LaunchedEffect(Unit) {
//        delay(2000)


//         Navigate to the main screen
        navController.popBackStack()
        navController.navigate("main_screen")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .size(150.dp),
            painter = painterResource(id = R.drawable.baridimoblogo),
            contentDescription = "splash logo"
        )
    }
}
