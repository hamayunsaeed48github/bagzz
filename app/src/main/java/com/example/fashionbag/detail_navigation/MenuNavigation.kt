package com.example.fashionbag.detail_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.fashionbag.screens.Details
import com.example.fashionbag.screens.MenuDesign

@Composable
fun MenuNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route ){
        composable(Home.route){
            MenuDesign(navController)
        }
        composable(
            DetailsS.route + "/{${DetailsS.argId}}" + "/{${DetailsS.categoryMenu}}",
            arguments = listOf(
                navArgument(DetailsS.argId){
                    type = NavType.IntType
                },
                navArgument(DetailsS.categoryMenu){
                    type = NavType.StringType
                }
            ),
        ){
            val id = requireNotNull(it.arguments?.getInt(DetailsS.argId)){
                "Dish id is null"
            }
            val cate = requireNotNull(it.arguments?.getString(DetailsS.categoryMenu)){
                "cate is null"
            }
            Details(id,cate)

        }
    }
}