package com.example.diary.model

import io.reactivex.Single
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor() : WeatherRepository {
    override fun getCurrentAirTemperature(): Single<Int> {
        return Single.create { emitter ->
            emitter.onSuccess(26)
        }
    }

}