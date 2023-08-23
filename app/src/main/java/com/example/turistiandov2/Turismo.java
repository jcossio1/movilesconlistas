package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Turismo extends AppCompatActivity {

    Button botonVerMas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);

        botonVerMas = findViewById(R.id.vermassitios);

        botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListaSitio = new Intent(Turismo.this, listaSitiosTurismo.class);
                startActivity(intentListaSitio);
            }
        });

    }
}