package com.example.healthcareapp.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen(){
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
          Text(text = "Enter your name")
      }
      Column {
          Text(text = "Enter your email")
      }
      Column {
          Text(text = "Enter your password")
      }
  }
}
}


@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()

}