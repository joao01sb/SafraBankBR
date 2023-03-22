package com.joao01sb.safrabankbr.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joao01sb.safrabankbr.presentation.components.BottomIconsComp
import com.joao01sb.safrabankbr.presentation.components.ButtomLoginComp

@Preview(showSystemUi = true)
@Composable
fun InitialUi() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.padding(top = 60.dp))
        Image(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Icon safra",
            Modifier.size(40.dp)
        )
        Text(text = "Bem vindo", fontSize = 20.sp)
        Text(text = "ao SAFRA", fontSize = 50.sp)
        Spacer(modifier = Modifier.padding(top = 30.dp))
        Text(text = "Navegue com quem atravessou as", fontSize = 18.sp)
        Text(text = "Mais diversas Tempestades!", fontSize = 18.sp)
        Spacer(modifier = Modifier.padding(top = 100.dp))
        ButtomLoginComp(
            text = "Já sou cliente",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(48.dp)
        )
        Spacer(modifier = Modifier.padding(top = 16.dp))
        ButtomLoginComp(
            text = "Abra sua conta", modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.padding(80.dp))
        BottomIconsComp()
    }

}