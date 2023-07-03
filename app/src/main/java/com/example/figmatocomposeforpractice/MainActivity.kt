package com.example.figmatocomposeforpractice

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val systemUiController = rememberSystemUiController()
            SideEffect {
                systemUiController.setStatusBarColor(
                    color = Color.Transparent,
                    darkIcons = false
                )
            }
            MessageCard()
        }
    }
}

@Composable
fun MessageCard() {
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
                fontSize = 16.sp
            )
        }
        item { ReviewRatingsicon() }
        item { Spacer(modifier = Modifier.height(20.dp))}
        item { Com() }
        item { Spacer(modifier = Modifier.height(20.dp))}
        item { InstallButton() }
        item { Spacer(modifier = Modifier.height(20.dp))}
    }, modifier = Modifier
        .size(375.dp, 1226.dp)
        .background(color = Color(0xFF050B18)))
}

@Composable
fun ImageHeader() {
    Image(
        painter = painterResource(id = R.drawable.main_label),
        contentDescription = "main_label",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .size(628.dp, 354.dp)
    )
}

@Composable
fun Logo() {
    Row(
        modifier = Modifier
            .height(420.dp)
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier.size(130.dp)){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
        Column(modifier = Modifier.padding(bottom = 40.dp)) {
            Text(
                "DoTA 2",
                color = Color.White,
                fontSize = 26.sp
            )
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
                Text("70M", fontSize = 10.sp, modifier = Modifier.padding(start = 5.dp),
                color = Color(0xFF45454D))
            }

        }
    }
}

@Composable
fun Marks() {
    val contextForToast = LocalContext.current.applicationContext
    Row(
        modifier = Modifier
            .height(400.dp)
            .padding(start = 24.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Start

    ) {
        Button(onClick = {
            Toast.makeText(contextForToast, "Move to MOBA!", Toast.LENGTH_SHORT).show()
        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF44A9F4).copy(alpha = 0.24f)), modifier = Modifier
            .size(53.dp, 18.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(20.dp))
        {
            Text("MOBA", fontSize = 7.sp,
            color = Color(0xFF41A0E7),
                modifier = Modifier
            )
        }
        Button(
            onClick = {
                Toast.makeText(contextForToast, "Move to MULTIPLAYER!", Toast.LENGTH_SHORT).show()
            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF44A9F4).copy(alpha = 0.24f)),
            modifier = Modifier
                .size(93.dp, 18.dp)
                .padding(start = 5.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(20.dp)
        )
        {
            Text("MULTIPLAYER", fontSize = 7.sp,
                color = Color(0xFF41A0E7))
        }
        Button(onClick = {
            Toast.makeText(contextForToast, "Move to STRATEGY!", Toast.LENGTH_SHORT).show()

        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF44A9F4).copy(alpha = 0.24f)), modifier = Modifier
            .size(73.dp, 18.dp)
            .padding(start = 5.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(20.dp))
        {
            Text("STRATEGY", fontSize = 7.sp,
                color = Color(0xFF41A0E7))
        }
    }
}


@Composable
fun Description() {
    Text(
        "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        fontSize = 12.sp,
        color = Color(0xFFEEF2FB)
        ,modifier = Modifier
            .height(76.dp)
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp)
    )
}

@Composable
fun PreviewDota() {
    val contextForToast = LocalContext.current.applicationContext
    LazyRow(
        content = {
            item {
                Box(modifier = Modifier.padding(start = 10.dp, end = 5.dp).size(240.dp, 120.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.example1),
                        contentDescription = "example1",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(125.dp)
                            .width(275.dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = "play",
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.Center)
                            .clickable { Toast.makeText(contextForToast, "Video. Enjoy the show!", Toast.LENGTH_SHORT).show() }
                    )
                }
            }
            item {
                Box(modifier = Modifier.padding(start = 5.dp, end = 10.dp).size(240.dp, 120.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.example2),
                        contentDescription = "example2",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(125.dp)
                            .width(275.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .clickable { Toast.makeText(contextForToast, "Another video =)", Toast.LENGTH_SHORT).show() }

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
            .height(128.dp)
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
    )
}


@Composable
fun ReviewRatingsicon() {
    Box(
        modifier = Modifier.size(200.dp, 58.dp)
    ) {
        Row() {
            Text("4.9", fontSize = 48.sp, color = Color.White, modifier = Modifier.padding(start = 24.dp, end = 24.dp))

            Box(
                modifier = Modifier
                    .size(80.dp, 60.dp)
                    .padding(top = 15.dp)
            ){
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
                    )}
            }
        }
    }
}


@Composable
fun Com() {
    Column() {
        Row(
            modifier = Modifier
                .height(58.dp)
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
                Text("Auguste Conte", color = Color.White, modifier = Modifier.padding(start = 10.dp), fontSize = 16.sp)
                Text("February 14, 2019", color = Color(0xFFFFFFFF).copy(alpha = 0.4f), modifier = Modifier.padding(start = 10.dp), fontSize = 12.sp)

            }
        }
        Text("“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
        color = Color(0xFFA8ADB7),
            modifier = Modifier.padding(start = 24.dp, end = 24.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier.fillMaxWidth().height(2.dp).padding(start = 35.dp, end = 35.dp).background(color = Color(0xFF1A1F29)))
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .height(58.dp)
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
                Text("Jang Marcelino", color = Color.White, modifier = Modifier.padding(start = 10.dp), fontSize = 16.sp)
                Text("February 14, 2019", color = Color(0xFFFFFFFF).copy(alpha = 0.4f), modifier = Modifier.padding(start = 10.dp), fontSize = 12.sp)

            }
        }
        Text("“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xFFA8ADB7),
        modifier = Modifier.padding(start = 24.dp, end = 24.dp))
    }
}

@Composable
fun InstallButton() {
    val contextForToast = LocalContext.current.applicationContext
    Button(onClick = {
        Toast.makeText(contextForToast, "Installation, please wait ;)!", Toast.LENGTH_SHORT).show()

    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4D144)), modifier = Modifier
        .height(64.dp)
        .fillMaxWidth()
        .padding(start = 24.dp, end = 24.dp, bottom = 6.dp),
        shape = RoundedCornerShape(20.dp))
    {
        Text("Install", color = Color(0xFF050B18), fontSize = 20.sp)
    }
}


@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard()
}