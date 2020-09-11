package com.example.diary.presenter.welcome

import com.example.diary.view.fragments.welcome.WelcomeView
import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class WelcomePresenter @Inject constructor(private val router: Router) : MvpPresenter<WelcomeView>() {
    fun onResume() {
        viewState.showTitle()
    }
}