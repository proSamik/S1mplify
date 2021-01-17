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

        //Home  Activity mover
        binding.Home.setOnClickListener{
        val intent_Home: Intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent_Home)
        }

        //Profile activity mover
        binding.profile.setOnClickListener{
            val intent_profile: Intent = Intent(applicationContext, Profile::class.java)
            startActivity(intent_profile)
        }

        //Learn Activity Mover
        binding.learn.setOnClickListener {
            val intent_learn: Intent = Intent(applicationContext, Learn::class.java)
            startActivity(intent_learn)
        }
    }

}