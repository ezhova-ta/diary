package com.example.diary.navigation

import androidx.fragment.app.Fragment
import com.example.diary.view.fragments.welcome.WelcomeFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class Screens {
    class WelcomeScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return WelcomeFragment.getInstance()
        }
    }
}