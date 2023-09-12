package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turistiandov2.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView descripcionHotal;

    ImageView segundaFotoHotel;
    ImageView calificacionHotel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        fotoAmpliandoHotel=findViewById(R.id.imagenAmpliando);
        nombreAmpliandoHotel=findViewById(R.id.ampliandoName);
        descripcionHotal=findViewById(R.id.ampliandoInfo);
        segundaFotoHotel=findViewById(R.id.imagenAmpliandoDos);
        calificacionHotel=findViewById(R.id.estrellasHotel);

        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");
        // cargando la info en los componentes graficos

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        descripcionHotal.setText(moldeHotel.getDescripcion());
        segundaFotoHotel.setImageResource(moldeHotel.getFotoAdicional());
        calificacionHotel.setImageResource(moldeHotel.getCalificacion());


    }
}