package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthcareapp.R

@Composable
fun SplashScreen() {
    val image = painterResource(id = R.drawable.splashicon)
    val image2 = painterResource(id = R.drawable.logo)
    @Composable
    fun ImageBackground(image: Painter,image2:Painter, function: @Composable () -> Unit) {
        Image(
            painter = image,
            contentDescription = "background image",
            contentScale = ContentScale.FillBounds, // or other scale options
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier.fillMaxSize()
        , verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = image2,
                contentDescription = "logo",
                contentScale =ContentScale.FillHeight,

            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "HealthCare" , fontSize = 28.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Medical App")
        }
//        Text(text = "hello")
}
    ImageBackground(image,image2){
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB2C4E4))
            , verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){

            Column {
                Text(text = "Splaah", fontSize = 30.sp)
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()

}