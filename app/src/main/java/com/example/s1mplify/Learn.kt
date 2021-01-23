package com.example.s1mplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.s1mplify.databinding.ActivityLearnBinding
import com.google.android.material.navigation.NavigationView

class Learn : AppCompatActivity() {
    lateinit var HOME: Button
    lateinit var DONATE: Button
    lateinit var INFO: Button

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.learn_drawer)
        val navView: NavigationView = findViewById(R.id.learn_view)
        val navController = findNavController(R.id.nav_learn_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.learn, R.id.nav_stats, R.id.nav_settings,
                R.id.about_us, R.id.sign_option
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        HOME= findViewById(R.id.profile)

        HOME.setOnClickListener{
            val intent_Home: Intent = Intent(this,main::class.java)
            startActivity(intent_Home)
        }

        INFO = findViewById(R.id.info)

        INFO.setOnClickListener{
            val intent_info: Intent = Intent(applicationContext, Information::class.java )
            startActivity(intent_info)
        }

        DONATE= findViewById(R.id.donate)

        DONATE.setOnClickListener{
            val intent_Donate: Intent = Intent(this,Donate::class.java)
            startActivity(intent_Donate)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_learn_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}