package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler= Handler()
        handler.postDelayed({

            val intent = Intent(this, QuotesView::class.java)
            startActivity(intent)
            finish()
        }, 2000)  //delay 2 seconds
    }
}