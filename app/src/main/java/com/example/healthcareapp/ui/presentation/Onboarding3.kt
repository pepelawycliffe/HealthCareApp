package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthcareapp.R

@Composable
fun Onboarding3(){
    val image2 = painterResource(id = R.drawable.logo)
    Column(modifier = Modifier.fillMaxSize()
        , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = image2,
            contentDescription = "logo",
            contentScale = ContentScale.FillHeight,

            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "HealthCare" , fontSize = 28.sp,fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(22.dp))
        Text(text = "Let's Get Startted", fontSize = 22.sp,fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "login to stay health and fit" , fontSize = 16.sp)

        Spacer(modifier = Modifier.height(20.dp))
        Column (modifier = Modifier.fillMaxWidth().padding(0.dp,20.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.size(280.dp,60.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF407CE2)
                    ,contentColor=Color.Black),
                border = BorderStroke(1.dp,Color.Black),) {
                Text(text = "LOGIN")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column (modifier = Modifier.fillMaxWidth().padding(0.dp,20.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(280.dp,60.dp),
                colors = ButtonDefaults.buttonColors(Color.Transparent
                    ,contentColor=Color.Black),
                border = BorderStroke(1.dp,Color.Black),

            ) {
                Text(text = "SIGN UP")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Onboarding3Preview() {
    Onboarding3()

}