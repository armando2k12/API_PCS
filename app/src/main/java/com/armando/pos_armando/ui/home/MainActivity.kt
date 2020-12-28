package com.armando.pos_armando.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.armando.pos_armando.R
import com.armando.pos_armando.databinding.ActivityMainBinding
import com.armando.pos_armando.ui.auth.AuthActivity
import com.armando.pos_armando.ui.auth.PosAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        init()
    }

    private fun init() {
        binding.bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> navigation(R.id.homeFragment)
                R.id.ic_news -> navigation(R.id.newsFragment)
                R.id.ic_favorite -> navigation(R.id.ic_favorite)
                R.id.ic_profile -> navigation(R.id.ic_profile)
                else -> false

            }
        }
    }

    private fun navigation(id: Int): Boolean {
        findNavController(R.id.navHost).navigate(id)
        return true

    }
}