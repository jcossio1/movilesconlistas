package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.adaptadores.AdaptadorTurismo;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.example.turistiandov2.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class listaSitiosTurismo extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaTurismo = new ArrayList<>();

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turismo);

        recyclerView = findViewById((R.id.recyclerViewSitios));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreTurismo = document.getString("nombre");
                                String descripcionTurismo = document.getString("precio");
                                String precioTurismo = document.getString("precio");
                                String telefonoTurismo = document.getString("telefono");


                                Toast.makeText(listaSitiosTurismo.this, nombreTurismo, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTurismo.this, descripcionTurismo, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTurismo.this, precioTurismo, Toast.LENGTH_SHORT).show();
                                Toast.makeText(listaSitiosTurismo.this, telefonoTurismo, Toast.LENGTH_SHORT).show();




                            }
                        } else {

                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo = new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);
        
    }

    private void llenarListaConDatos() {

        listaTurismo.add(new MoldeTurismo("Cataratas del niagara", "Steven Arango", "3225950033", "90.000", R.drawable.s11, "Me encanta este lugar tiene unas vistas maravillosas, quedé encantada me encataría volver :).", R.drawable.s1, R.drawable.es5));
        listaTurismo.add(new MoldeTurismo("Auroras boreales", "Sebastian Restrepo", "3225990033", "120.000", R.drawable.s22, "Este lugar es maravilloso, y mas si se visita de noches por las auroras tan hermosas, los guias son personas increibles, volveria una y mil veces.", R.drawable.s2, R.drawable.es5));
        listaTurismo.add(new MoldeTurismo("Nasa", "Daniel", "3225954440", "20.000", R.drawable.s33, "Ame estar en este lugar, siempre quise ser astronauta por lo que siempre fue un sueño para mi visitarlo, le doy 4 estrellas nomas pq me da miedo los aliens", R.drawable.s3, R.drawable.es4));
        listaTurismo.add(new MoldeTurismo("Area51", "Mellisa", "3225959449", "150.000", R.drawable.s44, "No recomiendo ir solo a este lugar, aparte de que no te dejan entrar, siempre te estan amenazando para que te vayas, todo muy feo >:C", R.drawable.s4, R.drawable.es1));
        listaTurismo.add(new MoldeTurismo("Los santos", "Susana", "3225954456", "10.000", R.drawable.s55, "No me la creo, nunca imagine estar en este lugar, es muy hermoso y parece sacado de una pelicula, lo recomiendo", R.drawable.s5, R.drawable.es4));

    }
}