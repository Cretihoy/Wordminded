package com.cretihoy.wordminded.presentation

import android.os.Bundle
import android.view.ViewGroup
import com.cretihoy.wordminded.R
import com.cretihoy.wordminded.presentation.base.BaseActivity

class RulesActivity : BaseActivity() {

    override val rootView: ViewGroup by lazy { findViewById(R.id.rules_root) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
    }
}