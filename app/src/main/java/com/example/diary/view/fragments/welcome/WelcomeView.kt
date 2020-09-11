package com.example.diary.view.fragments.welcome

import moxy.MvpView

interface WelcomeView : MvpView {
    fun showTitle()
    fun hideTitle()
}