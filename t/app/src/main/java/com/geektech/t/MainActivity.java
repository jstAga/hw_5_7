package com.geektech.t;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter;
    TextView s;
    Integer value;
    Button plus;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.counter);
        plus = findViewById(R.id.plus);
        imageView = findViewById(R.id.image);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = findViewById(R.id.s);
                s.setText("FFFFF");

                Drawable image= R.drawable.ic_image;
                imageView.setImageDrawable(image);

                value = Integer.parseInt(counter.getText().toString()) + 1;
                counter.setText(value.toString());
            }
        });



    }
}