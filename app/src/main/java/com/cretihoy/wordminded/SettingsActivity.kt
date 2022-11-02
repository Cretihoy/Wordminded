package com.cretihoy.wordminded

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    val buttonSettings: Button by lazy { findViewById(R.id.button_settings) }
    val editTextSettings: EditText by lazy { findViewById(R.id.edit_text_settings) }
    val textSettings: TextView by lazy { findViewById(R.id.text_settings) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        loadData()

        buttonSettings.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val insertedText = editTextSettings.text.toString()
        textSettings.text = insertedText

        val sharedPreferences = getSharedPreferences("sharedPreferences", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.apply {
            putString("STRING_KEY", insertedText)
        }.apply()

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()
    }

    private fun loadData() {
        val sharedPreferences = getSharedPreferences("sharedPreferences", MODE_PRIVATE)
        val savedString = sharedPreferences.getString("STRING_KEY", null)

        textSettings.text = savedString
    }
}