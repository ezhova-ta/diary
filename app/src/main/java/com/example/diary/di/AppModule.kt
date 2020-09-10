package com.example.diary.di

import android.content.Context
import ru.terrakok.cicerone.Cicerone
import toothpick.config.Module

class AppModule(context: Context) : Module() {
    init {
        bind(Cicerone::class.java).toInstance(Cicerone.create())
    }
}