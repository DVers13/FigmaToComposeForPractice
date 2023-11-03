package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
fun ReviewRatingsicon() {
    Box(
        modifier = Modifier.height(58.dp).fillMaxWidth().padding(top = 5.dp)
    ) {
        Row() {
            Text("4.9",
                fontSize = 48.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp),
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold))
            )
            Box(
                modifier = Modifier
                    .size(80.dp, 60.dp)
                    .padding(top = 15.dp)
            ){
                Column() {
                    StarRatings()
                    Spacer(modifier = Modifier.height(3.dp))
                    Text("70M Reviews", fontSize = 12.sp, color = Color(0xFFA8ADB7))
                }
            }
        }
    }
}
