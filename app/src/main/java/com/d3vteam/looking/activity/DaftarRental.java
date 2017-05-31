package com.d3vteam.looking.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.d3vteam.looking.R;

public class DaftarRental extends AppCompatActivity {

    Button button, button2 , button3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_rental);

        // metode yang diinisialisasi di activity
        button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // pindah intent menggunakan btnJava yang diinisialiasi di atas
                Intent intent = new Intent(DaftarRental.this,
                        DaftarMobil.class);
                startActivity(intent);
                finish();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // pindah intent menggunakan btnJava yang diinisialiasi di atas
                Intent intent = new Intent(DaftarRental.this,
                        Daftarmobil1.class);
                startActivity(intent);
                finish();
    }

    ;
    });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // pindah intent menggunakan btnJava yang diinisialiasi di atas
                Intent intent = new Intent(DaftarRental.this,
                        Daftarmobil2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}