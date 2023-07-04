package com.example.firstfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;

import com.example.firstfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}