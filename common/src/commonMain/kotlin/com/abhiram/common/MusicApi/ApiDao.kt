package com.abhiram.common.MusicApi

import com.abhiram.common.MusicApi.SearchSongResult.SearchResult
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.gson.*

class ApiDao {
    val URL = "https://sync-sound-api.vercel.app/"
    suspend fun SearchSong(song : String): SearchResult {
        val client = HttpClient(CIO){
            install(ContentNegotiation){
                gson()
            }
        }
        val response : SearchResult = client.get("$URL/search/songs?query=$song").body()
        return response
    }
}