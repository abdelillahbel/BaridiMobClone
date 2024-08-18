package dev.devunion.baridimobclone.ui.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.devunion.baridimobclone.R
import dev.devunion.baridimobclone.navigation.Screens
import dev.devunion.baridimobclone.ui.theme.Blue40
import dev.devunion.baridimobclone.utils.PreferenceHelper

@Composable
fun LoginScreen(
    oneTapSignIn: () -> Unit, navController: NavController
) {
    val context = LocalContext.current
    val preferenceHelper: PreferenceHelper = PreferenceHelper(context)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.baridimoblogo),
            contentDescription = null,
            contentScale = ContentScale.None,

            )
        Spacer(modifier = Modifier.size(height = 60.dp, width = 0.dp))
        Spacer(modifier = Modifier.size(height = 12.dp, width = 0.dp))
        Text(
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 47.13.dp),
            text = "Forget password ?",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                fontWeight = FontWeight(300),
                color = Color(0xFFFEAA1B),
            )
        )
        Spacer(modifier = Modifier.size(height = 35.dp, width = 0.dp))
        ConnectButton(onClick = {

            navController.popBackStack()
            navController.navigate(route = Screens.MainScreen.route)
           // preferenceHelper.setUserSignedIn(true)

        })
        Spacer(modifier = Modifier.size(height = 32.dp, width = 0.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.line_spacer), contentDescription = null)
            Spacer(modifier = Modifier.size(height = 0.dp, width = 11.dp))
            Text(
                text = "Or",
                style = TextStyle(
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFEAA1B),
                )
            )
            Spacer(modifier = Modifier.size(height = 0.dp, width = 11.dp))
            Image(painter = painterResource(id = R.drawable.line_spacer), contentDescription = null)
        }
        Spacer(modifier = Modifier.size(height = 33.dp, width = 0.dp))
        AuthButton(
            onClick = oneTapSignIn,
            text = "Connect with google",
            logoPainter = painterResource(id = R.drawable.ic_google_logo)
        )
        Spacer(modifier = Modifier.size(height = 11.dp, width = 0.dp))
        AuthButton(
            modifier = Modifier.padding(bottom = 20.dp),
            onClick = { },
            text = "Connect with facebook",
            logoPainter = painterResource(id = R.drawable.ic_facebook_logo)
        )


    }
}

@Composable
fun ConnectButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "Connect"
) {
    Box(
        modifier = modifier
            .width(168.dp)
            .height(47.dp),

        ) {
        Image(
            painter = painterResource(id = R.drawable.connect_btn_background), // Replace with your drawable resource
            contentDescription = null, // Provide a description if needed
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds // Adjust contentScale as needed
        )

        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            ),// Make the Button background transparent
        ) {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    fontWeight = FontWeight(700),
                    fontStyle = FontStyle.Normal,
                    color = Color(0xFF0D0D16),
                )
            )
        }
    }
}

@Composable
fun AuthButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "Connect with google",
    logoPainter: Painter = painterResource(id = R.drawable.ic_google_logo)
) {
    Box(
        modifier = modifier
            .width(212.dp)
            .height(38.dp),

        ) {
        Image(
            painter = painterResource(id = R.drawable.sign_in_background), // Replace with your drawable resource
            contentDescription = null, // Provide a description if needed
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds // Adjust contentScale as needed
        )

        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            colors = ButtonDefaults.buttonColors(
                Color.Transparent
            ),
        ) {
            Image(
                painter = logoPainter,
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(14.dp))
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFEAA1B),
                )
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AuthContentPreview() {
    val navController = rememberNavController()
    LoginScreen(
        oneTapSignIn = {},
        navController
    )
}
