package com.cretihoy.wordminded.presentation.game

import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.data.CardModel
import com.cretihoy.wordminded.databinding.ActivityGameScreenBinding
import com.cretihoy.wordminded.presentation.base.BaseActivity

class GameScreenActivity : BaseActivity(), GameView {

    override val rootView: ViewGroup by lazy { findViewById(R.id.game_root) }
    private lateinit var binding: ActivityGameScreenBinding

    @InjectPresenter
    lateinit var presenter: GamePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_game_screen)

        binding.topLinear.setOnClickListener {
            presenter.onScreenClicked()
        }
        binding.bottomLinear.setOnClickListener {
            presenter.onScreenClicked()
        }
    }

    override fun showCards(letter: CardModel, task: CardModel) {
        binding.taskBottom.text = getString(task.content)
        binding.taskTop.text = getString(task.content)
        binding.letterBottom.text = getString(letter.content)
        binding.letterTop.text = getString(letter.content)
    }

    override fun setOrientation(isHorizontal: Boolean) {
        if (isHorizontal) {
            binding.topLinear.orientation = LinearLayout.HORIZONTAL
            binding.bottomLinear.orientation = LinearLayout.HORIZONTAL
        } else {
            binding.topLinear.orientation = LinearLayout.VERTICAL
            binding.bottomLinear.orientation = LinearLayout.VERTICAL
        }
    }
}