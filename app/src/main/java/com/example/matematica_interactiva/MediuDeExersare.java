package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediuDeExersare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediu_de_exersare);

        Button cap1, cap2, cap3, cap4, random, back;

        back = findViewById(R.id.btnExBackToMenu);
        cap1 = findViewById(R.id.btnExAdunare);
        cap2 = findViewById(R.id.btnExScadere);
        cap3 = findViewById(R.id.btnExInmultire);
        cap4 = findViewById(R.id.btnExImpartire);
        random = findViewById(R.id.btnExRandom);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this,MainActivity.class);
                startActivity(i);
            }
        });


        cap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this,Cap1Dificultate.class);
                startActivity(i);
            }
        });


        cap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this, Cap2Dificultate.class);
                startActivity(i);
            }
        });


        cap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this, Cap3Dificultate.class);
                startActivity(i);
            }
        });


        cap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this, Cap4Dificultate.class);
                startActivity(i);
            }
        });


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeExersare.this, ExersareRandom.class);
                startActivity(i);
            }
        });

    }
}