package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.figmatocomposeforpractice.R

@Composable
fun Description() {
    Text(
        "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        fontSize = 12.sp,
        color = Color(0xFFEEF2FB),
        fontFamily = FontFamily(Font(R.font.sk_modernist_regular)),
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp)
    )
}