package com.example.diary.model.responses.yandex.weather

import com.google.gson.annotations.SerializedName

data class YandexWeatherResponse(
    @SerializedName("now")
    val currentTime: Long,
    @SerializedName("now_dt")
    val nowDt: Long,
    val info: YandexWeatherInfo,
    val fact: YandexActualWeather,
    val forecast: YandexWeatherForecast
)