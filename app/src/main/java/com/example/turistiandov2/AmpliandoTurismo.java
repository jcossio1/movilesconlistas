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
    TextView reseñaTurismo;
    ImageView imagenDosTurimo;
    ImageView estrellasTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoAmpliandoTurismo=findViewById(R.id.imagenAmpliandoTurismo);
        nombreAmpliandoTurismo=findViewById(R.id.ampliandoNameTurismo);
        reseñaTurismo=findViewById(R.id.ampliandoInfoTurismo);
        imagenDosTurimo=findViewById(R.id.imagenAmpliandoSitiDos);
        estrellasTurismo=findViewById(R.id.estrellasSitio);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");


        fotoAmpliandoTurismo.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoTurismo.setText(moldeTurismo.getNombre());
        reseñaTurismo.setText(moldeTurismo.getReseñaTurismo());
        imagenDosTurimo.setImageResource(moldeTurismo.getFoto2());
        estrellasTurismo.setImageResource(moldeTurismo.getEstrellasTurism());
    }
}