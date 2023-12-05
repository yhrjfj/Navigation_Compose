package com.yhr.jfj.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LastScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Last Screen",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go To Home Screen")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go To Previous Screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LastScreenPreview(){
    LastScreen()
}