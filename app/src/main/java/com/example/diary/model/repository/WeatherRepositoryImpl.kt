package com.example.diary.model.repository

import com.example.diary.model.Lang
import com.example.diary.model.YandexWeatherRetrofitBuilder
import com.example.diary.model.api.yandex.weather.YandexWeather
import com.example.diary.model.responses.yandex.weather.YandexWeatherResponse
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val yandexWeatherRetrofitBuilder: YandexWeatherRetrofitBuilder
) : WeatherRepository {
    private val yandexWeatherRetrofit: Retrofit
        get() = yandexWeatherRetrofitBuilder.getRetrofit()

    override fun getWeather(latitude: Double, longitude: Double, lang: Lang): Single<YandexWeatherResponse> {
        val request = yandexWeatherRetrofit.create(YandexWeather::class.java)
        return request.getWeather(latitude, longitude, Lang.RU.value)
    }
}