package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s1mplify.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Home Activity mover
        binding.Home.setOnClickListener{
            val intent_Home: Intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent_Home)
        }

        //Learn Activity Mover
        binding.learn.setOnClickListener {
            val intent_learn: Intent = Intent(applicationContext, Learn::class.java)
            startActivity(intent_learn)
        }

        //Learn Activity Mover with top Mover
        binding.toplearn.setOnClickListener{
            val intent_toplearn: Intent = Intent(applicationContext,Learn::class.java)
            startActivity(intent_toplearn)
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

        //Donate Activity Mover
        binding.donate.setOnClickListener{
            val intent_donate: Intent =Intent(applicationContext,Donate::class.java )
            startActivity(intent_donate)
        }
    }
}