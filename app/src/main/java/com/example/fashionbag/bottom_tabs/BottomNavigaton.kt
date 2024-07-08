package com.example.fashionbag.bottom_tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fashionbag.screens.Home
import com.example.fashionbag.screens.Menu
import com.example.fashionbag.screens.Profile
import com.example.fashionbag.screens.SplashScreen

@Composable
fun BottomNavigaton(){
    BottomNavigationMain()
}

@Composable
fun BottomNavigationMain(){

    val navController = rememberNavController()
    Scaffold (
        bottomBar = { MyBottomNavigation(navController = navController) }
    ){
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController, startDestination = HomeB.route){

                composable(HomeB.route){
                    Home()
                }
                composable(MenuB.route){
                    Menu()
                }
                composable(ProfileB.route){
                   Profile()
                }

            }
        }

    }

}

@Composable
fun MyBottomNavigation(navController: NavController){

    val bottomDestinationList = listOf<BottomDestination>(
        HomeB,
        MenuB,
        ProfileB
    )

    val selectedIndex = rememberSaveable{
        mutableIntStateOf(0)
    }

    androidx.compose.material.BottomNavigation(
        backgroundColor = Color.White
    ) {
        bottomDestinationList.forEachIndexed { index, bottomDestination ->
            BottomNavigationItem(
                selected = index ==selectedIndex.intValue,
                label = { Text(text = bottomDestination.title, fontSize = 14.sp)},
                onClick = {
                    selectedIndex.intValue = index
                    navController.navigate(bottomDestinationList[index].route){
                        popUpTo(HomeB.route)
                        launchSingleTop = true
                    }

                },
                icon = {
                    Image(
                        painter = painterResource(id =if (index == selectedIndex.intValue){
                            bottomDestination.selectedIcon
                        }
                        else{
                            bottomDestination.unSelectedIcon
                        }),
                        contentDescription = bottomDestination.title,

                    )
                }
            )
        }
    }


}