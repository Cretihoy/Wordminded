package com.cretihoy.wordminded.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.arellomobile.mvp.MvpActivity
import com.cretihoy.wordminded.data.Storage
import com.cretihoy.wordminded.extensions.setFontSize

abstract class BaseActivity : MvpActivity(), BaseView {

    abstract val rootView: View

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        super.onResume()
//        rootView.setFontSize(Storage.fontSize)
    }
}