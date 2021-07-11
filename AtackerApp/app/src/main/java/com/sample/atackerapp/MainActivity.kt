package com.sample.atackerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        moveTaskToBack(true)
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
    }
}