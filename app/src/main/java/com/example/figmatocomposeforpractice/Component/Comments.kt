package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.figmatocomposeforpractice.R

@Composable
fun Comments() {
    Column() {
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse8),
                contentDescription = "ellipse8",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(36.dp)
                    .width(36.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Column() {
                Text("Auguste Conte", color = Color.White, modifier = Modifier.padding(start = 10.dp), fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)))
                Text("February 14, 2019", color = Color(0xFFFFFFFF).copy(alpha = 0.4f), modifier = Modifier.padding(start = 10.dp), fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)))

            }
        }
        Text("“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xFFA8ADB7),
            modifier = Modifier.padding(start = 24.dp, end = 24.dp),
            fontFamily = FontFamily(Font(R.font.sk_modernist_regular))
        )
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .padding(start = 35.dp, end = 35.dp)
            .background(color = Color(0xFF1A1F29)))
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse9),
                contentDescription = "ellipse9",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(36.dp)
                    .width(36.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Column() {
                Text("Jang Marcelino", color = Color.White, modifier = Modifier.padding(start = 10.dp), fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular))
                )
                Text("February 14, 2019", color = Color(0xFFFFFFFF).copy(alpha = 0.4f), modifier = Modifier.padding(start = 10.dp), fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist_regular)))

            }
        }
        Text("“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xFFA8ADB7),
            modifier = Modifier.padding(start = 24.dp, end = 24.dp),
            fontFamily = FontFamily(Font(R.font.sk_modernist_regular)))
    }
}
