package com.example.diary.model

import android.util.Log
import com.example.diary.model.ApiConstants.YANDEX_WEATHER_BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

object YandexWeatherRetrofitBuilder {
    private val client: OkHttpClient
    private val retrofit: Retrofit

    init {
        client = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(
                HttpLoggingInterceptor { message ->
                    Log.d("OkHttp", message)
                }
            )
            .retryOnConnectionFailure(false)
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl(YANDEX_WEATHER_BASE_URL)
            .client(client)
            .build()
    }

    fun getRetrofit() =
        retrofit
}