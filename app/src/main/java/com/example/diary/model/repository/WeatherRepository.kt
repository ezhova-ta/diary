package com.example.diary.model.repository

import com.example.diary.model.Lang
import com.example.diary.model.responses.yandex.weather.YandexWeatherResponse
import io.reactivex.Single

interface WeatherRepository {
    fun getWeather(latitude: Double, longitude: Double, lang: Lang): Single<YandexWeatherResponse>
}