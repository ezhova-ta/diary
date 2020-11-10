package com.example.diary.model.responses.yandex.weather

import com.google.gson.annotations.SerializedName

data class YandexWeatherInfo(
    @SerializedName("lat")
    val latitude: Double,
    @SerializedName("lon")
    val longitude: Double,
    val url: String
)