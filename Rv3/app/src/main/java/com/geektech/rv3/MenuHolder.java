package com.geektech.rv3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuHolder extends RecyclerView.ViewHolder {
    private TextView tvMenu;

    public MenuHolder(@NonNull View itemView) {
        super(itemView);

        tvMenu = itemView.findViewById(R.id.tv_menu);
    }

    public void bind(String menu){
        tvMenu.setText(menu);
    }
}
