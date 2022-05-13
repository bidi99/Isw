package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cap1Dificultate extends AppCompatActivity {
    Button usor,greu,mediu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap1_dificultate);

        usor = findViewById(R.id.usor);
        mediu = findViewById(R.id.mediu);
        greu = findViewById(R.id.greu);

        usor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int umin = 0;
                int umax = 9;
                String u = "Dificultate usoara";
                Intent i = new Intent(Cap1Dificultate.this,ExersareCap1.class);
                i.putExtra("min",umin);
                i.putExtra("max",umax);
                i.putExtra("dificultate",u);

                startActivity(i);
            }
        });

        mediu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mmin = 10;
                int mmax = 19;
                Intent i = new Intent(Cap1Dificultate.this,ExersareCap1.class);
                i.putExtra("min",mmin);
                i.putExtra("max",mmax);
                String m = "Dificultate medie";
                i.putExtra("dificultate",m);
                startActivity(i);

            }
        });

        greu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gmin = 20;
                int gmax = 29;
                Intent i = new Intent(Cap1Dificultate.this,ExersareCap1.class);
                i.putExtra("min",gmin);
                i.putExtra("max",gmax);
                String g = "Dificultate grea";
                i.putExtra("dificultate",g);
                startActivity(i);
            }
        });
    }
}