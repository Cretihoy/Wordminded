package com.cretihoy.wordminded.game

import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.R.layout
import com.cretihoy.wordminded.card.CardModel

const val TAG = "Banana"

class GameScreenActivity : MvpActivity(), GameView {

    private val taskTop: TextView by lazy { findViewById(R.id.task_top) }
    private val taskBottom: TextView by lazy { findViewById(R.id.task_bottom) }
    private val letterTop: TextView by lazy { findViewById(R.id.letter_top) }
    private val letterBottom: TextView by lazy { findViewById(R.id.letter_bottom) }
    private val gameScreen: ConstraintLayout by lazy { findViewById(R.id.game_screen) }

    @InjectPresenter
    lateinit var presenter: GamePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_game_screen)

        gameScreen.setOnClickListener {
            presenter.onScreenClicked()
        }
    }

    override fun showCards(letter: CardModel, task: CardModel) {
        taskBottom.text = getString(task.content)
        taskTop.text = getString(task.content)
        letterTop.text = getString(letter.content)
        letterBottom.text = getString(letter.content)
    }
}