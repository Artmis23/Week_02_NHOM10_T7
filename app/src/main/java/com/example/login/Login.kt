package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.login.R

class Login : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, Verification_Code::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }
}