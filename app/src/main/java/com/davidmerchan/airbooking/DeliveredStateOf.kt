package com.davidmerchan.airbooking

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun TestDeliveredStateOf(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Hola esto es un texto") }
    // Solo se calcula cuando el tamaño de text cambia, no siempre que ocurra la recomposicion
    val length by remember(text){
        derivedStateOf { text.length > 21 }
    }

    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { padding ->
        Column(modifier = Modifier.padding(padding).fillMaxSize()){
            Text("TestDeliveredStateOf")
            HorizontalDivider()
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = { text = it}
            )
            HorizontalDivider()
            Text(text = "$length : $text")
        }
    }
}