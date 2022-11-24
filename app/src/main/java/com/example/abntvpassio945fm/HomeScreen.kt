package com.example.abntvpassio945fm

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.*
import com.example.abntvpassio945fm.databinding.ActivityHomeScreenBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityHomeScreenBinding
    private lateinit var  bottomnav:BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
       // setHasOptionMenu(true)
        setContentView(binding.root)
        setSupportActionBar(binding.appBarHomeScreen.toolbar)


        val  drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        bottomnav=findViewById(R.id.bottomview)

        val navController = findNavController(R.id.nav_host_fragment_content_home_screen)
        bottomnav.setupWithNavController(navController)

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_slideshow,R.id.radioFragment,R.id.TVFragment,
                R.id.programScheduleFragment,R.id.advertiseWithUsFragment,R.id.connectWithOAPFragment,
                R.id.sendYourReportsFragment,R.id.aboutUsFragment,R.id.contactUsFragment,R.id.rateUsFragment,
                R.id.feedBackFragment
            ), drawerLayout
        )


        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //NavigationUI.setupActionBarWithNavController(binding.appBarHomeScreen.bottomnav.navController)
        NavigationUI.setupWithNavController(binding.appBarHomeScreen.bottomview,navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.home_screen, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.aboutUsFragment->{
                findNavController(R.id.nav_host_fragment_content_home_screen).navigate(R.id.aboutUsFragment)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean  {
        val navController = findNavController(R.id.nav_host_fragment_content_home_screen)
        return navController.navigateUp(appBarConfiguration)
       // return NavigationUI.navigateUp(navController,drawerLayout)
    }


}