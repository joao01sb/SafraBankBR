package com.joao01sb.safrabankbr.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BottomIconsComp() {
    Row(Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween) {
        TextButton(onClick = { /*TODO*/ }, ) {
            Icon(imageVector = Icons.Default.Lock, contentDescription = "Support")
            Text(text = "Click")
        }
        TextButton(onClick = { /*TODO*/ }, ) {
            Icon(imageVector = Icons.Default.Call, contentDescription = "Support")
            Text(text = "Click")
        }
    }
}