package com.sample.secureapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var userName: EditText? = null
    private var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName = findViewById(R.id.username)
        password = findViewById(R.id.password)
    }

    fun login(v: View?) {
        val name: String = userName?.text.toString()
        val pass: String = password?.text.toString()
        if (name == "admin" && pass == "admin123") {
            val intent = Intent(this@MainActivity, LoggedInActivity::class.java)
                .apply {
                    putExtra("username", name)
                    putExtra("password", pass)
                }
            startActivity(intent)
        }
    }
}