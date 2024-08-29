package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen(){
    var text by remember { mutableStateOf(TextFieldValue("")) }
    val checkedState = remember { mutableStateOf(true) }
Scaffold (topBar = { CenterAlignedTopAppBar(title = {
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "SIGN UP")
    }
  Column(modifier = Modifier.fillMaxWidth(),
      horizontalAlignment = AbsoluteAlignment.Left) {
      Icon(imageVector = Icons.Default.KeyboardArrowLeft,
          contentDescription = "Arrow back")

  }
})}){
    paddingValues ->
    Column (modifier = Modifier.padding(paddingValues)){

    }
  Column (modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally){
      Column {
          TextField(value = text, onValueChange ={newtext -> text=newtext},
              modifier =Modifier,
              label = {Text(text = "Enter your  name")},
              leadingIcon = {Icon(
                  imageVector = Icons.Default.Person,
                  contentDescription = null,
              )},
              trailingIcon = {},
              shape = CircleShape,
             
          )
          Spacer(modifier = Modifier.height(20.dp))
//          Text(text = "Enter your  name")
      }
      Column {
          TextField(value = text, onValueChange ={newtext -> text=newtext},
              modifier =Modifier,
              label = {Text(text = "Enter your email")},
              leadingIcon = {Icon(
                  imageVector = Icons.Default.Email,
                  contentDescription = null,
              )},
              trailingIcon = {},
              shape = CircleShape,

              )
          Spacer(modifier = Modifier.height(20.dp))
//          Text(text = "Enter your email")
      }
      Column {
          TextField(value = text, onValueChange ={newtext -> text=newtext},
              modifier =Modifier,
              label = {Text(text = "Enter your  password")},
              leadingIcon = {Icon(
                  imageVector = Icons.Default.Lock,
                  contentDescription = null,
              )},
//              Change thie icon to secure
              trailingIcon = {Icon(
                  imageVector = Icons.Default.Lock,
                  contentDescription = null,
//                  tint = if (value.isEmpty()) Color.Gray else Color.Black // Adjust color as needed
              )},
              shape = CircleShape,

              )
          Spacer(modifier = Modifier.height(10.dp))
//          Text(text = "Enter your password")

      }
      Column(modifier = Modifier
          .fillMaxWidth()
          .padding(30.dp, 10.dp),
          horizontalAlignment = Alignment.CenterHorizontally) {
          Row {
              Row {
                  Checkbox(
                      checked = checkedState.value,
                      onCheckedChange = { checkedState.value = it }
                  )
              }
              Row {
                  Text(text = "I agree to the healthcare Terms of service and Privacy Policy")
              }
          }
      }
  }
//    Button column
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ },
            modifier =Modifier.size(280.dp,60.dp)

        ){
            Text(text = "SING UP")
            
        }
        Spacer(modifier = Modifier.height(10.dp))
       TextButton(onClick = { /*TODO*/ }) {
           Text(text = "Don't have an account Sign Up ", fontSize = 14.sp)
       }
        Spacer(modifier = Modifier.height(20.dp))
    }
}
}


@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()

}