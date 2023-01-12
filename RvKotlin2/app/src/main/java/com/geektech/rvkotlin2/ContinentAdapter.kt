package com.geektech.rvkotlin2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.rvkotlin2.databinding.ItemContinentsBinding

class ContinentAdapter(private val countryList: List<Continent>): RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContinentViewHolder {
        return ContinentViewHolder(ItemContinentsBinding.inflate(LayoutInflater.
        from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ContinentViewHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount() = countryList.size


    inner class ContinentViewHolder(private val binding: ItemContinentsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(continent: Continent){
            binding.tvContinentName.text = continent.name
        }
    }
}