package com.joao01sb.safrabankbr.presentation.components

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtomLoginComp(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
    ) {
        Text(text = text)
    }
}


@Preview(showBackground = true)
@Composable
private fun ButtomLoginCompPreview() {
    ButtomLoginComp(text = "Já sou cliente")
}