package com.cretihoy.wordminded.presentation

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.databinding.ActivityRulesBinding
import com.cretihoy.wordminded.presentation.base.BaseActivity

class RulesActivity : BaseActivity() {

    override val rootView: View by lazy { binding.root }
    private lateinit var binding: ActivityRulesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_rules)
    }
}