package com.example.fashionbag.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.fashionbag.BagCard
import com.example.fashionbag.TopBar
import com.example.fashionbag.dataclass.MenuData
import com.example.fashionbag.dataclass.MenuPurseRepositry
import com.example.fashionbag.detail_navigation.DetailsS
import com.example.fashionbag.detail_navigation.MenuNavigation

@Composable
fun Menu(){
MenuNavigation()
}

@Composable
fun MenuCard(
    menuData: MenuData,
    navController: NavHostController
){
    BagCard(name = menuData.name, image = menuData.image, onClick = {
        navController.navigate(DetailsS.route + "/${menuData.id}" + "/${DetailsS.categoryMenu}")
    })

}

@Composable
fun MenuDesign(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        TopBar()
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(bottom = 16.dp)

        ) {
            itemsIndexed(MenuPurseRepositry.menuPurseList){ _, item->
                MenuCard(menuData = item,navController = navController)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuPreview(){
    Menu()
}