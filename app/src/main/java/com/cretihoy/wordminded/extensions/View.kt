package com.cretihoy.wordminded.extensions

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.children

fun View.setFontSize(fontSize: Float) {
    when (this) {
        is Button -> textSize = fontSize
        is TextView -> {
            textSize = if (this.tag == "title") {
                fontSize + 16
            } else {
                fontSize
            }
        }
        is ViewGroup -> {
            for (child in children) {
                child.setFontSize(fontSize)
            }
        }
    }
}