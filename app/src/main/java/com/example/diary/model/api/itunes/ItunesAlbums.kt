package com.example.diary.model.api.itunes

import com.example.diary.model.responses.itunes.ItunesAlbumsSearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ItunesAlbums {
    @GET( "search")
    fun searchAlbums(
        //  (encoded = true, иначе при совершении запроса знак + заменяется на %2B)
        @Query("term", encoded = true) searchString: String,
        @Query("media") mediaType: String = "music",
        @Query("entity") entity: String = "album",
        @Query("attribute") attribute: String = "albumTerm"
    ): Single<ItunesAlbumsSearchResponse>
}