package com.friska.kodeprogram

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.friska.kodeprogram.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberInput: EditText = findViewById(R.id.numberInput)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultText: TextView = findViewById(R.id.resultText)

        checkButton.setOnClickListener {
            val inputText = numberInput.text.toString()
            if (inputText.isNotEmpty()) {
                val number = inputText.toInt()
                val result = if (number % 2 == 0) {
                    "$number adalah bilangan genap"
                } else {
                    "$number adalah bilangan ganjil"
                }
                resultText.text = result
            } else {
                resultText.text = "Masukkan bilangan yang valid"
            }
        }
    }
}
