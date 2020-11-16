package com.example.diary.di.providers

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Provider

class OkHttpClientProvider @Inject constructor(): Provider<OkHttpClient> {
    override fun get(): OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .writeTimeout(15, TimeUnit.SECONDS)
        .addInterceptor(
            HttpLoggingInterceptor(object: HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Log.d("OkHttp", message)
                }
            })
        )
        .build()
}