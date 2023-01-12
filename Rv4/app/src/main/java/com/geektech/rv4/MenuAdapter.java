package com.geektech.rv4;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private ArrayList<String> menuList;
    private ArrayList<String> menuList2;
    private ArrayList<Integer> iconList;



    public MenuAdapter(ArrayList<String> menuList, ArrayList<String> menuList2, ArrayList<Integer> iconList) {
        this.menuList = menuList;
        this.menuList2 = menuList2;
        this.iconList = iconList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenuViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.bind(menuList.get(position),
                menuList2.get(position),
                iconList.get(position));

        if (position < 3){
            int bg = R.drawable.bg_item_purple;
            holder.itemContainer.setBackgroundResource(bg);
        }
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
