package com.lajeet.beatify.introAndAuth.presentation.composables.intro

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.lajeet.beatify.R
import com.lajeet.beatify.introAndAuth.presentation.IntroAndAuthViewModel
import com.lajeet.beatify.introAndAuth.presentation.composables.auth.AuthContainer

@Preview
@Composable
private fun SplashContainerPreview() {
    SplashContainer()
}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun SplashContainer() {
    val viewModel: IntroAndAuthViewModel = hiltViewModel()
    val userLoggedIn = remember { viewModel.loggedInInfo }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "app_icon"
        )
        Text(
            text = "Millions of Songs", style = TextStyle(
                color = Color.White, fontSize = 24.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Free on ${stringResource(id = R.string.app_name)}", style = TextStyle(
                color = Color.White, fontSize = 24.sp
            )
        )

        /*if (userLoggedIn.value.not()) {
            AuthContainer()
        }*/
    }
}