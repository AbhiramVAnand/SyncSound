package com.abhiram.common.MusicApi.SearchSongResult

data class Data(
    val results: List<Result>,
    val start: Int,
    val total: Int
)