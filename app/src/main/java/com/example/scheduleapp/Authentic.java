package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

public class Authentic extends AppCompatActivity {

    private ImageView btn_back;
    private TextInputEditText editSatu,editDua,editTiga,editEmpat;
    private TextView btn_reload,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentic);

        btn_back = (ImageView) findViewById(R.id.btn_back); btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {onBackPressed();}
        });







    }
}