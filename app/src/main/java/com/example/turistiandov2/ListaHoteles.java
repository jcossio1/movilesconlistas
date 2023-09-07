package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHotel = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView = findViewById((R.id.recyclerViewHoteles));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorHotel adaptadorHotel = new AdaptadorHotel(listaHotel);
        recyclerView.setAdapter(adaptadorHotel);
    }

    private void llenarListaConDatos() {

        listaHotel.add(new MoldeHotel("Tradiciones Café Hotel", "$80.000", "3225950033", R.drawable.h1, "hotel hermoso y agradable", R.drawable.h2 ));
        listaHotel.add(new MoldeHotel("Hotel el volado", "$20.000", "3225958080", R.drawable.h2, "El hotel huele maluco", R.drawable.h3 ));
        listaHotel.add(new MoldeHotel("Garavito Hotel", "$100.000", "3224569033", R.drawable.h3 , "hotel hermoso y agradable", R.drawable.h2 ));
        listaHotel.add(new MoldeHotel("Fragancia Hotel", "$120.000", "323590357", R.drawable.h4 , "hotel hermoso y agradable", R.drawable.h2));
        listaHotel.add(new MoldeHotel("Camino a santafe Hotel", "$87.000", "3225950033", R.drawable.h5 , "hotel hermoso y agradable", R.drawable.h2));


    }
}




