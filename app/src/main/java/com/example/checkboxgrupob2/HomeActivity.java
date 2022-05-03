package com.example.checkboxgrupob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView txtResultado;

    private String nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inicializarVistas();
        recibirDatosPantallaA();
        mostrarDatos();
    }

    private void mostrarDatos() {
        txtResultado.setText("Nombre: " + nombre  + "\n "
                + "Apellido: " + apellido + "\n"
        );
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
    }

    private void recibirDatosPantallaA() {
        //Paso 2: recibir los datos
        /*
        Para recibir los datos, las pantallas involucradas en el INTENT
        saben o conocen la referencia de este....
        entonces la idea es obtener ese Intent, de ese intent obtener
        el archivo EXTRAS, y de ese archivo obtener un registro en particular
        al obtener tienen que indicar que tipo de dato es ej: getString, getInt
        y como parametro le pasan la llave del registro.
         */
        nombre = this.getIntent().getExtras().getString("nombre_persona","");
        apellido = this.getIntent().getExtras().getString("apellido_persona", "");
    }
}