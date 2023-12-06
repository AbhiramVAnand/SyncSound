package com.abhiram.common.MusicApi

import androidx.compose.runtime.*
import com.hoc081098.kmp.viewmodel.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MusicViewModel : ViewModel(){
    suspend fun searchSong(text: String): String {
        val song = text.replace(" ","+")
        val result = ApiDao().SearchSong(song)
        return result.data.results[0].downloadUrl[0].link
    }

}