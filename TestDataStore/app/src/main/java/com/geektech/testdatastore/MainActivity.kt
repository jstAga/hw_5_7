package com.plcoding.datastoreandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.lifecycle.lifecycleScope
import com.geektech.testdatastore.Pref
import com.geektech.testdatastore.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
private lateinit var pref: Pref

    private lateinit var dataStore: DataStore<Preferences>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pref = Pref(this)

        binding.btnSave.setOnClickListener {
            lifecycleScope.launch {
                pref.savePref(
                    binding.etSaveKey.text.toString(),
                    binding.etSaveValue.text.toString()
                )
            }
        }

        binding.btnRead.setOnClickListener {
            lifecycleScope.launch {
                val value = pref.readPref(binding.etReadkey.text.toString())
                binding.tvReadValue.text = value ?: "No value found"
            }
        }
    }

}
// 9 :43