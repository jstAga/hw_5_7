package com.geektech.rv_kotlin

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

private class FoodAdapter: RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    private var foodList = emptyList<>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class FoodViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}