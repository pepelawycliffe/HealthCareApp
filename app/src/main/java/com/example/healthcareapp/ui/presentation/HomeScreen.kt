package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.healthcareapp.R

@Composable
fun HomeScreen() {
    val image3 = painterResource(id = R.drawable.homepgwoman)
    val imagetopdoc = painterResource(id = R.drawable.topdoc)
    val imagepharmacy = painterResource(id = R.drawable.pharmacy)
    val imageambl = painterResource(id = R.drawable.ambl)
    var text by remember { mutableStateOf(TextFieldValue("")) }

    @Composable
    fun ImageBackground(image3: Painter,imagetopdoc:Painter, imagepharmacy:Painter,imageambl:Painter,function: @Composable () -> Unit) {
        Scaffold(bottomBar = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(0.2f),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Column {
                            Icon(imageVector = Icons.Default.Home, contentDescription = "Home icon")
                            Text(text = "Home")
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(0.2f),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Column {
                            Icon(imageVector = Icons.Default.List, contentDescription = "Reports")
                            Text(text = "Reports")
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Notification"
                            )
                            Text(text = "Notification")
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(0.4f),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Column {
                            Icon(imageVector = Icons.Default.Person, contentDescription = "Profile")
                            Text(text = "Profile")
                        }
                    }
                }
            }
        }) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {

            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .background(color = Color(0xFFCCC2DC))
                        .size(400.dp, 400.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(modifier = Modifier.fillMaxSize(0.7f)) {
                                Row {
                                    Column(modifier = Modifier
                                        .fillMaxHeight()
                                        .padding(0.dp, 100.dp)) {
                                        Text(text = "Welcome ! \n Ruchita")
                                        Spacer(modifier = Modifier.height(20.dp))
                                        Text(text = " How is it going today")
                                    }
                                }
                                Row(modifier = Modifier.fillMaxSize(1f)) {

                                    Image(
                                        painter = image3,
                                        contentDescription = "logo",
                                        contentScale = ContentScale.FillHeight,
                                        modifier = Modifier.fillMaxSize()

                                    )
                                }
                            }
                        }
                    }


                }
                Column(modifier = Modifier.size(600.dp,400.dp)) {
                    Column(modifier = Modifier.fillMaxSize()
//                        .background(color = Color.Green),
                        ,verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Column (modifier = Modifier.fillMaxSize(),
//                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Column (modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally){
                                TextField(value = text, onValueChange ={newtext -> text=newtext},
                                    modifier =Modifier,
                                    label = {Text(text = "search doctor drug artical")},
                                    leadingIcon = {Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = null,
                                    )},
                                    trailingIcon = {},
                                    shape = RoundedCornerShape(50),

                                    )
                                Spacer(modifier = Modifier.height(20.dp))
//                                Text(text = "search")
                            }
                            Column(modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally) {
                                Row (modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center){
                                    Column (modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp)){
                                        Image(painter = imagetopdoc,
                                            contentDescription = "logo",
                                            contentScale =ContentScale.FillHeight,
                                            )
                                        Text(text = "Top Doctor")
                                    }
                                    Column (modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp)) {
                                        Image(painter = imagepharmacy,
                                            contentDescription = "logo",
                                            contentScale =ContentScale.FillHeight,
                                            )
                                        Text(text = "Pharmacy")
                                    }
                                    Column (modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp)){
                                        Image(painter = imageambl,
                                            contentDescription = "logo",
//                                            contentScale =ContentScale.FillHeight,

                                            )
                                        Text(text = "Ambulance" ,fontSize = 16.sp)
                                    }

                                }

                            }
                            Column (modifier = Modifier.fillMaxSize(),
                            ) {
//                                Text(text = " MAIN Health artical")
                                Column(modifier = Modifier.fillMaxWidth(),
                                    horizontalAlignment = Alignment.CenterHorizontally) {
                                    Row (modifier = Modifier.fillMaxWidth()){
                                        Column (modifier = Modifier.padding(10.dp),
                                            horizontalAlignment = AbsoluteAlignment.Left,
                                            verticalArrangement = Arrangement.Center){
                                            Text(text = "Health artical", fontSize = 22.sp)
                                        }
                                        Column (modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(10.dp, 0.dp, 20.dp),
                                            horizontalAlignment = AbsoluteAlignment.Right) {
                                             TextButton(onClick = { /*TODO*/ }) {
                                                 Text(text = "See all")
                                             }
                                        }
                                    }
                                }
                                Column (modifier = Modifier
                                    .fillMaxSize()
                                    .padding(10.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center){
                                    Column {
                                        Card (
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .padding(20.dp),
                                            shape = RoundedCornerShape(10),
                                        ){
                                            Row(modifier = Modifier.fillMaxSize()) {
                                                Column(modifier = Modifier.fillMaxHeight()) {
                                                    Image(
                                                        painter = image3,
                                                        contentDescription = "logo",
                                                        contentScale = ContentScale.FillHeight,
                                                        modifier = Modifier.fillMaxHeight()
                                                    )
                                                }
                                                Column (modifier = Modifier.fillMaxHeight()) {
                                                   Text(text = "The 25 Healthiest Fruits \n You Can Eat, According to a Nutritionist")
                                                       Spacer(modifier = Modifier.height(10.dp))
                                                    Row (modifier = Modifier
                                                        .fillMaxWidth()
                                                        .padding(10.dp, 0.dp, 0.dp, 0.dp)){
                                                        Column {
                                                                Text(text = "Jun 10, 20223 ")
                                                        }
                                                        Column {
                                                                 Text(text = "5min read")
                                                        }
                                                    }
                                                }
                                                Column (modifier = Modifier.fillMaxHeight()){
                                                    Image(
                                                        painter = image3,
                                                        contentDescription = "logo",
//                                                        contentScale = ContentScale.FillHeight,
//                                                        modifier = Modifier.fillMaxHeight()
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
//                                Text(text = "Health artical")
                            }
                        }
                        Text(text = "in")
                    }
                }



//                Text(text = "main")


            }

        }
    }
    ImageBackground(image3,imagetopdoc,imagepharmacy,imageambl){
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
fun HomeScreenPreview() {
    HomeScreen()

}