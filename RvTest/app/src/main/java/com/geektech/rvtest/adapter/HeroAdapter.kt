package com.geektech.rvtest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.rvtest.databinding.HeroItemBinding
import com.geektech.rvtest.model.Hero

class HeroAdapter(private val heroList: ArrayList<Hero>, val onItemClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            HeroItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heroList[position])
    }

    override fun getItemCount() = heroList.size

    inner class HeroViewHolder(private val binding: HeroItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hero: Hero) {
            itemView.setOnClickListener{
                onItemClick(adapterPosition)
            }
            binding.tvName.text = hero.name
            binding.tvStatus.text = hero.status
        }
    }
}
