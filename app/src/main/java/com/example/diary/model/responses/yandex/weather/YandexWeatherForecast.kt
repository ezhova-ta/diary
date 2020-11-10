package com.example.diary.model.responses.yandex.weather

import com.google.gson.annotations.SerializedName

data class YandexWeatherForecast(
    val date: String,
    @SerializedName("date_ts")
    val dateTimeStamp: Long,
    @SerializedName("week")
    val weekNumber: Int,
    val sunrise: String,
    val sunset: String,
    @SerializedName("moon_code")
    val moonCode: Int,
    @SerializedName("moon_text")
    val moonText: String,
    val parts: List<YandexWeatherParts>
)