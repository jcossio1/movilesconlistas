package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    //atributos
EditText cajaNonbreusuario;
EditText cajaContrasena;

Button bontoningresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNonbreusuario = findViewById(R.id.usuario);
        cajaContrasena = findViewById(R.id.contrasena);
        bontoningresar =findViewById(R.id.ingresar);

        bontoningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //capturando datos de las cajas(editText)

                String nombreUsuario = cajaNonbreusuario.getText().toString();
                String contrasena = cajaContrasena.getText().toString();

                //abrimos una nueva actiidad

                Intent intentingresar = new Intent(login.this,Home.class);

                //pasando datos a la nueva actiidad

                intentingresar.putExtra("nombre", nombreUsuario );
                intentingresar.putExtra("contra", contrasena);

                startActivity(intentingresar);

            }
        });





    }
}