package com.example.scheduleapp;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Profile extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private AlertDialog.Builder builder;
    private AlertDialog alertDialog;
    private ImageView profilImg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.fragment_profile,container,false);

        profilImg = v.findViewById(R.id.profileImg); profilImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openImagePopup();
            }
        });

        return v;
    }

    public void openImagePopup(){
        CardView btnDelete,btnEdit;

        builder = new AlertDialog.Builder(getContext());
        final  View createPopup = getLayoutInflater().inflate(R.layout.content_profile_popup_image,null);

        btnDelete = createPopup.findViewById(R.id.btnDelete);
        btnEdit = createPopup.findViewById(R.id.btnEdit);

        builder.setView(createPopup);
        alertDialog = builder.create();
        alertDialog.show();

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });


    }
}