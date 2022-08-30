package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    private ImageView btn_login;
    private TextView btn_signUp;
    private EditText user,pass,passConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        user = (EditText) findViewById(R.id.editUser);
        pass = (EditText) findViewById(R.id.editPass);
        passConfirm = (EditText) findViewById(R.id.editPass);

        btn_login = (ImageView) findViewById(R.id.btn_login); btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // (user != null && pass != null) ? startActivity(new Intent(Login.this, Authentic.class)) : user.setText("User/Email not found");
            }
        });

        btn_signUp = (TextView) findViewById(R.id.btn_signUp); btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,Authentic.class));
            }
        });
    }
}