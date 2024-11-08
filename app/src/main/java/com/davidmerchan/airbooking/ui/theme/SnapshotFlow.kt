package com.davidmerchan.airbooking.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier

@Composable
fun TestSnapshotFlow(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("Hola esto es un texto") }

    LaunchedEffect(Unit) {
        // Observa los cambios de text sin desencadenar o activar la recomposicion
        snapshotFlow { text }.collect {
            println("new text: $text")
        }
    }

    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { padding ->
        Column(
            modifier = Modifier.padding(padding).fillMaxSize()
        ) {
            Text("TestSnapshotFlow")
            HorizontalDivider()
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = { text = it}
            )
            HorizontalDivider()
            Text(text = text)
        }
    }
}