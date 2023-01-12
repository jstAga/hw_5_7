package com.geektech.rvtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.geektech.rvtest.adapter.HeroAdapter
import com.geektech.rvtest.databinding.FragmentMainBinding
import com.geektech.rvtest.model.Hero

class MainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding
    private var heroList = arrayListOf<Hero>()
    private lateinit var heroAdapter: HeroAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        heroAdapter = HeroAdapter(heroList, this::onItemClick)
        binding.rvHero.adapter = heroAdapter
    }

    fun loadData(){
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
        heroList.add(Hero("A", "B"))
    }

    fun onItemClick(position:Int){
        Toast.makeText(requireContext(), position.toString(), Toast.LENGTH_SHORT).show()
    }

}