package com.example.fashionbag.screens

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.fashionbag.dataclass.MenuPurseRepositry
import com.example.fashionbag.dataclass.PurseRepositry

@Composable
fun Details(id: Int, cate: String) {
cate?.let {
    val menuItem = MenuPurseRepositry.getMenuData(id)
    val homeItem = PurseRepositry.getHomeData(id)

    when (cate) {
        "menu" -> menuItem?.image?.let { it1 -> menuItem?.name?.let { it2 -> menuItem?.description?.let { it3 -> DetailScreen(image = it1, name = it2, description = it3) } } }
        "home" -> homeItem?.image?.let { it1 -> homeItem?.name?.let { it2 -> homeItem?.description?.let { it3 -> DetailScreen(image = it1, name = it2, description = it3) } } }
         else -> Log.d("DetailScreen", "Unknown category")
    }

} ?: Log.e("DetailScreen", "Category is null")
}