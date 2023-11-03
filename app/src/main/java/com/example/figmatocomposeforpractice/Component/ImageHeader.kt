package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.figmatocomposeforpractice.R

@Composable
fun ImageHeader() {
    Image(
        painter = painterResource(id = R.drawable.main_label),
        contentDescription = "main_label",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .height(354.dp)
            .fillMaxWidth()
    )
}