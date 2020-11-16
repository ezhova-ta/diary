package com.example.diary.di

import android.content.Context
import com.example.diary.di.providers.OkHttpClientProvider
import com.example.diary.model.YandexWeatherRetrofitBuilder
import com.example.diary.model.repository.MusicRepository
import com.example.diary.model.repository.MusicRepositoryImpl
import com.example.diary.model.repository.WeatherRepository
import com.example.diary.model.repository.WeatherRepositoryImpl
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.converter.gson.GsonConverterFactory
import ru.terrakok.cicerone.Cicerone
import toothpick.config.Module

class AppModule(context: Context) : Module() {
    init {
        bind(Cicerone::class.java).toInstance(Cicerone.create())
        bind(WeatherRepository::class.java).to(WeatherRepositoryImpl::class.java).singleton()
        bind(MusicRepository::class.java).to(MusicRepositoryImpl::class.java).singleton()
        bind(OkHttpClient::class.java).toProvider(OkHttpClientProvider::class.java)
        bind(Converter.Factory::class.java).toInstance(GsonConverterFactory.create(GsonBuilder().create()))
        bind(CallAdapter.Factory::class.java).toInstance(RxJava2CallAdapterFactory.create())
        bind(YandexWeatherRetrofitBuilder::class.java).to(YandexWeatherRetrofitBuilder::class.java).singleton()
    }
}