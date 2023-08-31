package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldeHotel.getNombre(), Toast.LENGTH_SHORT).show();
    }
}