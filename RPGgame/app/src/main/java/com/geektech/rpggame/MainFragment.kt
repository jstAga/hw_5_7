package com.geektech.rpggame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.geektech.rpggame.adapter.HeroAdapter
import com.geektech.rpggame.databinding.FragmentMainBinding
import com.geektech.rpggame.model.Hero

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var heroList = arrayListOf<Hero>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        heroList.add(Hero("s","s","s"))
        heroList.add(Hero("s1","s","s"))
        heroList.add(Hero("s2","s","s"))
        heroList.add(Hero("s3","s","s"))
        heroList.add(Hero("s4","s","s"))
        heroList.add(Hero("s5","s","s"))

        val adapter:HeroAdapter = HeroAdapter(heroList, this::onPictureClick)
        binding.rvHeroListMain.adapter = adapter
    }

    private fun onPictureClick(position: Int){
        Toast.makeText(requireContext(), "PIC " + position, Toast.LENGTH_SHORT).show()
    }
}