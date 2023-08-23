package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.example.turistiandov2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class lista_restaurante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurante = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);

        recyclerView = findViewById((R.id.recyclerViewRestaurantes));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(listaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);
    }

    private void llenarListaConDatos() {

        listaRestaurante.add(new MoldeRestaurante("desde la raiz", "3225950033", "$15000-60000", "Arepa de huevo", R.drawable.r1));
        listaRestaurante.add(new MoldeRestaurante("Energy", "3226667733", "$20000-100000", "ceviche", R.drawable.r2));
        listaRestaurante.add(new MoldeRestaurante("ThinkStation", "3226799973", "$22000-90000", "Carne de burro", R.drawable.r3));
        listaRestaurante.add(new MoldeRestaurante("Amper", "3229890044", "$18000-60000", "caviar", R.drawable.r4));
        listaRestaurante.add(new MoldeRestaurante("Galeria", "3228944433", "$30000-180000", "Solomo", R.drawable.r5));


    }
}