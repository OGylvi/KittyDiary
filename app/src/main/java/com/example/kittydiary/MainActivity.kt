package com.example.kittydiary

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listView)
        val userData: EditText = findViewById(R.id.user_data)
        val pressButton:ImageButton = findViewById(R.id.imageButton)
        val todos: MutableList<String> = mutableListOf()
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, todos)
        listView.adapter = adapter

        pressButton.setOnClickListener {
            val text=userData.text.toString().trim()
            if (text!="")
                adapter.insert(text,0)
        }
    }
}