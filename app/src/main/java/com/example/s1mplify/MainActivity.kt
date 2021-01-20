package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.s1mplify.databinding.ActivityMainBinding
import android.widget.Button
import androidx.viewpager.widget.ViewPager


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var viewPager: ViewPager? = null
    var images = intArrayOf(R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,
            R.drawable.photo5,R.drawable.photo6,R.drawable.photo7)
    var MyAdapter: ViewPagerAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
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

        //Donate Activity Mover
        binding.donate.setOnClickListener{
            val intent_donate: Intent =Intent(applicationContext,Donate::class.java )
            startActivity(intent_donate)
        }



        //ViewPager
        viewPager = binding.ViewPager1 as ViewPager

        MyAdapter= ViewPagerAdapter(this,images)

        viewPager!!.adapter= MyAdapter
    }
}