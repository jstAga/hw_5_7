package com.geektech.recyclerlesson4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.recyclerlesson4.databinding.CountriesItemBinding;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {

    private ArrayList<Country> countryList;
    private OnItemClick onItemClick;

    public CountriesAdapter(ArrayList<Country> countryList, OnItemClick onItemClick) {
        this.countryList = countryList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(CountriesItemBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(countryList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public Country getCountry(int pos) {
        return countryList.get(pos);
    }

    class CountriesViewHolder extends RecyclerView.ViewHolder {

        private CountriesItemBinding binding;

        public CountriesViewHolder(@NonNull CountriesItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Country country) {
            binding.tvName.setText(country.getName());
            binding.tvCapital.setText(country.getCapital());
            Glide.with(binding.tvCapital).load(country.getFlag()).into(binding.imgFlag);
        }
    }
}
