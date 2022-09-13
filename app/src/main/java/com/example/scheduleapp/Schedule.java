package com.example.scheduleapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Schedule extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    private AlertDialog.Builder builder;
    private AlertDialog alertDialog;
    private RelativeLayout btnCreate;
    private ConstraintLayout imgEmpty;
    private RecyclerView recyclerView;
    private ArrayList<String> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_schedule, container, false);

        btnCreate = v.findViewById(R.id.btnCreate); btnCreate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                createNewTitleSchedule();
            }
        });

        recyclerView = v.findViewById(R.id.recyleView);
        //imgEmpty = v.findViewById(R.id.imgEmpty);
        //imgEmpty.setAlpha(0);
        return v;
    }

    private void createNewTitleSchedule(){
        EditText inputTitle;
        Button btnCreateSchedule;

        builder = new AlertDialog.Builder(getContext());

        final View createShowPopup = getLayoutInflater().inflate(R.layout.schedule_item_titile_create,null);

        inputTitle = createShowPopup.findViewById(R.id.inputTitle);
        btnCreateSchedule = createShowPopup.findViewById(R.id.btnCreateaSchedule);

        builder.setView(createShowPopup);
        alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();
        btnCreateSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),ScheduleEdit.class));
            }
        });
    }
}