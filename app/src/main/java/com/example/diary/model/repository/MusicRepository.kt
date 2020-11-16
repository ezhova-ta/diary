package com.example.diary.model.repository

import com.example.diary.model.responses.itunes.ItunesAlbumsSearchResponse
import io.reactivex.Single

interface MusicRepository {
    fun searchAlbumsByName(name: String): Single<ItunesAlbumsSearchResponse>
}