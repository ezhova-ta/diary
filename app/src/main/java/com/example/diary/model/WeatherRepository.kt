package com.example.diary.model

import io.reactivex.Single

interface WeatherRepository {
    fun getCurrentAirTemperature(): Single<Int>
}