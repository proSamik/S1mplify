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
        /** binding.Home.setOnClickListener{
        val intent_Home: Intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent_Home)
        }
         */
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

        //Info activity Mover
        binding.info.setOnClickListener{
            val intent_info: Intent = Intent(applicationContext, Information::class.java )
            startActivity(intent_info)
        }

        //Test Activity Mover
        binding.test.setOnClickListener{
            val intent_test: Intent = Intent(applicationContext, Test::class.java)
            startActivity(intent_test)
        }

        //Forum Activity Mover
        binding.forum.setOnClickListener{
            val intent_forum: Intent = Intent(applicationContext, Forum::class.java)
            startActivity(intent_forum)
        }
    }
}