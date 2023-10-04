package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.example.turistiandov2.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class lista_restaurante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurante = new ArrayList<>();

    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);

        recyclerView = findViewById((R.id.recyclerViewRestaurantes));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreRestaurante = document.getString("nombre");
                                String descripcionRestaurante = document.getString("precio");
                                String precioRestaurante = document.getString("precio");
                                String telefonoRestaurante = document.getString("telefono");
                                String platoRestaurante = document.getString("platilloTipico");


                                Toast.makeText(lista_restaurante.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(lista_restaurante.this, descripcionRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(lista_restaurante.this, precioRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(lista_restaurante.this, telefonoRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(lista_restaurante.this, platoRestaurante, Toast.LENGTH_SHORT).show();





                            }
                        } else {

                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(listaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);
    }

    private void llenarListaConDatos() {

        listaRestaurante.add(new MoldeRestaurante("desde la raiz", "3225950033", "$15000-60000", "Arepa de huevo", R.drawable.r1, R.drawable.re11, R.drawable.es5,"Visite colombia en mis vacaciones y me recomendaron visitar este Lugar, Definitivamente los extrañare ! El servicio de las chicas es excelente y la comida demasiado sabrosa."));
        listaRestaurante.add(new MoldeRestaurante("Energy", "3226667733", "$20000-100000", "ceviche", R.drawable.r2, R.drawable.re22, R.drawable.es1,"Pésima atención, una de las personas que cobro, nublo la experiencia, grosera ,displicente, agresiva.\n" +
                "No incluyeron algo en la cuenta,y en forma muy grosera y mal educada, se nos acerco y exigió pagar , nosotros no sabiamos, que no habían incluido ese rublo."));

        listaRestaurante.add(new MoldeRestaurante("ThinkStation", "3226799973", "$22000-90000", "Carne de burro", R.drawable.r3, R.drawable.re33, R.drawable.es2,"Todos las veces que he venido he disfrutado de la comida y del ambiente de este lugar. Desafortunadamente la ultima vez el servicio al cliente dejo mucho que desear."));

        listaRestaurante.add(new MoldeRestaurante("Amper", "3229890044", "$18000-60000", "caviar", R.drawable.r4, R.drawable.re44, R.drawable.es3,"delicioso tdo excelente la comida el servicio todo, un lugar q sin duda tienen q visita"));

        listaRestaurante.add(new MoldeRestaurante("Galeria", "3228944433", "$30000-180000", "Solomo", R.drawable.r5, R.drawable.re44, R.drawable.es4,"Un lugar con un ambiente tranquilo y perfecto para venir con tu pareja. Los platos son deliciosos y manejan muy bien los tiempos."));


    }
}