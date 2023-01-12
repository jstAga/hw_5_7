package com.geektech.rv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMenu;
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
        menuList.add("Shaurma");
        menuList.add("Shaurma");

        MenuAdapter adapter = new MenuAdapter(menuList);
        rvMenu = rvMenu.findViewById(R.id.rv_menu);
        rvMenu.setAdapter(adapter);
    }
}