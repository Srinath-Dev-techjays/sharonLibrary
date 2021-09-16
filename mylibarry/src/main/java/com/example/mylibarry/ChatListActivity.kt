package com.example.mylibarry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ChatListActivity : AppCompatActivity() {

    lateinit var Text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)

        Text = findViewById(R.id.textView)

        try {
            var data = intent
            var name = data.getStringExtra("name").toString()
            Text.text = name
        } catch (e: Exception) {
            Log.d("ex", e.toString())
        }
    }
}