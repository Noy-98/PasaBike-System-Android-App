package com.example.pasabike_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Forgot_Password extends AppCompatActivity {

    EditText pass;
    Button save;

    DatabaseReference rootDatabaseref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        pass = findViewById(R.id.password);
        save = findViewById(R.id.save_button);

        rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("users");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwd = pass.getText().toString();
                HashMap hashMap = new HashMap();
                hashMap.put("password",passwd);

                rootDatabaseref.child("users").updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(Forgot_Password.this, "Your Password Update Succesfully!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }
}