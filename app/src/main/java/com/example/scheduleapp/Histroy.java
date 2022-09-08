package com.example.scheduleapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

public class Histroy extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_histroy, container, false);

        CardView cardView = v.findViewById(R.id.cardView);
        int color[] = {
                Color.parseColor("#00B0FF"),
                Color.parseColor("#FFC642"),
                Color.parseColor("#FF4242"),
        };


        cardView.setCardBackgroundColor(getRandomNumber(color));
        return v;
    }

    public static int getRandomNumber(int[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }
}