package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener{
            var i = Intent (applicationContext, LoginActivity::class.java)
            startActivity(i)
        }
    }
}