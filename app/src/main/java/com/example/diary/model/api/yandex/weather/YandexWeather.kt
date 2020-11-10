package com.example.diary.model.api.yandex.weather

import com.example.diary.model.ApiConstants.YANDEX_API_KEY
import com.example.diary.model.Lang
import com.example.diary.model.responses.yandex.weather.YandexWeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface YandexWeather {
    @GET( "informers")
    fun getWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("lang") lang: String = Lang.RU.value,
        @Header("X-Yandex-API-Key") yandexApiKey: String = YANDEX_API_KEY
    ): Single<YandexWeatherResponse>
}