package com.geektech.rpggame.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.geektech.rpggame.databinding.ItemHeroBinding
import com.geektech.rpggame.model.Hero

class HeroAdapter(private val heroList: ArrayList<Hero>, val onAvatarClick: (position: Int) -> Unit):
    RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(ItemHeroBinding.inflate(LayoutInflater.
            from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heroList[position])
    }

    override fun getItemCount() = heroList.size

    inner class HeroViewHolder(private val binding: ItemHeroBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hero: Hero) {
            binding.ivAvatarItem.setOnClickListener{
                onAvatarClick(adapterPosition)
            }
            //
        }
    }
}