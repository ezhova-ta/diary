package com.example.diary.presenter.welcome

import com.example.diary.model.WeatherRepository
import com.example.diary.view.fragments.welcome.WelcomeView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class WelcomePresenter @Inject constructor(
    private val router: Router,
    private val weatherRepository: WeatherRepository
) : MvpPresenter<WelcomeView>() {
    fun onResume() {
        viewState.showTitle()
    }

    fun onGetTemperatureButtonClick() {
        weatherRepository.getCurrentAirTemperature()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onError = {
                    viewState.showGettingTemperatureErrorMessage()
                },
                onSuccess = { temperature ->
                    viewState.showTemperature(temperature)
                }
            )
    }
}