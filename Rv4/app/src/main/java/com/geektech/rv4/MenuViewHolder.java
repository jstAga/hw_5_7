package com.geektech.rv4;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMenu;
    private TextView tvMenu2;
    private ImageView ivMenu;
     ConstraintLayout itemContainer;

    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMenu = itemView.findViewById(R.id.tv_menu);
        tvMenu2 = itemView.findViewById(R.id.tv_menu2);
        ivMenu = itemView.findViewById(R.id.iv_menu);
        itemContainer = itemView.findViewById(R.id.item_container);
    }

    public ConstraintLayout getItemContainer() {
        return itemContainer;
    }

    public void bind(String menu, String menu2, Integer icon){
        tvMenu.setText(menu);
        tvMenu2.setText(menu2);
        ivMenu.setImageResource(icon);
    }


}
