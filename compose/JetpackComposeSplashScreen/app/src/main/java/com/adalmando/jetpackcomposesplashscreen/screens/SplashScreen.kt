package com.adalmando.jetpackcomposesplashscreen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.adalmando.jetpackcomposesplashscreen.R
import com.adalmando.jetpackcomposesplashscreen.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){

    // Launched permite usar corrotina:
    LaunchedEffect(key1 = true){
        // delay de tempo que a splash ficará na tela:
        delay(5000)

        // limpando o backstack para quando entrar na main não poder voltar ao splash:
        navController.popBackStack()

        // mudando da splash para a main:
        navController.navigate(AppScreens.MainScreen.route)
    }
    Splash()
}

@Composable
fun Splash(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo), 
            contentDescription = "Logo do meu app",
            Modifier.size(300.dp, 300.dp)
        )
        Text(
            text = "Bem-vind@s",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
            )
    }
}