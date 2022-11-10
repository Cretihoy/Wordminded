package com.cretihoy.wordminded.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.databinding.ActivityQuestionBinding
import com.cretihoy.wordminded.presentation.base.BaseActivity
import com.cretihoy.wordminded.presentation.game.GameScreenActivity

class QuestionActivity : BaseActivity() {

    override val rootView: View by lazy { binding.root }
    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_question)

        binding.questionYesButton.setOnClickListener {
            startActivity(Intent(this, GameScreenActivity::class.java))
            finish()
        }
        binding.questionNoButton.setOnClickListener {
            finish()
        }
    }
}