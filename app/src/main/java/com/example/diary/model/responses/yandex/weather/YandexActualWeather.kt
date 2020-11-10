package com.example.diary.model.responses.yandex.weather

import com.google.gson.annotations.SerializedName

data class YandexActualWeather(
    @SerializedName("temp")
    val temperature: Int,
    @SerializedName("feels_like")
    val temperatureFeelsLike: Int,
    @SerializedName("temp_water")
    val waterTemperature: Int,
    @SerializedName("icon")
    val iconName: String,
    val condition: String,
    @SerializedName("wind_speed")
    val windSpeed: Int,
    @SerializedName("wind_gust")
    val windGustSpeed: Int,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("pressure_mm")
    val pressureMm: Int,
    @SerializedName("pressure_pa")
    val pressurePa: Int,
    @SerializedName("humidity")
    val humidityInPercentage: Int,
    val daytime: String,
    val polar: Boolean,
    val season: String,
    @SerializedName("obs_time")
    val obsTime: Long
)