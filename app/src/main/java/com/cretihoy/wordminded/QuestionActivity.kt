package com.cretihoy.wordminded

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cretihoy.wordminded.game.GameScreenActivity

class QuestionActivity : AppCompatActivity() {

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