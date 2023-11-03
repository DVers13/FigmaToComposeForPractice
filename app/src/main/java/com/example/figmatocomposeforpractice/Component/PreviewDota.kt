package com.example.figmatocomposeforpractice.Component

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.figmatocomposeforpractice.R

@Composable
fun PreviewDota() {
    val contextForToast = LocalContext.current.applicationContext
    LazyRow(
        content = {
            item {
                Box(modifier = Modifier
                    .padding(start = 10.dp, end = 5.dp)
                    .size(240.dp, 120.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.example1),
                        contentDescription = "example1",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(125.dp)
                            .width(275.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .clickable {
                                Toast
                                    .makeText(
                                        contextForToast,
                                        "Video. Enjoy the show!",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }
                    )
                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = "play",
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.Center)
                    )
                }
            }
            item {
                Box(modifier = Modifier
                    .padding(start = 5.dp, end = 10.dp)
                    .size(240.dp, 120.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.example2),
                        contentDescription = "example2",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(125.dp)
                            .width(275.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .clickable {
                                Toast
                                    .makeText(
                                        contextForToast,
                                        "Another video =)",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            }

                    )
                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = "play",
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }, modifier = Modifier
            .height(140.dp)
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
    )
}
