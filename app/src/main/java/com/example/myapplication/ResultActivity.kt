package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val parameter = intent.getIntExtra(EXTRA_PARAMETER, 0)

        // Apply formula
        val result = parameter*2

        //Display result
        val textView = findViewById<TextView>(R.id.result_text).apply {
//          Set color according the value
            if (result > 5) {
                setTextColor(android.graphics.Color.GREEN)
            } else {
                setTextColor(android.graphics.Color.RED)
            }

            text = result.toString()
        }
    }
}