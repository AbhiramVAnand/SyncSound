package com.abhiram.common.MusicApi.SearchSongResult

data class Result(
    val album: Album,
    val copyright: String,
    val downloadUrl: List<DownloadUrl>,
    val duration: String,
    val explicitContent: Int,
    val featuredArtists: String,
    val featuredArtistsId: String,
    val hasLyrics: String,
    val id: String,
    val image: List<Image>,
    val label: String,
    val language: String,
    val name: String,
    val playCount: String,
    val primaryArtists: String,
    val primaryArtistsId: String,
    val releaseDate: Any,
    val type: String,
    val url: String,
    val year: String
)