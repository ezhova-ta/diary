package com.example.diary

import android.app.Application
import com.example.diary.di.AppModule
import com.example.diary.di.DiScopes
import toothpick.Toothpick

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        injectAppScope()
    }

    private fun injectAppScope() {
        Toothpick.openScope(DiScopes.APP_SCOPE).installModules(AppModule(applicationContext))
    }
}