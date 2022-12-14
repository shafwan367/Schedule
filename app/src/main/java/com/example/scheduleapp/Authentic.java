package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
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

        btn_back = (ImageView) findViewById(R.id.signupBtnBack); btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {onBackPressed();}
        });

        time = findViewById(R.id.authTime);

        final CountDownTimer countDownTimer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long l) {
                time.setText(""+ l/1000);
            }

            @Override
            public void onFinish() {
                time.setText("0");
            }
        }.start();









    }
}