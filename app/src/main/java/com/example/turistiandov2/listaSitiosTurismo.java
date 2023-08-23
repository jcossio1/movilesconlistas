package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.adaptadores.AdaptadorTurismo;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.example.turistiandov2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class listaSitiosTurismo extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaTurismo = new ArrayList<>();

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turismo);

        recyclerView = findViewById((R.id.recyclerViewSitios));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo = new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);
        
    }

    private void llenarListaConDatos() {

        listaTurismo.add(new MoldeTurismo("Cataratas del niagara", "Steven Arango", "3225950033", "90.000", R.drawable.s1));
        listaTurismo.add(new MoldeTurismo("Auroras boreales", "Sebastian Restrepo", "3225990033", "120.000", R.drawable.s2));
        listaTurismo.add(new MoldeTurismo("Nasa", "Daniel", "3225954440", "20.000", R.drawable.s3));
        listaTurismo.add(new MoldeTurismo("Area51", "Mellisa", "3225959449", "150.000", R.drawable.s4));
        listaTurismo.add(new MoldeTurismo("Los santos", "Susana", "3225954456", "10.000", R.drawable.s5));

    }
}