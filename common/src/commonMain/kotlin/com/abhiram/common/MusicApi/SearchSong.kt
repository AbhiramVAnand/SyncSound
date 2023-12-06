package com.abhiram.common.MusicApi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchBox(){
    //TODO implement search box

    var text by remember{ mutableStateOf("") }
    var result by remember{ mutableStateOf("Submit") }
    val viewModel = MusicViewModel()
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val coroutineScope = rememberCoroutineScope()

    Column {
        TextField(
            value = text,
            onValueChange = {text = it},
            placeholder = {
                Text(
                    text = "Search",
                    fontSize = 20.sp
                ) },
            modifier = Modifier
                .fillMaxWidth(1F)
                .padding(8.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(Color.LightGray),
            textStyle = TextStyle.Default.copy(fontSize = 20.sp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    keyboardController?.hide()
                    focusManager.clearFocus()
                }
            )
        )
        Button(onClick = {
            if(!text.isBlank()){
                coroutineScope.launch { result = viewModel.searchSong(text) }
            }
        }) {
            Text(result)
        }
    }
}

