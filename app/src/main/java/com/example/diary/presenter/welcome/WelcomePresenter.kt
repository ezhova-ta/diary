package com.example.diary.presenter.welcome

import android.util.Log
import com.example.diary.model.repository.MusicRepository
import com.example.diary.view.fragments.welcome.WelcomeView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class WelcomePresenter @Inject constructor(
    private val router: Router,
    private val musicRepository: MusicRepository
) : MvpPresenter<WelcomeView>() {
    private val compositeDisposable = CompositeDisposable()

    fun onResume() {
        viewState.showTitle()
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }

    fun onGetTemperatureButtonClick() {
        val disposable = musicRepository.searchAlbumsByName("love")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onError = {
                    Log.d("api_request", it.message ?: "Unknown error")
                },
                onSuccess = {
                    viewState.showTemperature(it.resultCount.toInt())
                    it.results.forEach {
                        Log.d("api_request", it.albumName)
                    }
                }
            )

        compositeDisposable.add(disposable)
    }
}