package com.example.kittydiary

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val pressButton:ImageButton=findViewById(R.id.imageButton)
        val messageTextView=findViewById<TextView>(R.id.textView)
        pressButton.setOnClickListener {
            messageTextView.text = "Хоспаде, куда я жмав?!"

        }
    }
}