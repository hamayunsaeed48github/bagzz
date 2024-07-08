package com.example.fashionbag.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fashionbag.R
import com.example.fashionbag.ui.theme.PlayFair

@Composable
fun Profile(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        ProfileTopBar()
        Box (
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 12.dp,),

        ){
            Image(
                painter = painterResource(id = R.drawable.profile_backgroud),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.FillBounds
            )
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 180.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 5.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 12.dp, top = 100.dp),
                ) {
                    Text(
                        text = "Your all Details",
                        fontFamily = PlayFair,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    TextComposable(text1 = "Name:", text2 = "Hamayun Saeed")
                    Spacer(modifier = Modifier.height(10.dp))
                    TextComposable(text1 = "Contact:", text2 = "0301-7283563")
                    Spacer(modifier = Modifier.height(10.dp))
                    TextComposable(text1 = "Email:", text2 = "hamayunsaeed48@gmail.com")
                    Spacer(modifier = Modifier.height(10.dp))
                    TextComposable(text1 = "Linkedin:", text2 = "www.linkedin.com/in/hamayun-saeed-585957185")
                    TextComposable(text1 = "Location:", text2 = "Lahore Pakistan")



                }

            }
            Box(
                modifier = Modifier.padding(start = 100.dp,top = 100.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.hamayun),
                    contentDescription =null,
                    modifier= Modifier
                        .clip(
                            shape = CircleShape
                        )
                        .size(170.dp)
                        .border(2.dp, Color.Black, CircleShape)

                )
            }



        }

    }

}

@Composable
fun ProfileTopBar(){
    Row (
        modifier= Modifier
            .fillMaxWidth()
            .size(56.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(
            text = "Profile",
            fontFamily = PlayFair,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            modifier = Modifier.padding(start = 18.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview(){
    Profile()
}


@Preview(showBackground = true)
@Composable
fun ProfileTopBarPreview(){
    ProfileTopBar()
}

@Composable
fun TextComposable(
    text1:String,
    text2:String
){
Row (
    modifier=Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically
){
    Text(
        text = text1,
        fontFamily = PlayFair,
        fontSize = 18.sp
    )
    Spacer(modifier = Modifier.width(10.dp))
    Text(
        text = text2,
        fontSize = 16.sp
    )

}
}


@Preview(showBackground = true)
@Composable
fun TextComposablePreview(){
TextComposable("name:","Hamayun")
}