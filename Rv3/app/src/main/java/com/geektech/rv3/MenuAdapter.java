package com.geektech.rv3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuHolder> {

    private ArrayList<String> menuList;

    public MenuAdapter(ArrayList<String> menuList) {
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenuHolder holder, int position) {
        holder.bind(menuList.get(position));

    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
