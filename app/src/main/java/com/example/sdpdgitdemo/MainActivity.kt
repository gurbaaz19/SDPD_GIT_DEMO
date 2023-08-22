package com.example.sdpdgitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var cButton: Button
    private lateinit var cTextView: TextView
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cButton = findViewById(R.id.buttonCounter)
        cTextView=findViewById(R.id.textViewCounter)

        cButton.setOnClickListener {
            count++
            cTextView.text = count.toString()
        }

    }
}