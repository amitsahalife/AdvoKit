package com.example.advokit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    ImageView facebook, google;

    TextView email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.btnLogin);
        facebook = findViewById(R.id.facebookLogo);
        google = findViewById(R.id.googlelogo);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"InBuild",Toast.LENGTH_SHORT).show();
            }
        });

        // google pennding


        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"InBuild",Toast.LENGTH_SHORT).show();
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(MainActivity.this, Home.class);
                startActivity(i);
            }
        });
    }






}