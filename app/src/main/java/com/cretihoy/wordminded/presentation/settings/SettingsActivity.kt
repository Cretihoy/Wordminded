package com.cretihoy.wordminded.presentation.settings

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.extensions.setFontSize
import com.cretihoy.wordminded.presentation.base.BaseActivity

class SettingsActivity : BaseActivity(), SettingsView {

    override val rootView: ViewGroup by lazy { findViewById(R.id.settings_root) }
    private val switchButtonHorizontal: SwitchCompat by lazy { findViewById(R.id.switch_button_horizontal) }
    val buttonMinus: Button by lazy { findViewById(R.id.button_minus_settings) }
    private val buttonPlus: Button by lazy { findViewById(R.id.button_plus_settings) }
    val fontTextView: TextView by lazy { findViewById(R.id.font_size_settings) }

    @InjectPresenter
    lateinit var presenter: SettingPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initListeners()
    }

    override fun onStop() {
        presenter.saveSettings(this)
        super.onStop()
    }

    private fun initListeners() {
        switchButtonHorizontal.setOnCheckedChangeListener { _, isChecked ->
            presenter.onSwitchChecked(isChecked)
        }
        buttonMinus.setOnClickListener {
            presenter.onMinusButtonClicked()
        }
        buttonPlus.setOnClickListener {
            presenter.onPlusButtonClicked()
        }
    }

    override fun showFontSize(fontSize: Float) {
        fontTextView.text = fontSize.toInt().toString()
    }

    override fun setChecked(horizontal: Boolean) {
        switchButtonHorizontal.isChecked = horizontal
    }

    override fun setFontSize(fontSize: Float) {
        rootView.setFontSize(Storage.fontSize)
    }
}