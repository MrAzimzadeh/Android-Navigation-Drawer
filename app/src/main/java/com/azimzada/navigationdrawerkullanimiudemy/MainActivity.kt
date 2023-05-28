package com.azimzada.navigationdrawerkullanimiudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.azimzada.navigationdrawerkullanimiudemy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Birlesirme
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.navController)


        // programin basligi
        binding.toolbar.title = "Basliq"

        // menu ucun uc xett olan hisse
        val toggle = ActionBarDrawerToggle(this , binding.drawer , binding.toolbar , 0 , 0 )
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

    }
}