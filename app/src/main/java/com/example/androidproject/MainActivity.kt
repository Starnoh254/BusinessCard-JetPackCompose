package com.example.androidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.example.androidproject.ui.theme.AndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Screen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Profile(modifier = Modifier.weight(1f))
        ContactInformation(modifier = Modifier.fillMaxWidth())

        
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .height(240.dp)
                .width(240.dp)
        )
        Text(
            text = "Starnoh",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer",
            fontSize = 20.sp
        )
    }
}

@Composable
fun ContactInformation(modifier: Modifier =  Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally, ) {
        Row(horizontalArrangement = Arrangement.Center, modifier = modifier.padding(4.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_call_black_24),
                contentDescription =null,
                tint = Color(19, 175, 19, 255),
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp)

            )
            Text(text = "0722951238")
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.baseline_email_black_24),
                contentDescription = null,
                tint = Color(19, 175, 19, 255),
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp)
            )
            Text(text = "stajohn697@gmail.com")
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.baseline_share_black_24),
                contentDescription = null,
                tint = Color(19, 175, 19, 255),
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp)
            )
            Text(text = "@Androiddev")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AndroidProjectTheme {
        Screen()
    }
}