package com.example.diary.model.responses.yandex.weather

import com.google.gson.annotations.SerializedName

data class YandexWeatherParts(
    @SerializedName("part_name")
    val partName: String,
    @SerializedName("temp_min")
    val minTemperature: Int,
    @SerializedName("temp_max")
    val maxTemperature: Int,
    @SerializedName("temp_avg")
    val avgTemperature: Int,
    @SerializedName("feels_like")
    val temperatureFeelsLike: Int,
    @SerializedName("icon")
    val iconName: String,
    val condition: String,
    val daytime: String,
    val polar: Boolean,
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
    @SerializedName("prec_mm")
    val precipitationForecastMm: Int,
    @SerializedName("prec_period")
    val precipitationDurationForecastMin: Int,
    @SerializedName("prec_prob")
    val precipitationProbability: Int
)