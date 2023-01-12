package com.geektech.rv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView menuRv;
    private ArrayList<String> menuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");

        MenuAdapter menuAdapter = new MenuAdapter(menuList);
        menuRv = findViewById(R.id.rv_menu);
        menuRv.setAdapter(menuAdapter);


    }
}