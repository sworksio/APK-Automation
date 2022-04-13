package com.demo.apkautomation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val sp = getSharedPreferences("APK_DEMO", Context.MODE_PRIVATE)
        findViewById<AppCompatTextView>(R.id.txtEmail).setText(sp.email)

        findViewById<AppCompatButton>(R.id.btnClear).setOnClickListener {
            sp.email = ""
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}