package com.example.primogemcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primogems = findViewById<TextView>(R.id.number)
        val convert = findViewById<Button>(R.id.convert_button)
        val quotient = findViewById<TextView>(R.id.wishes)

        convert.setOnClickListener{
            val wishes = primogems.text.toString().toDouble() / 160.0
            quotient.text = String.format("%.2f",wishes)


        }
    }
}