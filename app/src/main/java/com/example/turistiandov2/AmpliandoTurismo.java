package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeRestaurante;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldeRestaurante.getNombre(), Toast.LENGTH_SHORT).show();
    }
}