package com.example.figmatocomposeforpractice.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.figmatocomposeforpractice.R

@Composable
fun StarRatings(){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(14.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(14.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(14.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(14.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "star",
            modifier = Modifier
                .size(9.dp)
        )
    }
}