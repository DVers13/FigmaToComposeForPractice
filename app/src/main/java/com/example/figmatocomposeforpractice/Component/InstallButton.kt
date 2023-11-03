package com.example.figmatocomposeforpractice.Component

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.figmatocomposeforpractice.R

@Composable
fun InstallButton() {
    val contextForToast = LocalContext.current.applicationContext
    Button(onClick = {
        Toast.makeText(contextForToast, "Installation, please wait ;)!", Toast.LENGTH_SHORT).show()

    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4D144)), modifier = Modifier
        .height(64.dp)
        .fillMaxWidth()
        .padding(start = 24.dp, end = 24.dp, bottom = 6.dp),
        shape = RoundedCornerShape(20.dp)
    )
    {
        Text("Install",
            color = Color(0xFF050B18),
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist_bold))
        )
    }
}