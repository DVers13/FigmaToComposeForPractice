package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
fun ProjectCard() {
    LazyColumn(content = {
        item {
            Box {
                ImageHeader()
                Logo()
                Marks()
            }
        }
        item { Description() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { PreviewDota() }
        item {
            Text(
                "Review & Ratings", modifier = Modifier
                    .size(200.dp, 30.dp)
                    .padding(start = 24.dp, top = 6.dp), color = Color(0xFFEEF2FB),
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.sk_modernist_bold))
            )
        }
        item { ReviewRatingsicon() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { Comments() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { InstallButton() }
        item { Spacer(modifier = Modifier.height(20.dp)) }
    }, modifier = Modifier
        .height(1240.dp)
        .fillMaxWidth()
        .background(color = Color(0xFF050B18)))
}