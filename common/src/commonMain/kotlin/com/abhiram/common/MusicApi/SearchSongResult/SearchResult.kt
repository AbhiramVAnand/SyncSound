package com.abhiram.common.MusicApi.SearchSongResult

import kotlinx.serialization.Serializable

@Serializable
data class SearchResult(
    val data: Data,
    val message: Any,
    val status: String
)