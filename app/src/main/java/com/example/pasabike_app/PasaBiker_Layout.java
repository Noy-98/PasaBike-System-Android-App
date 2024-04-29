package com.example.pasabike_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PasaBiker_Layout extends AppCompatActivity {

    ImageButton docs, foods, clothes, gadgets, lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasa_biker_layout);

        docs = findViewById(R.id.documents);
        foods = findViewById(R.id.food);
        clothes = findViewById(R.id.clothes);
        gadgets = findViewById(R.id.gadget);
        lg = findViewById(R.id.logout);


        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PasaBiker_Layout.this, Login_PasaBuyer.class);
                startActivity(i);
            }
        });

        docs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PasaBiker_Layout.this, PasaBike_Documents_Layout.class);
                startActivity(i);
            }
        });

        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PasaBiker_Layout.this, PasaBike_Food_Layout.class);
                startActivity(i);
            }
        });

        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PasaBiker_Layout.this, PasaBike_Clothes_Layout.class);
                startActivity(i);
            }
        });

        gadgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PasaBiker_Layout.this, PasaBike_Medicine_Layout.class);
                startActivity(i);
            }
        });

    }
}