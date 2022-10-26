package com.cretihoy.wordminded.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.cardview.widget.CardView
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.game.GameScreenActivity
import com.cretihoy.wordminded.R.id
import com.cretihoy.wordminded.R.layout

const val TAG = "Apple"

class MainActivity : MvpActivity(), MainView {

    private val cardPlay: CardView by lazy { findViewById(id.card_start_activity) }

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_start_screen)

        cardPlay.setOnClickListener {
            Log.d(TAG, "Button Clicked with")
            presenter.onButtonClicked()
        }
    }

    override fun openGameScreen() {
        startActivity(Intent(this, GameScreenActivity::class.java))
    }
}