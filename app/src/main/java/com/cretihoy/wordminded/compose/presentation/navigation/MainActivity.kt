package com.cretihoy.wordminded.compose.presentation.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.cretihoy.wordminded.compose.presentation.theme.WordmindedTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WordmindedTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    RouterScreen()
                }
            }
        }
    }
}