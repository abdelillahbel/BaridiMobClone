package dev.devunion.baridimobclone.ui.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import dev.devunion.baridimobclone.ui.auth.components.LoginScreen

@Preview
@Composable
fun AuthScreen(
) {
    val navController = rememberNavController()

    Box(modifier = Modifier.fillMaxSize()) {

        LoginScreen(
            oneTapSignIn = {},
            navController
        )
    }
}
