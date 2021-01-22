package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s1mplify.databinding.ActivityLearnBinding

class Learn : AppCompatActivity() {
    lateinit var binding:ActivityLearnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLearnBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Home activity mover
        binding.Home.setOnClickListener{
            val intent_Home: Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent_Home)
        }

        //Profile Activity mover
        binding.profile.setOnClickListener{
            val intent_profile: Intent = Intent(applicationContext, Profile::class.java)
            startActivity(intent_profile)
        }
        //Info activity Mover
        binding.info.setOnClickListener{
            val intent_info: Intent = Intent(applicationContext, Information::class.java )
            startActivity(intent_info)
        }

        //Donate Activity Mover
        binding.donate.setOnClickListener{
            val intent_donate: Intent =Intent(applicationContext,Donate::class.java )
            startActivity(intent_donate)
        }
    }
}