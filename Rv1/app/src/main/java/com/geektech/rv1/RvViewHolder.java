package com.geektech.rv1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCity;
    public RvViewHolder(@NonNull View itemView) {
        super(itemView);

        tvCity = itemView.findViewById(R.id.item_city);
    }

    public void bind(String city){
        tvCity.setText(city);
    }
}
