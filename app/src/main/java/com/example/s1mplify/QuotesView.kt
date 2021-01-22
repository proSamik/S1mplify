package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.s1mplify.databinding.ActivityQuotesViewBinding

class QuotesView : AppCompatActivity() {
    lateinit var binding: ActivityQuotesViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuotesViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Profile Activity mover
        binding.Home.setOnClickListener{
            val intent_Home: Intent = Intent(applicationContext,main::class.java)
            startActivity(intent_Home)
        }
    }
}