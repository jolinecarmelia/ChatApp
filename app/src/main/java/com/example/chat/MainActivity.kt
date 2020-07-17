package com.example.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = email_edittext_register.text.toString()
        val password = password_edittext_register.text.toString()

        Log.d(tag: "MainActivity", msg: "Email is: " + email)
        Log.d(tag: "MainActivity", msg: "Password is: $password")
    }
}