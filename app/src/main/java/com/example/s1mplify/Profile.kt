package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.s1mplify.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding

    lateinit var class_spinner: Spinner
    lateinit var career_spinner: Spinner
    lateinit var class_view: TextView
    lateinit var career_view: TextView
    lateinit var P_name: TextView
     lateinit var PersonalName: EditText

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


        //Spinner view of class and Class view initialisation
        class_spinner = binding.classSpinner
        class_view = binding.classView

        // Intialising class array
        val class_options= arrayListOf(9,10,11,12)

        //Creating adapter
        class_spinner.adapter= ArrayAdapter<Int>(this,android.R.layout.simple_list_item_1, class_options)
        class_spinner.setPrompt("Select Class")


        //Spinner item select listener for class selection
        class_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                class_view.text= "Class: " + class_options.get(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                class_view.text="Select Class from above"
            }

        }


        //Spinner view of career & career view initialisation
        career_spinner = binding.carrer
        career_view = binding.careerView


        //Initailisong career array
        val career_options= arrayListOf("Army/Airforce/Navy","Engineer","Doctor","Lawyer","IAS","IPS")


        //Creating adapter for Career
        career_spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, career_options)

        // Spinner item select listener for Career
        career_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                career_view.text= "Career: " + career_options.get(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                career_view.text="Select Career"
            }

        }



        P_name = binding.PnameDisplay
        PersonalName = binding.PName

        //SAVE Button
        binding.SAVE.setOnClickListener{

                val temp_name="Name: " + PersonalName.text
                P_name.text = temp_name!!
        }
    }
}