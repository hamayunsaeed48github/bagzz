package com.example.fashionbag.detail_navigation

interface DetailDestination{
    val route:String
}

object Home:DetailDestination{
    override val route = "Home"
}

object Menu:DetailDestination{
    override val route = "Menu"
}

object DetailsS:DetailDestination{
    override val route ="detail"
    const val argId = "DishId"
    const val categoryHome ="home"
    const val categoryMenu = "menu"


}