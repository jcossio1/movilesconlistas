package com.example.turistiandov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turistiandov2.adaptadores.AdaptadorHotel;
import com.example.turistiandov2.adaptadores.AdaptadorRestaurante;
import com.example.turistiandov2.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHotel = new ArrayList<>();

    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerView = findViewById((R.id.recyclerViewHoteles));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel = document.getString("nombre");
                                String descripcionHotel = document.getString("descripcion");
                                String precioHotel = document.getString("precio");
                                String telefonoHotel = document.getString("telefono");

                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();


                            }
                        } else {

                        }
                    }
                });


        llenarListaConDatos();
        AdaptadorHotel adaptadorHotel = new AdaptadorHotel(listaHotel);
        recyclerView.setAdapter(adaptadorHotel);
    }



    private void llenarListaConDatos() {

        listaHotel.add(new MoldeHotel("Tradiciones Café Hotel", "$80.000", "3225950033", R.drawable.h1, "hotel hermoso y agradable, muy buena atención por parte del personal, las camas y las toallas estan limpias y el servicio de limpieza es bueno.", R.drawable.h11, R.drawable.es4 ));
        listaHotel.add(new MoldeHotel("Hotel el volado", "$20.000", "3225958080", R.drawable.h2, "El hotel es pequeño, no hay mucho espacio en las habitaciones, no cuenta con un servicio atento y huele a humedad.", R.drawable.h22, R.drawable.es2 ));
        listaHotel.add(new MoldeHotel("Garavito Hotel", "$100.000", "3224569033", R.drawable.h3 , "Hotel tiene habitaciones amplias y limpias cuenta con una piscina y sauna totalmente satisfecha", R.drawable.h33, R.drawable.es5 ));
        listaHotel.add(new MoldeHotel("Fragancia Hotel", "$120.000", "323590357", R.drawable.h4 , "Es un lugar muy acogedor y muy calido, el hotel visualmente es muy lindo, sus camas son comodas y siempre estan limpias", R.drawable.h44, R.drawable.es4));
        listaHotel.add(new MoldeHotel("Camino a santafe Hotel", "$87.000", "3225950033", R.drawable.h5 , "El hotel es muy grande, cuenta con un restaurante de servicio libre con comida muy rica, se puede socializar muy facilmente en este hotel por ser algo abierto, pero con privacidad.", R.drawable.h55, R.drawable.es4));


    }
}




