package com.mg.pruebadodo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redmiNote = findViewById<Button>(R.id.redmiNote)

        redmiNote.setOnClickListener {
            val intent = Intent(this, producto::class.java)
            startActivity(intent)
        }
    }
}