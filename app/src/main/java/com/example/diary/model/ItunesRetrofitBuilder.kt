package com.example.diary.model

import com.example.diary.model.ApiConstants.ITUNES_API_BASE_URL
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Inject

class ItunesRetrofitBuilder @Inject constructor(
    client: OkHttpClient,
    converterFactory: Converter.Factory,
    callAdapterFactory: CallAdapter.Factory
) {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(ITUNES_API_BASE_URL)
        .client(client)
        .addConverterFactory(converterFactory)
        .addCallAdapterFactory(callAdapterFactory)
        .build()

    fun getRetrofit() =
        retrofit
}