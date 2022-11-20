package com.cretihoy.wordminded.presentation.settings

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.arellomobile.mvp.presenter.InjectPresenter
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.databinding.ActivitySettingsBinding
import com.cretihoy.wordminded.extensions.setFontSize
import com.cretihoy.wordminded.presentation.base.BaseActivity

class SettingsActivity : BaseActivity(), SettingsView {

    override val rootView: View by lazy { binding.root }
    private lateinit var binding: ActivitySettingsBinding

    @InjectPresenter
    lateinit var presenter: SettingPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_settings)

        initListeners()
    }

    override fun onStop() {
        presenter.saveSettings(this)
        super.onStop()
    }

    private fun initListeners() {
        binding.switchButtonHorizontal.setOnCheckedChangeListener { _, isChecked ->
            presenter.onSwitchChecked(isChecked)
        }
        binding.buttonMinusSettings.setOnClickListener {
            presenter.onMinusButtonClicked()
        }
        binding.buttonPlusSettings.setOnClickListener {
            presenter.onPlusButtonClicked()
        }
    }

    override fun showFontSize(fontSize: Float) {
        binding.fontSizeSettings.text = fontSize.toInt().toString()
    }

    override fun setChecked(horizontal: Boolean) {
        binding.switchButtonHorizontal.isChecked = horizontal
    }

    override fun setFontSize(fontSize: Float) {
//        binding.root.setFontSize(Storage.fontSize)
    }
}