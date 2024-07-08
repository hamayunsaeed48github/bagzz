package com.example.fashionbag.detail_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.fashionbag.screens.Details
import com.example.fashionbag.screens.HomeDesign

@Composable
fun HomeNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route ){
        composable(Home.route){
            HomeDesign(navController)
        }
        composable(
            DetailsS.route + "/{${DetailsS.argId}}" + "/{${DetailsS.categoryHome}}",
            arguments = listOf(
                navArgument(DetailsS.argId){
                    type = NavType.IntType
                },
                navArgument(DetailsS.categoryHome){
                    type = NavType.StringType
                }
            ),
        ){
            val id = requireNotNull(it.arguments?.getInt(DetailsS.argId)){
                "Dish id is null"
            }
            val cate = requireNotNull(it.arguments?.getString(DetailsS.categoryHome)){
                "cate is null"
            }
            Details(id,cate)

        }
    }
}