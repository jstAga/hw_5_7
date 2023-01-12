package com.geektech.rvcotlin3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.geektech.rvcotlin3.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    private var foodList = arrayListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        foodList.add("sss0")
        foodList.add("sss1")
        foodList.add("sss2")
        foodList.add("sss3")
        foodList.add("sss4")
        foodList.add("sss5")
        foodList.add("sss6")
        foodList.add("sss7")
        foodList.add("sss8")
        foodList.add("sss9")
        foodList.add("sss10")
        foodList.add("sss11")
        foodList.add("sss12")
        foodList.add("sss13")

        val foodAdapter = FoodAdapter(foodList, this::onClick)
        binding.rvFood.adapter = foodAdapter
    }

    fun onClick(position: Int){
        Toast.makeText(requireContext(), position.toString(), Toast.LENGTH_SHORT).show()
    }
}