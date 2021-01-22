package com.example.s1mplify

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.s1mplify.databinding.ActivityMainBinding

class MAIN : AppCompatActivity() {

    lateinit var DONATE: Button
    lateinit var LEARN: Button
    lateinit var INFO: Button

    lateinit var DONATE: Button
    lateinit var LEARN: Button
    lateinit var INFO: Button

    lateinit var DONATE: Button
    lateinit var LEARN: Button
    lateinit var INFO: Button

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m_a_i_n)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        DONATE= findViewById(R.id.donate)

        DONATE.setOnClickListener{
            val intent_Donate: Intent = Intent(this,Donate::class.java)
            startActivity(intent_Donate)
        }

        LEARN = findViewById(R.id.learn)

        LEARN.setOnClickListener{
            val intent_learn: Intent = Intent(applicationContext, Learn::class.java)
            startActivity(intent_learn)
        }

        INFO = findViewById(R.id.info)

        INFO.setOnClickListener{
            val intent_info: Intent = Intent(applicationContext, Information::class.java )
            startActivity(intent_info)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.m_a_i_n, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}