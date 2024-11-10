package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")

        val txtViewUser = findViewById<TextView>(R.id.textView)
        txtViewUser.text = msg
    }
}