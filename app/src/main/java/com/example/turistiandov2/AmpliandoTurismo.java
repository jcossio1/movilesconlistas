package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeTurismo;
import com.example.turistiandov2.moldes.MoldeTurismo;
import com.example.turistiandov2.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;

    ImageView fotoAmpliandoTurismo;
    TextView nombreAmpliandoTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoAmpliandoTurismo=findViewById(R.id.imagenAmpliandoTurismo);
        nombreAmpliandoTurismo=findViewById(R.id.ampliandoNameTurismo);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datoshotel");


        fotoAmpliandoTurismo.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoTurismo.setText(moldeTurismo.getNombre());

    }
}