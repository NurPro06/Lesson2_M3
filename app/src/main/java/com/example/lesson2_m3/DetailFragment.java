package com.example.lesson2_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson2_m3.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {
    private FragmentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               User user = new User("John","swswq","dedew");
                Bundle bundle = new Bundle();
                bundle.putSerializable("key", user);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, secondFragment, null)
                        .setReorderingAllowed(true)
                        .addToBackStack(null)
                        .commit();

            }
        });
    }
}