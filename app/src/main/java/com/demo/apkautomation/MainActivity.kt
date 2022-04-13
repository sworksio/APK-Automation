package com.demo.apkautomation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("APK_DEMO", Context.MODE_PRIVATE)
        if (sp.email.isNotEmpty()) {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }

        findViewById<AppCompatButton>(R.id.btnDone).setOnClickListener {
            val email = findViewById<AppCompatEditText>(R.id.etEmail).text.toString()
            if (email.isNotEmpty()) {
                sp.email = email
                startActivity(Intent(this, MainActivity2::class.java))
                finish()
            } else {
                Toast.makeText(this, "Enter Email", Toast.LENGTH_LONG).show()
            }
        }
    }
}