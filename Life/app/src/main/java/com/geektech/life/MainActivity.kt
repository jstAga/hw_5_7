package com.geektech.life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.life.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.swFriends.setOnClickListener {
            binding.swFriends.isChecked = binding.swFriends.isChecked
            if(binding.swFriends.isChecked && binding.swMoney.isChecked){
                binding.swMoney.isChecked = false
            }
        }

        binding.swLove.setOnClickListener {
            binding.swLove.isChecked = binding.swLove.isChecked
            if(binding.swFriends.isChecked && binding.swMoney.isChecked){
                binding.swFriends.isChecked = false
            }
        }

        binding.swMoney.setOnClickListener {
            binding.swMoney.isChecked = binding.swMoney.isChecked
            if(binding.swFriends.isChecked && binding.swLove.isChecked){
                binding.swLove.isChecked = false
            }
        }

    }
}