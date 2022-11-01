package com.cretihoy.wordminded.main

import android.content.Intent
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.game.GameScreenActivity
import com.cretihoy.wordminded.R.id
import com.cretihoy.wordminded.R.layout
import com.cretihoy.wordminded.RulesActivity

class MainActivity : MvpActivity(), MainView {

    private val cardPlay: CardView by lazy { findViewById(id.card_start_activity) }
    private val cardRules: CardView by lazy { findViewById(id.card_rules_activity) }

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_start_screen)

        cardPlay.setOnClickListener {
            presenter.onButtonPlayClicked()
        }
        cardRules.setOnClickListener{
            presenter.onButtonRulesClicked()
        }
    }

    override fun openGameScreen() {
        startActivity(Intent(this, GameScreenActivity::class.java))
    }

    override fun openRulesScreen() {
        startActivity(Intent(this, RulesActivity::class.java))
    }
}