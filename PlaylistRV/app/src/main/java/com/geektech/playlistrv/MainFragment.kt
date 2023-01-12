package com.geektech.playlistrv

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import com.geektech.playlistrv.databinding.FragmentMainBinding
import java.io.Serializable
import kotlin.math.log

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var songList = arrayListOf<Song>()
    private var bundle = Bundle()
    private var fragment:SecondFragment = SecondFragment()


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

        val musicAdapter = MusicAdapter(songList, this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(position:Int){
        Toast.makeText(requireContext(), position.toString(), Toast.LENGTH_SHORT).show()

        bundle.putSerializable("key", songList[0])
        fragment.arguments = bundle

        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).addToBackStack(null).commit()

    }

    private fun loadData(){
        songList.add(Song("Mario", "Let Me Love You","4:11","https://avatars.yandex.net/get-music-content/2383988/1cf8ab6b.a.9691367-2/400x400"))
         songList.add(Song("50 cent", "How We Do","3:55","https://avatars.yandex.net/get-music-content/42108/10510516.a.4205-1/400x400"))
         songList.add(Song("Major Lazer", "Light it up","4:20","https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"))
         songList.add(Song("Major Lazer", "Light it up","4:20","https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"))
         songList.add(Song("Major Lazer", "Light it up","4:20","https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"))
         songList.add(Song("Major Lazer", "Light it up","4:20","https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"))
    }
}



