package com.geektech.rv2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MenuHolder extends RecyclerView.ViewHolder {
    private TextView menuTv;

    public MenuHolder(@NonNull View itemView) {
        super(itemView);
        menuTv = itemView.findViewById(R.id.tv_menu);
    }

    public void bind(String menu){
        menuTv.setText(menu);
    }
}
