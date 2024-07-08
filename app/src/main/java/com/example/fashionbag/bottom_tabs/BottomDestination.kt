package com.example.fashionbag.bottom_tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import com.example.fashionbag.R

interface BottomDestination {
    val route:String
    val selectedIcon:Int
    val unSelectedIcon:Int
    val title:String
}

object HomeB:BottomDestination{
    override val route = "Home"
    override val selectedIcon= R.drawable.baseline_home_24
    override val unSelectedIcon = R.drawable.outline_home_24
    override val title = "Home"

}
object MenuB:BottomDestination{
    override val route = "Menu"
    override val selectedIcon = R.drawable.baseline_menu_24
    override val unSelectedIcon = R.drawable.sharp_menu_24
    override val title = "Menu"

}
object ProfileB:BottomDestination{
    override val route = "Profile"
    override val selectedIcon = R.drawable.baseline_person_24
    override val unSelectedIcon = R.drawable.outline_person_24
    override val title = "Profile"

}