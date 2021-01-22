package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s1mplify.databinding.ActivityInformationBinding

class Information : AppCompatActivity() {
    lateinit var binding: ActivityInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Profile mover
        binding.profile.setOnClickListener{
        val intent_Home: Intent = Intent(applicationContext,main::class.java)
        startActivity(intent_Home)
        }

        //Learn Activity Mover
        binding.learn.setOnClickListener {
            val intent_learn: Intent = Intent(applicationContext, Learn::class.java)
            startActivity(intent_learn)
        }
        //Donate Activity Mover
        binding.donate.setOnClickListener{
            val intent_donate: Intent =Intent(applicationContext,Donate::class.java )
            startActivity(intent_donate)
        }
    }

}