package com.cretihoy.wordminded.presentation.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.databinding.ActivityStartScreenBinding
import com.cretihoy.wordminded.presentation.QuestionActivity
import com.cretihoy.wordminded.presentation.RulesActivity
import com.cretihoy.wordminded.presentation.base.BaseActivity
import com.cretihoy.wordminded.presentation.settings.SettingsActivity

class MainActivity : BaseActivity(), MainView {

    override val rootView: View by lazy { binding.root }
    private lateinit var binding: ActivityStartScreenBinding

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_start_screen)

        initListeners()
        initSettings()
    }

    private fun initSettings() {
        Storage.loadSettings(this)
    }

    private fun initListeners() {
        binding.buttonStartActivity.setOnClickListener {
            presenter.onButtonPlayClicked()
        }
        binding.buttonRulesActivity.setOnClickListener {
            presenter.onButtonRulesClicked()
        }
        binding.buttonSettingsActivity.setOnClickListener {
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