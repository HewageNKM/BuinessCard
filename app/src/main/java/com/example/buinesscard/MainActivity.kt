package com.example.buinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}
@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id = R.drawable.myphoto), contentDescription = "MyPhoto", contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(0.dp,50.dp,0.dp,70.dp)
                .size(300.dp)
                .clip(CircleShape)
        )
        Row {
            Text(text = "Nadun Kawishika", fontSize = TextUnit(40F, TextUnitType.Sp), fontWeight = FontWeight.ExtraBold)
        }
        Row (
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { },
            verticalAlignment = Alignment.Bottom
        )
        {
            Image(painter = painterResource(id = R.drawable.android), contentDescription = "Android Img", modifier = Modifier.padding(20.dp))
            Text(text = "Android Developer", fontSize = TextUnit(25F, TextUnitType.Sp), fontWeight = FontWeight.SemiBold)
        }
        Row (
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { },
            verticalAlignment = Alignment.Bottom
        )
        {
            Image(painter = painterResource(id = R.drawable.phone), contentDescription = "Contact Img", modifier = Modifier.padding(20.dp))
            Text(text = "+9476172900", fontSize = TextUnit(25F, TextUnitType.Sp), fontWeight = FontWeight.SemiBold)
        }
        Row (
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 100.dp)
                .clickable { },
            verticalAlignment = Alignment.Bottom
        )
        {
            Image(painter = painterResource(id = R.drawable.email), contentDescription = "Email Img", modifier = Modifier.padding(20.dp))
            Text(text = "kawishikam@gmail.com", fontSize = TextUnit(25F, TextUnitType.Sp), fontWeight = FontWeight.SemiBold)
        }
    }
}