package com.example.diary.view.fragments.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.diary.R
import com.example.diary.di.DiScopes
import com.example.diary.presenter.welcome.WelcomePresenter
import kotlinx.android.synthetic.main.welcome_fragment.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import toothpick.Toothpick

class WelcomeFragment : MvpAppCompatFragment(), WelcomeView {
    @InjectPresenter
    lateinit var presenter: WelcomePresenter

    companion object {
        fun getInstance(): Fragment {
            return WelcomeFragment()
        }
    }

    @ProvidePresenter
    fun providePresenter(): WelcomePresenter =
        Toothpick.openScope(DiScopes.APP_SCOPE).getInstance(WelcomePresenter::class.java)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.welcome_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        get_temperature_button.setOnClickListener {
            presenter.onGetTemperatureButtonClick()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun showTitle() {
        welcome_title.visibility = View.VISIBLE
    }

    override fun hideTitle() {
        welcome_title.visibility = View.GONE
    }

    override fun showTemperature(temperature: Int) {
        val temperatureString = String.format("Air temperature: %d%s", temperature, "°C")
        welcome_title.text = temperatureString
    }

    override fun showGettingTemperatureErrorMessage() {
        welcome_title.text = resources.getString(R.string.getting_temperature_error_message)
    }
}