package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s1mplify.databinding.ActivityDonateBinding

class Donate : AppCompatActivity() {
    lateinit var binding: ActivityDonateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Home mover
        binding.profile.setOnClickListener{
        val intent_Home: Intent = Intent(applicationContext,main::class.java)
        startActivity(intent_Home)
        }
        //Learn Activity Mover
        binding.learn.setOnClickListener {
            val intent_learn: Intent = Intent(applicationContext, Learn::class.java)
            startActivity(intent_learn)
        }
        //Info activity Mover
        binding.info.setOnClickListener{
            val intent_info: Intent = Intent(applicationContext, Information::class.java )
            startActivity(intent_info)
        }
    }
}