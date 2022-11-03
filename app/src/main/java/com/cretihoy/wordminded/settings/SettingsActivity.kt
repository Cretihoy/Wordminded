package com.cretihoy.wordminded.settings

import android.os.Bundle
import androidx.appcompat.widget.SwitchCompat
import com.arellomobile.mvp.MvpActivity
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.storage.Storage

class SettingsActivity : MvpActivity(), SettingsView {

    val switchButtonHorizontal: SwitchCompat by lazy { findViewById(R.id.switch_button_horizontal) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initViews()
    }

    private fun initViews() {
        switchButtonHorizontal.isChecked = Storage.isHorizontal
        switchButtonHorizontal.setOnCheckedChangeListener { _, isHorizontal ->
            Storage.isHorizontal = isHorizontal
        }
    }
}