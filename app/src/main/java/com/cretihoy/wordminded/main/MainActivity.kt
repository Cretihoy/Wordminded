package com.cretihoy.wordminded.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.GameScreenActivity
import com.cretihoy.wordminded.R.id
import com.cretihoy.wordminded.R.layout

const val TAG = "Apple"

class MainActivity : MvpActivity(), MainView {

    private val buttonPlay: Button by lazy { findViewById(id.button_play) }

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_start_screen)

        buttonPlay.setOnClickListener {
            Log.d(TAG, "Button Clicked with")
            presenter.onButtonClicked()
        }
    }

    override fun openGameScreen() {
        startActivity(Intent(this, GameScreenActivity::class.java))
    }
}