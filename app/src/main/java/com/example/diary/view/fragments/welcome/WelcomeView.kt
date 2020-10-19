package com.example.diary.view.fragments.welcome

import moxy.MvpView
import moxy.viewstate.strategy.*

@StateStrategyType(AddToEndSingleStrategy::class)
interface WelcomeView : MvpView {
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showTitle()

    fun hideTitle()
    fun showTemperature(temperature: Int)
    fun showGettingTemperatureErrorMessage()
}