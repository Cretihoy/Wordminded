package com.cretihoy.wordminded.compose.presentation.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.cretihoy.wordminded.compose.presentation.theme.WordmindedTheme
import com.cretihoy.wordminded.data.Storage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var storage: Storage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WordmindedTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    storage.loadSettings(this)
                    RouterScreen()
                }
            }
        }
    }

    override fun onPause() {
        storage.saveSettings(this)
        super.onPause()
    }
}