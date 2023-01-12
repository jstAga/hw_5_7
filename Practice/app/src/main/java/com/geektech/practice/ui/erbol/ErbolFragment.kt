package com.geektech.practice.ui.erbol

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.geektech.practice.databinding.FragmentErbolBinding

class ErbolFragment : Fragment() {

    private lateinit var binding: FragmentErbolBinding
    private val getContent: ActivityResultLauncher<String> =
        registerForActivityResult(ActivityResultContracts.GetContent()) { imageUri: Uri? ->
            binding.ivPicture.setImageURI(imageUri)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = com.geektech.practice.databinding.FragmentErbolBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivPicture.setOnClickListener {
            getContent.launch("image/*")
        }
    }

}


