package com.geektech.rv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> cityList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList.add("Moscow");
        cityList.add("Bishkek");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");
        cityList.add("Moscow");

        RvAdapter adapter = new RvAdapter(cityList);
        recyclerView = findViewById(R.id.rv_1);
        recyclerView.setAdapter(adapter);
    }
}