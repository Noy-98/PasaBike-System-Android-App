package com.example.pasabike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class PasaBike_Medicine_Layout extends AppCompatActivity {

    ImageButton track;

    private EditText num, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasa_bike_medicine_layout);

        track = findViewById(R.id.track);
        num = findViewById(R.id.phone_num);
        message = findViewById(R.id.message);
        send = findViewById(R.id.sent);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(PasaBike_Medicine_Layout.this, "Message Sent", Toast.LENGTH_SHORT).show();
            }
        });




        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps");
            }
        });
    }
    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}