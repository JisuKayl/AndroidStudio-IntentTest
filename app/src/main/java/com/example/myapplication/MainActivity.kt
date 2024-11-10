package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameField = findViewById<EditText>(R.id.name_et)
        val sumbitBtn = findViewById<Button>(R.id.submit_btn)
        val implicitBtn = findViewById<Button>(R.id.implicit_btn)

        sumbitBtn.setOnClickListener {
            val text: String = nameField.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", text)
            startActivity(intent)
        }

        implicitBtn.setOnClickListener {
            val text: String = nameField.text.toString()

            val intent = Intent()
            intent.action =Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, text)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to: "))
            
        }
    }
}