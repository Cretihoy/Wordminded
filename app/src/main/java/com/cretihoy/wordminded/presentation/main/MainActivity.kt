package com.cretihoy.wordminded.presentation.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.R.layout
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.presentation.QuestionActivity
import com.cretihoy.wordminded.presentation.RulesActivity
import com.cretihoy.wordminded.presentation.base.BaseActivity
import com.cretihoy.wordminded.presentation.settings.SettingsActivity

class MainActivity : BaseActivity(), MainView {

    override val rootView: LinearLayout by lazy { findViewById(R.id.start_screen) }
    private val buttonPlay: Button by lazy { findViewById(R.id.button_start_activity) }
    private val buttonRules: Button by lazy { findViewById(R.id.button_rules_activity) }
    private val buttonSettings: Button by lazy { findViewById(R.id.button_settings_activity) }

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_start_screen)

        initListeners()
        initSettings()
    }

    private fun initSettings() {
        Storage.loadSettings(this)
    }

    private fun initListeners() {
        buttonPlay.setOnClickListener {
            presenter.onButtonPlayClicked()
        }
        buttonRules.setOnClickListener {
            presenter.onButtonRulesClicked()
        }
        buttonSettings.setOnClickListener {
            presenter.onButtonSettingsClicked()
        }
    }

    override fun openGameScreen() {
        startActivity(Intent(this, QuestionActivity::class.java))
    }

    override fun openRulesScreen() {
        startActivity(Intent(this, RulesActivity::class.java))
    }

    override fun openSettingsScreen() {
        startActivity(Intent(this, SettingsActivity::class.java))
    }
}