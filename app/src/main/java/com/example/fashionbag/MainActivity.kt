package com.example.fashionbag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fashionbag.bottom_tabs.BottomNavigaton
import com.example.fashionbag.screens.SplashScreen
import com.example.fashionbag.ui.theme.FashionBagTheme
import com.example.fashionbag.ui.theme.PlayFair

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FashionBagTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashNavigation()

                }
            }
        }
    }
}

@Composable
fun SplashNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  "splash_screen"){
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        composable("bottom"){
            BottomNavigaton()
        }
    }
}

