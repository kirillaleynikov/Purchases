package com.example.purchases.entities.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.purchases.R
import com.example.purchases.databinding.ActivityMainBinding
import fragments.FragmentManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setBottomNavListener()
    }
    private fun setBottomNavListener() {
        binding.btnNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    Log.d("MyLog", "Settings")
                }
                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)
                }
                R.id.shop_list -> {
                    Log.d("MyLog", "List")
                }
                R.id.new_item -> {
                    Log.d("MyLog", "New")
                }
            }
            true
        }
    }
}