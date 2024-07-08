package com.example.fashionbag.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fashionbag.R
import com.example.fashionbag.TopBar
import com.example.fashionbag.ui.theme.PlayFair

@Composable
fun DetailScreen(
    image:Int,
    name:String,
    description: String
){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        TopBar()
        UpperPannel(image = image, name = name)
        LowerPannel(description = description)
    }


}


@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(){

    DetailScreen(image = R.drawable.bag_c, name = "hello", description = "Hermes, established in Paris in 1837, is famed for its impeccable craftsmanship and dedication to luxury. Hermes purses, such as the Birkin and Kelly bags, are crafted from the finest materials like Togo or Epsom leather and adorned with the brand's iconic hardware. Known for their exclusivity and meticulous attention to detail, Hermes purses embody timeless elegance and are a symbol of prestige and refinement in the fashion industry.")
}

@Composable
fun UpperPannel(
    image:Int,
    name:String
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 12.dp, top = 12.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(id = image) ,
            contentDescription =null,
            modifier=Modifier.size(180.dp)

        )
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = name,
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "$568",
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "BUY NOW",
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color=Color.White,
                modifier = Modifier
                    .background(Color.Black)
                    .padding(12.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .padding(vertical = 8.dp)
                    .height(4.dp)
                    .background(color = Color.Black)
            )

        }

    }

}


@Preview(showBackground = true)
@Composable
fun UpperPannelPreview(){

    UpperPannel(image = R.drawable.bag_1,"Artsy")
}


@Composable
fun LowerPannel(
    description:String
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        DescriptionBar()
        Text(
            text =description,
            fontSize = 18.sp
        )

    }

}


@Preview(showBackground = true)
@Composable
fun LowerPannelPreview(){
LowerPannel(description = "Hermes, established in Paris in 1837, is famed for its impeccable craftsmanship and dedication to luxury. Hermes purses, such as the Birkin and Kelly bags, are crafted from the finest materials like Togo or Epsom leather and adorned with the brand's iconic hardware. Known for their exclusivity and meticulous attention to detail, Hermes purses embody timeless elegance and are a symbol of prestige and refinement in the fashion industry.\"")
}

@Composable
fun DescriptionBar(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .size(56.dp)
            .padding(top = 12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Description",
            fontFamily = PlayFair,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,


            )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.28f)
                .padding(vertical = 8.dp)
                .height(4.dp)
                .background(color = Color.Black)
        )


    }
}
