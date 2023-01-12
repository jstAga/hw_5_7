package com.geektech.rv1;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RvAdapter extends RecyclerView.Adapter<RvViewHolder> {

    private ArrayList<String> cityList;

    public RvAdapter(ArrayList<String> cityList) {
        this.cityList = cityList;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RvViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_rv, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        holder.bind(cityList.get(position));
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }
}
