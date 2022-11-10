package com.cretihoy.wordminded.data

import android.app.Activity
import android.content.Context

private const val PREFERENCES_KEY = "Wordminded"
private const val IS_HORIZONTAL_KEY = "isHorizontal"
private const val FONT_SIZE_KEY = "fontSize"

object Storage {
    var fontSize: Float = 18f
    var isHorizontal: Boolean = false

    fun loadSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        isHorizontal = preferences.getBoolean(IS_HORIZONTAL_KEY, false)
        fontSize = preferences.getFloat(FONT_SIZE_KEY, 18f)
    }

    fun saveSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        preferences.edit().putBoolean(IS_HORIZONTAL_KEY, isHorizontal).apply()
        preferences.edit().putFloat(FONT_SIZE_KEY, fontSize).apply()
    }
}