package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediuDeInvatare extends AppCompatActivity {

    Button adunare, scadere, inmultire, impartire, back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediu_de_invatare);

        adunare = findViewById(R.id.btnAdunare);
        scadere = findViewById(R.id.btnScadere);
        inmultire = findViewById(R.id.btnInmultire);
        impartire = findViewById(R.id.btnImpartire);
        back = findViewById(R.id.btnBackToMenu);


        adunare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://ro.wikipedia.org/wiki/Adunare");
            }
        });


        scadere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://ro.wikipedia.org/wiki/Sc%C4%83dere");
            }
        });


        inmultire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://ro.wikipedia.org/wiki/%C3%8Enmul%C8%9Bire_(matematic%C4%83)");
            }
        });


        impartire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://ro.wikipedia.org/wiki/%C3%8Emp%C4%83r%C8%9Bire_(matematic%C4%83)");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediuDeInvatare.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void gotoURL(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}