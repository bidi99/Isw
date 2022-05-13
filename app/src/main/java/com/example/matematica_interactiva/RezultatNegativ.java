package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RezultatNegativ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezultat_negativ);

        Button mainMenu, teorie;

        mainMenu = findViewById(R.id.buttonMenu);
        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RezultatNegativ.this,MainActivity.class);
                startActivity(i);
            }
        });

        teorie = findViewById(R.id.buttonteorie);
        teorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RezultatNegativ.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}