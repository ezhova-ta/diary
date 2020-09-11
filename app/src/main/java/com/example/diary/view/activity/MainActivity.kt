package com.example.diary.view.activity

import android.os.Bundle
import com.example.diary.R
import com.example.diary.di.DiScopes
import com.example.diary.presenter.MainActivityPresenter
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command
import toothpick.Toothpick
import toothpick.config.Module
import javax.inject.Inject

class MainActivity : MvpAppCompatActivity(), MainView {
    @InjectPresenter
    lateinit var presenter: MainActivityPresenter

    @Inject
    lateinit var cicerone: Cicerone<Router>

    private lateinit var mainRouter: Router
    private lateinit var mainNavigatorHolder: NavigatorHolder

    private val navigator = object : SupportAppNavigator(this, R.id.fragmentContainer) {
        override fun applyCommands(commands: Array<Command>) {
            super.applyCommands(commands)
            supportFragmentManager.executePendingTransactions()
        }
    }

    @ProvidePresenter
    fun providePresenter(): MainActivityPresenter =
        Toothpick.openScope(DiScopes.APP_SCOPE).getInstance(MainActivityPresenter::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        val appScope = Toothpick.openScope(DiScopes.APP_SCOPE)
        Toothpick.inject(this, appScope)
        bindScope()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun bindScope() {
        mainNavigatorHolder = cicerone.navigatorHolder
        mainRouter = cicerone.router

        Toothpick.openScope(DiScopes.APP_SCOPE).installModules(object : Module() {
            init {
                bind(Router::class.java).toInstance(mainRouter)
            }
        })
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        mainNavigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        mainNavigatorHolder.removeNavigator()
    }
}