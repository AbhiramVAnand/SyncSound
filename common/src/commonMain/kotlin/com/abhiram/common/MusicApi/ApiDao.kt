package com.abhiram.common.MusicApi

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class ApiDao {
    val URL = "https://sync-sound-api.vercel.app/"
    suspend fun SearchSong(song : String) : String{
        val client = HttpClient(CIO)
        val response = client.get("$URL/search/songs?query=$song")
        return response.bodyAsText()
    }
}