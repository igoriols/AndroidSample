package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

const val EXTRA_PARAMETER = "com.example.myfirstapp.PARAMETER"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user touches the button */
    fun calculate(view: View) {
        val editText = findViewById<TextInputEditText>(R.id.edit_input)
        var parameter: Int
        parameter = try {
            editText.text.toString().toInt()
        } catch (e: NumberFormatException) {
            0
        }
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra(EXTRA_PARAMETER, parameter)
        }
        startActivity(intent)

    }

}