package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.figmatocomposeforpractice.R

@Composable
fun StarMain(){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(10.dp)
        )
        Text("70M",
            fontSize = 10.sp,
            modifier = Modifier
                .padding(start = 5.dp),
            color = Color(0xFF45454D),
            fontFamily = FontFamily(Font(R.font.sk_modernist_regular))
        )
    }
}