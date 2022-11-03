package com.cretihoy.wordminded.storage

import android.app.Activity
import android.content.Context

private const val PREFERENCES_KEY = "Wordminded"
private const val IS_HORIZONTAL_KEY = "isHorizontal"

object Storage {
    var isHorizontal: Boolean = false

    fun loadSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        isHorizontal = preferences.getBoolean(IS_HORIZONTAL_KEY, false)
    }

    fun saveSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        preferences.edit().putBoolean(IS_HORIZONTAL_KEY, isHorizontal).apply()
    }
}