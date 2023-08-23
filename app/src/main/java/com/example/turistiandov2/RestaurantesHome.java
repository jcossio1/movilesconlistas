package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantesHome extends AppCompatActivity {

    Button botonVerMas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_home);

        botonVerMas= findViewById(R.id.restavermas);

        botonVerMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListaRestaurante = new Intent(RestaurantesHome.this, lista_restaurante.class);
            startActivity(intentListaRestaurante);
            }
        });
    }
}