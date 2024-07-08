package com.example.fashionbag

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fashionbag.dataclass.HomeData
import com.example.fashionbag.ui.theme.PlayFair


@Composable
fun BagCard(
    name:String,
    image:Int,
    onClick: () -> Unit
){
    Card (
        modifier = Modifier.size(height = 250.dp, width = 170.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF1F1F1)
        )
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.Absolute.Right
        ){
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription =null,
                modifier = Modifier.size(20.dp)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id =image ),
                contentDescription =null,
                modifier = Modifier.size(height = 100.dp, width = 100.dp)

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = name,
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "SHOP NOW",
                fontFamily = PlayFair,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                modifier = Modifier.clickable {
                    onClick()
                }
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(vertical = 8.dp)
                    .height(4.dp)
                    .background(color = Color.Black)
            )



        }

    }
}


@Preview(showBackground = true)
@Composable
fun BagCardPreview(){
  //  BagCard()
}



@Composable
fun TopBar(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(start = 12.dp, end = 12.dp)
            .background(color = Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            ){
            Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription =null,
                modifier = Modifier.size(30.dp)
            )
            Text(
                text = "bagzz",
                fontFamily = PlayFair,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                modifier = Modifier.padding(start = 18.dp)

            )
        }

        Image(
            painter = painterResource(id = R.drawable.hamayun),
            contentDescription =null,
            modifier = Modifier
                .size(35.dp)
                .clip(shape = RoundedCornerShape(50))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
TopBar()
}