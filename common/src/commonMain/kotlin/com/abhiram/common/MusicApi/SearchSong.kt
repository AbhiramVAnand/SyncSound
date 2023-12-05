package com.abhiram.common.MusicApi

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import okhttp3.internal.applyConnectionSpec

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchBox(){
    //TODO implement search box

    var text by remember{ mutableStateOf("") }
    var result by remember{ mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val coroutineScope = rememberCoroutineScope()

    Column {
        TextField(
            value = text,
            onValueChange = {text = it},
            label = { Text("Search") },
            modifier = Modifier
                .fillMaxWidth(1F)
                .padding(8.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(Color.LightGray),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {

                    keyboardController?.hide()
                    focusManager.clearFocus()
                }
            )
        )
        Button(onClick = {
            val song = text.replace(" ","+")
            coroutineScope.launch {
                result=ApiDao().SearchSong(song)
            }
        }) {
            Text(result)
        }
    }
}

@Preview
@Composable
fun prr(){
    SearchBox()
}