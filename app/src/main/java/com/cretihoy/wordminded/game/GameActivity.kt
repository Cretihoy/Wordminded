package com.cretihoy.wordminded.game

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.arellomobile.mvp.MvpActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.R.layout
import com.cretihoy.wordminded.card.CardModel

const val TAG = "Banana"

class GameScreenActivity : MvpActivity(), GameView {

    private val taskTop: TextView by lazy { findViewById(R.id.task_top) }
    private val letterTop: TextView by lazy { findViewById(R.id.letter_top) }
    private val taskBottom: TextView by lazy { findViewById(R.id.task_bottom) }
    private val letterBottom: TextView by lazy { findViewById(R.id.letter_bottom) }
    private val topLinear: LinearLayout by lazy { findViewById(R.id.top_linear) }
    private val bottomLinear: LinearLayout by lazy { findViewById(R.id.bottom_linear) }

    @InjectPresenter
    lateinit var presenter: GamePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_game_screen)

        topLinear.setOnClickListener {
            presenter.onScreenClicked()
        }
        bottomLinear.setOnClickListener {
            presenter.onScreenClicked()
        }
    }

    override fun showCards(letter: CardModel, task: CardModel) {
        taskBottom.text = getString(task.content)
        taskTop.text = getString(task.content)
        letterTop.text = getString(letter.content)
        letterBottom.text = getString(letter.content)
    }

    override fun setOrientation(isHorizontal: Boolean) {
        if (isHorizontal) {
            topLinear.orientation = LinearLayout.HORIZONTAL
            bottomLinear.orientation = LinearLayout.HORIZONTAL
        } else {
            topLinear.orientation = LinearLayout.VERTICAL
            bottomLinear.orientation = LinearLayout.VERTICAL
        }

    }
}