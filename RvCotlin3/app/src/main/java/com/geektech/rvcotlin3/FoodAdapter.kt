package com.geektech.rvcotlin3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.geektech.rvcotlin3.databinding.ItemFoodBinding

class FoodAdapter(private val foodList: List<String>, val onClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(
            ItemFoodBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(foodList[position])
    }

    override fun getItemCount() = foodList.size

    inner class FoodViewHolder(private val binding: ItemFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(foodName: String) {

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }

            binding.tvFood.text = foodName
        }
    }
}