package com.example.diary.model

import com.example.diary.model.ApiConstants.YANDEX_WEATHER_API_BASE_URL
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class YandexWeatherRetrofitBuilder @Inject constructor(
    client: OkHttpClient,
    converterFactory: Converter.Factory,
    callAdapterFactory: CallAdapter.Factory
) {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(YANDEX_WEATHER_API_BASE_URL)
        .client(client)
        .addConverterFactory(converterFactory)
        .addCallAdapterFactory(callAdapterFactory)
        .build()

    fun getRetrofit() =
        retrofit
}