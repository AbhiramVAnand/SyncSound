package com.abhiram.common

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.*
import com.abhiram.common.AppWrite.Appwrite
import kotlinx.coroutines.launch

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()
    val coroutineScope = rememberCoroutineScope()
    val appwrite = Appwrite()

    Button(onClick = {
        text = "Hello, ${platformName}"
        coroutineScope.launch { appwrite.upload("$platformName@mail.com") }
    }) {
        Text(text)
    }
}

