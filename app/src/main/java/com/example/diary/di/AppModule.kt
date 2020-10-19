package com.example.diary.di

import android.content.Context
import com.example.diary.model.WeatherRepository
import com.example.diary.model.WeatherRepositoryImpl
import ru.terrakok.cicerone.Cicerone
import toothpick.config.Module

class AppModule(context: Context) : Module() {
    init {
        bind(Cicerone::class.java).toInstance(Cicerone.create())
        bind(WeatherRepository::class.java).to(WeatherRepositoryImpl::class.java).singleton()
    }
}