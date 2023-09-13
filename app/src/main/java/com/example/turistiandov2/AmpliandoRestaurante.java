package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;
import com.example.turistiandov2.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;

    ImageView fotoAmpliandoRestaurante;
    TextView nombreAmpliandoRestaurante;
    TextView reseñaRestaurante;
    ImageView imagenAlternaRes;
    ImageView estrellasRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        fotoAmpliandoRestaurante=findViewById(R.id.imagenAmpliandoRestaurante);
        nombreAmpliandoRestaurante=findViewById(R.id.ampliandoNameRestaurante);
        imagenAlternaRes =findViewById(R.id.imagenAmpliandoResDos);
        reseñaRestaurante =findViewById(R.id.ampliandoInfoRestaurante);
        estrellasRes =findViewById(R.id.estrellasRes);

        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");


        fotoAmpliandoRestaurante.setImageResource(moldeRestaurante.getFoto());
        nombreAmpliandoRestaurante.setText(moldeRestaurante.getNombre());
        imagenAlternaRes.setImageResource(moldeRestaurante.getFoto2());
        reseñaRestaurante.setText(moldeRestaurante.getReseñaRes());
        estrellasRes.setImageResource(moldeRestaurante.getEstrellas());

    }
}