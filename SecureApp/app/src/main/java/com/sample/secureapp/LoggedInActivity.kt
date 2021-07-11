package com.sample.secureapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoggedInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggedin)
        findViewById<TextView>(R.id.userdisp).apply {
            text = intent.getStringExtra("username")
        }
        findViewById<TextView>(R.id.passdisp).apply {
            text = intent.getStringExtra("password")
        }
    }
}