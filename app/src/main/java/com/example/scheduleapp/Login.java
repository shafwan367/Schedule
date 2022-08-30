package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private ImageView btn_login;
    private TextView btn_signUp;
    private EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.editUser);
        pass = (EditText) findViewById(R.id.editPass);

        btn_login = (ImageView) findViewById(R.id.btn_login); btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // (user != null && pass != null) ? startActivity(new Intent(Login.this, Authentic.class)) : user.setText("User/Email not found");
                startActivity(new Intent(Login.this,Authentic.class));
            }
        });

        btn_signUp = (TextView) findViewById(R.id.btn_signUp); btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,SignUp.class));
            }
        });
    }
}