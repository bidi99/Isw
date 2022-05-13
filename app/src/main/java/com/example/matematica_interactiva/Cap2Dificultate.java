package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cap2Dificultate extends AppCompatActivity {
    Button usor,greu,mediu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap2_dificultate);

        usor = findViewById(R.id.usor);
        mediu = findViewById(R.id.mediu);
        greu = findViewById(R.id.greu);

        usor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int umin = 30;
                int umax = 39;
                String u = "Dificultate usoara";
                Intent i = new Intent(Cap2Dificultate.this,ExersareCap2.class);
                i.putExtra("min",umin);
                i.putExtra("max",umax);
                i.putExtra("dificultate",u);

                startActivity(i);
            }
        });

        mediu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mmin = 40;
                int mmax = 49;
                Intent i = new Intent(Cap2Dificultate.this,ExersareCap2.class);
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
                int gmin = 50;
                int gmax = 59;
                Intent i = new Intent(Cap2Dificultate.this,ExersareCap2.class);
                i.putExtra("min",gmin);
                i.putExtra("max",gmax);
                String g = "Dificultate grea";
                i.putExtra("dificultate",g);
                startActivity(i);
            }
        });
    }
}