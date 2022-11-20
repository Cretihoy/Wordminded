package com.cretihoy.wordminded.data

import android.app.Activity
import android.content.Context
import androidx.compose.runtime.mutableStateOf
import javax.inject.Inject

private const val PREFERENCES_KEY = "Wordminded"
private const val IS_HORIZONTAL_KEY = "isHorizontal"
private const val FONT_SIZE_KEY = "fontSize"

class Storage
@Inject constructor() {

    var fontSize = mutableStateOf(18f)
    var isHorizontal = mutableStateOf(false)

    fun loadSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        isHorizontal.value = preferences.getBoolean(IS_HORIZONTAL_KEY, false)
        fontSize.value = preferences.getFloat(FONT_SIZE_KEY, 18f)
    }

    fun saveSettings(activity: Activity) {
        val preferences = activity.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
        preferences.edit().putBoolean(IS_HORIZONTAL_KEY, isHorizontal.value).apply()
        preferences.edit().putFloat(FONT_SIZE_KEY, fontSize.value).apply()
    }
}