package com.javcasdev.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javcasdev.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(0xFFAAD9B6)
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 300.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                Modifier
                    .size(80.dp)
                    .padding(bottom = 8.dp)
                    .background(color = Color(0xFF07414F))
            )
            Text(
                text = "Javier Castillo",
                fontFamily = FontFamily.SansSerif,
                fontSize = 32.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Android Developer",
                color = Color(0xFF05411C),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(48.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Row(Modifier.padding(bottom = 8.dp)) {
                Box {
                    Icon(
                        imageVector = Icons.Filled.Call,
                        contentDescription = "phone icon",
                        tint = Color(0xFF05411C),
                        modifier = Modifier.padding(end = 16.dp)
                    )
                }

                Box {
                    Text(text = "+52 1122 3344")
                }
            }

            Row(Modifier.padding(bottom = 8.dp)) {
                Box {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share icon",
                        tint = Color(0xFF05411C),
                        modifier = Modifier.padding(end = 16.dp)
                    )
                }

                Box {
                    Text(text = "@JavDev")
                }
            }

            Row {
                Box {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "email icon",
                        tint = Color(0xFF05411C),
                        modifier = Modifier.padding(end = 16.dp)
                    )
                }

                Box {
                    Text(text = "javier.dev@gmail.com")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}