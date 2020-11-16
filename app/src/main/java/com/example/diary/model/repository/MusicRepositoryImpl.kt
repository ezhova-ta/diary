package com.example.diary.model.repository

import com.example.diary.model.ItunesRetrofitBuilder
import com.example.diary.model.api.itunes.ItunesAlbums
import com.example.diary.model.responses.itunes.ItunesAlbumsSearchResponse
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class MusicRepositoryImpl @Inject constructor(
    private val itunesRetrofitBuilder: ItunesRetrofitBuilder
) : MusicRepository {
    private val itunesRetrofit: Retrofit
        get() = itunesRetrofitBuilder.getRetrofit()

    override fun searchAlbumsByName(name: String): Single<ItunesAlbumsSearchResponse> {
        val request = itunesRetrofit.create(ItunesAlbums::class.java)
        return request.searchAlbums(searchString = name)
    }
}