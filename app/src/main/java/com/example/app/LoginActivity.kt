package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnsignup = findViewById<Button>(R.id.btnsignup)
        btnsignup.setOnClickListener{
            var i = Intent (applicationContext, LoginActivity::class.java)
            startActivity(i)
        }
    }
}