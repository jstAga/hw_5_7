package com.geektech.rv4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMenu;
    private ArrayList<String> menuList = new ArrayList<>();
    private ArrayList<String> menuList2 = new ArrayList<>();
    private ArrayList<Integer> iconList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer icon = R.drawable.ic_bolt;

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
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");

        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");

        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);

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
        menuList.add("Shaurma");
        menuList.add("Shaurma");
        menuList.add("Shaurma");

        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");
        menuList2.add("lavash");

        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);
        iconList.add(icon);


        rvMenu = findViewById(R.id.rv_menu);
        MenuAdapter menuAdapter = new MenuAdapter(menuList, menuList2, iconList);
        rvMenu.setAdapter(menuAdapter);

    }
}