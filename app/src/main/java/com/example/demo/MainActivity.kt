package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = findViewById<Button>(R.id.hello)
        x.setOnClickListener {
            Toast.makeText(this@MainActivity,"hello bhai",Toast.LENGTH_LONG).show()
        }
    }
}