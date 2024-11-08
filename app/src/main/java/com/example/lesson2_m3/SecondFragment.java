package com.example.lesson2_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lesson2_m3.databinding.FragmentSecondBinding;

import java.io.Serializable;


public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            Serializable user = getArguments().getSerializable("key");
            String text = "Name:" + ((User) user).getName()+"\n"+
                    "Email:" + ((User)user).getEmail() + "\n" +
                    "Password:" + ((User)user).getPassword();
            binding.textView.setText(text);
        }
        binding.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.setText("Hello");
            }
        });
        binding.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView1.setText("Hello");
            }
        });
        binding.textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView2.setText("Hello");
            }
        });
        binding.textView3.setMessage(binding.textView3, "Hello");
        binding.textView4.setMessage(binding.textView4, "Hello");

    }

}
