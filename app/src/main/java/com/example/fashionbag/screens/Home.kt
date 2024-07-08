package com.example.fashionbag.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fashionbag.BagCard
import com.example.fashionbag.R
import com.example.fashionbag.TopBar
import com.example.fashionbag.dataclass.HomeData
import com.example.fashionbag.dataclass.PurseRepositry
import com.example.fashionbag.detail_navigation.DetailsS
import com.example.fashionbag.detail_navigation.HomeNavigation
import com.example.fashionbag.ui.theme.PlayFair
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(){
 HomeNavigation()
}

@Composable
fun HomeDesign(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        TopBar()
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp, top = 12.dp, end = 12.dp)
        ){
            ImageCarousel()
//            Image(
//                painter = painterResource(id = R.drawable.full_image_2),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp),
//                contentScale = ContentScale.FillBounds
//            )
            Text(
                text = "Popular Items" ,
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.padding(bottom = 16.dp)

            ) {
                itemsIndexed(PurseRepositry.purseList){_,item->
                    HomeCard(homeData = item,navController = navController)
                }
            }

        }

    }
}

@Composable
fun HomeCard(
    homeData: HomeData,
    navController: NavHostController
){
    BagCard(name = homeData.name, image = homeData.image, onClick = {
        navController.navigate(DetailsS.route + "/${homeData.id}" + "/${DetailsS.categoryHome}")
    })
}

@Composable
fun ImageCarousel() {
    val images = listOf(
        R.drawable.profile_backgroud,
        R.drawable.full_image_2,
        R.drawable.image_a,
        R.drawable.image_b

    )

    var currentImageIndex by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000) // Delay for 5 seconds
            currentImageIndex = (currentImageIndex + 1) % images.size
        }
    }

    Image(
        painter = painterResource(id = images[currentImageIndex]),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.FillBounds


    )
}



