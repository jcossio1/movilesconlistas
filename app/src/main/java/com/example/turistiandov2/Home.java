package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //zon atributos
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    TextView nombrecliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String nombre = getIntent().getStringExtra("nombre");


        botonHoteles =findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurante);
        botonTurismo=findViewById(R.id.botonturismo);

        nombrecliente=findViewById(R.id.cliente);

        //enlazando el puextra con el textview

        nombrecliente.setText(nombre);

        //detectando eventos

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles  = new  Intent(Home.this,HotelesHome.class);
                startActivity(intentHoteles)
;            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRestaurante  = new  Intent(Home.this,RestaurantesHome.class);
                startActivity(intentRestaurante)
                ;            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTurismo  = new  Intent(Home.this,Turismo.class);
                startActivity(intentTurismo)
                ;            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public void cambiaIdioma(String idioma){
        //configurar elk lenguaje del telefono

        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuramos globalmente el telefono

        Configuration configuraciontelefono = getResources().getConfiguration();
        configuraciontelefono.locale=lenguaje;

        //ejevutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuraciontelefono,getBaseContext().getResources().getDisplayMetrics());

    }


    public  boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado = item.getItemId();
        switch (itemSeleccionado){
            case (R.id.opcion1):
                 this.cambiaIdioma("en");
                 Intent intentIngles = new Intent(Home.this,Home.class);
                 startActivity(intentIngles);
                break;
            case (R.id.opcion2):
                this.cambiaIdioma("it");
                Intent intentItaliano = new Intent(Home.this,Home.class);
                startActivity(intentItaliano);
                break;
            case (R.id.opcion3):
                this.cambiaIdioma("es");
                Intent intentespanol = new Intent(Home.this,Home.class);
                startActivity(intentespanol);
                break;
            case (R.id.opcion4):
                Intent intent = new Intent(Home.this,acerca.class);
                startActivity(intent);

                break;

        }

        return super.onOptionsItemSelected(item);

    }

    public void cambiaIdioma(){}

}