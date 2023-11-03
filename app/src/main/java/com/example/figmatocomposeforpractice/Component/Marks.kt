package com.example.figmatocomposeforpractice.Component

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.figmatocomposeforpractice.R

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
            shape = RoundedCornerShape(20.dp)
        )
        {
            Text("MOBA", fontSize = 7.sp,
                color = Color(0xFF41A0E7),
                fontFamily = FontFamily(Font(R.font.montserrat_medium))
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
                color = Color(0xFF41A0E7),
                fontFamily = FontFamily(Font(R.font.montserrat_medium))
            )
        }
        Button(onClick = {
            Toast.makeText(contextForToast, "Move to STRATEGY!", Toast.LENGTH_SHORT).show()

        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF44A9F4).copy(alpha = 0.24f)), modifier = Modifier
            .size(73.dp, 18.dp)
            .padding(start = 5.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(20.dp)
        )
        {
            Text("STRATEGY", fontSize = 7.sp,
                color = Color(0xFF41A0E7),
                fontFamily = FontFamily(Font(R.font.montserrat_medium)))
        }
    }
}
