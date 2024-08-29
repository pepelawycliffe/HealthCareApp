package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthcareapp.R

@Composable
fun Onboarding2(){
    val image4 = painterResource(id = R.drawable.onbordingmaledoc)

    @Composable
    fun ImageBackground(image4: Painter, function: @Composable () -> Unit) {
//        Image(
//            painter = image,
//            contentDescription = "background image",
//            contentScale = ContentScale.FillBounds, // or other scale options
//            modifier = Modifier.fillMaxSize()
//        )
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),
            horizontalAlignment = AbsoluteAlignment.Right){
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Skip", fontSize = 16.sp)
            }
        }
        Column(modifier = Modifier.fillMaxSize()
            , verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = image4,
                contentDescription = "logo",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.fillMaxSize(0.5f)

            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = "Find a lot of specialist \n doctors in one place" ,
                    fontSize = 28.sp,fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = AbsoluteAlignment.Right) {
                FloatingActionButton(onClick = { /*TODO*/ },
                    modifier = Modifier,
                    shape = CircleShape,
                ) {
                    Icon(imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow forward")
                }
            }
        }
//        Text(text = "hello")
    }
    ImageBackground(image4){
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB2C4E4))
            , verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){

            
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Onboarding2nPreview() {
    Onboarding2()

}