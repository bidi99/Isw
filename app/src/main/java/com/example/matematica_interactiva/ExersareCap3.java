package com.example.matematica_interactiva;

import androidx.appcompat.app.AppCompatActivity;

import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.zip.InflaterInputStream;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExersareCap3 extends AppCompatActivity {

    TextView txt,txv,txd;
    Button btn;
    EditText number;
    Random random = new Random();
    private int index,nrCounter,next = 0;
    private String str = " ";
    private String[] arrofstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersare_cap3);

        ArrayList<String> intrebari = new ArrayList<String>();
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);
        txv = findViewById(R.id.txv);
        number = findViewById(R.id.number);
        txd = findViewById(R.id.txd);

        Intent j = getIntent();
        int min = j.getIntExtra("min",0);
        int max = j.getIntExtra("max",0);
        String dificultate = j.getStringExtra("dificultate");
        txd.setText(dificultate);

        InputStream inputStream =   this.getResources().openRawResource(R.raw.intrebarii);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuffer stringBuffer = new StringBuffer();
        String mydata = "";
        if(inputStream!=null){
            try {
                while ((mydata = bufferedReader.readLine()) != null) {
                    intrebari.add(mydata);
                }
                ;
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        Context context = getApplicationContext();
        CharSequence corect = "Raspuns Corect!";
        CharSequence gresit = "Raspuns Gresit!";
        CharSequence introducere = "Introdu raspunsul!";
        int duration = Toast.LENGTH_SHORT;


        next = random.nextInt(max - min + 1) + min;
        str = intrebari.get(next);
        arrofstr = str.split(";");
        txt.setText(arrofstr[0]);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Integer.parseInt(arrofstr[1]) == Integer.parseInt(number.getText().toString())){
                    index++;
                    next = random.nextInt(max - min + 1) + min;
                    str = intrebari.get(next);
                    arrofstr = str.split(";");
                    txt.setText(arrofstr[0]);
                    number.getText().clear();
                    Toast toast = Toast.makeText(context, corect, duration);
                    toast.show();

                }
                else{
                    next = random.nextInt(max - min + 1) + min;
                    str = intrebari.get(next);
                    arrofstr = str.split(";");
                    txt.setText(arrofstr[0]);
                    number.getText().clear();
                    Toast toast = Toast.makeText(context, gresit, duration);
                    toast.show();
                }
                txv.setText(String.format("Ai raspuns corect la %s intrebari din 5!",Integer.toString(index)));
                nrCounter++;
                if(nrCounter == 5 && index >= 3){
                    Intent i = new Intent(ExersareCap3.this,RezultatPozitiv.class);
                    startActivity(i);
                }else if(nrCounter == 5  && index < 3){
                    Intent i = new Intent(ExersareCap3.this,RezultatNegativ.class);
                    startActivity(i);
                }
            }
        });

    }
}