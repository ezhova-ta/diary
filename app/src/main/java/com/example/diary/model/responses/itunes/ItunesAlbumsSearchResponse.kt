package com.example.diary.model.responses.itunes

data class ItunesAlbumsSearchResponse(
    val resultCount: Long,
    val results: List<ItunesAlbum>
)