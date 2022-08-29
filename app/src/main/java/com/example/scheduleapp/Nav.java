package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.scheduleapp.databinding.ActivityNavBinding;

public class Nav extends AppCompatActivity {

    private ActivityNavBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        binding = ActivityNavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new Home());

        binding.bottomNavigationView.setOnItemReselectedListener(item -> {
            switch (item.getItemId()){
                case R.id.Home:
                    replaceFragment(new Home());
                    break;
                case R.id.Schedule:
                    replaceFragment(new Schedule());
                    break;
                case R.id.Histroy:
                    replaceFragment(new Histroy());
                    break;
                case R.id.Profile:
                    replaceFragment(new Profile());
                    break;
            }

        });


    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}