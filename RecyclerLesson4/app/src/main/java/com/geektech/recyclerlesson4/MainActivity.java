package com.geektech.recyclerlesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.recyclerlesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        getSupportFragmentManager().beginTransaction().add(R.id.countries_container,
//                new CountriesFragment()).commit();
    }
}