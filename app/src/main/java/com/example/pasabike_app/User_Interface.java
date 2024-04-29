package com.example.pasabike_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class User_Interface extends AppCompatActivity {

    Button pasabuyer_bttn, pasabiker_bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);

        pasabuyer_bttn = (Button) findViewById(R.id.PasaBuyer);
        pasabiker_bttn = (Button) findViewById(R.id.PasaBiker);

        pasabuyer_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User_Interface.this, Tutorial.class);
                startActivity(i);
            }
        });

        pasabiker_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User_Interface.this, PasaBiker_Layout.class);
                startActivity(i);
            }
        });
    }
}