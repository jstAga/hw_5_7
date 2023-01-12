package com.geektech.recyclerlesson4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.geektech.recyclerlesson4.databinding.FragmentCountriesBinding;

import java.util.ArrayList;

public class CountriesFragment extends Fragment implements OnItemClick {

    private FragmentCountriesBinding binding;
    private ArrayList<Country> countryList = new ArrayList<>();
    private CountriesAdapter countriesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountriesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();

        countriesAdapter = new CountriesAdapter(countryList, this);
        binding.rvCountries.setAdapter(countriesAdapter);
    }

    private void loadData() {
        countryList.add(new Country("Kyrgyzstan", "Bishkek", "https://upload.wikimedia.org/wikipedia/commons/b/ba/Flag_of_Kyrgyzstan.png"));
        countryList.add(new Country("Kazakhstan", "Astana", ""));
        countryList.add(new Country("Russia", "Moscow", ""));
        countryList.add(new Country("Ukraine", "Kiev", ""));
        countryList.add(new Country("USA", "Washington", ""));
        countryList.add(new Country("Spain", "Madrid", ""));
        countryList.add(new Country("France", "Paris", ""));
        countryList.add(new Country("China", "Beijing", ""));
        countryList.add(new Country("Egypt", "Cairo  ", ""));
        countryList.add(new Country("Canada", "Ottawa", ""));
        countryList.add(new Country("Italy", "Rome", ""));


    }


    @Override
    public void onClick(int pos) {
        Toast.makeText(requireContext(), pos + "", Toast.LENGTH_SHORT);
        countriesAdapter.getCountry(pos);
    }
}