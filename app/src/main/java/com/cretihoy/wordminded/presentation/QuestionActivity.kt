package com.cretihoy.wordminded.presentation

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.presentation.base.BaseActivity
import com.cretihoy.wordminded.presentation.game.GameScreenActivity

class QuestionActivity : BaseActivity() {

    override val rootView: ViewGroup by lazy { findViewById(R.id.root_view) }
    private val yesButton: Button by lazy { findViewById(R.id.question_yes_button) }
    private val noButton: Button by lazy { findViewById(R.id.question_no_button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        yesButton.setOnClickListener {
            startActivity(Intent(this, GameScreenActivity::class.java))
            finish()
        }
        noButton.setOnClickListener {
            finish()
        }
    }
}