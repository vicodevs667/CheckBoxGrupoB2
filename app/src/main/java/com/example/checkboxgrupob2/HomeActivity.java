package com.example.checkboxgrupob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity extends AppCompatActivity {
    private TextView txtResultado;
    private Button btnCalcular;
    private Spinner spOpciones;

    private String nombre, apellido;
    private Estudiante estudiante;

    //en esta estructura vamos a contener los valores de cada opcion del combo box
    private ArrayList<String> opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        inicializarVistas();
        recibirDatosPantallaA();
        mostrarDatos();
        popularSpinner();
        btnCalcular.setOnClickListener(view -> {
            obtenerValoresSpinner();
        });
    }

    private void obtenerValoresSpinner() {
        //Informacion que pueden obtener del elemento
        //seleccionado en un spinner.
        String valor = (String) spOpciones.getSelectedItem();
        int posicion = spOpciones.getSelectedItemPosition();
        switch (valor) {
            case "Notas":
                //procedimientos
                break;
            case "Faltas":
                //procedimiento

                break;
        }
    }

    private void popularSpinner() {
        opciones = new ArrayList<>(Arrays.asList("Escoja su opcion","Notas", "Faltas"));
        opciones.add("Nueva opcion");
        //Necesitan un adaptador para convertir una fuente de datos primitivos
        //en un componente visual que pueda ser desplegado en pantalla.
        //Adaptador = puente que convierte fuentes de datos en elementos visuales
        /*
        Parametros que necesita un adaptador ya fabricado por defecto
        en este caso ese adaptador se denomina ArrayAdapter
        1: Contexto de la pantalla donde se va a dibujar el componente visual.
        2: la representación del componente visual o recurso visual que va a dibujar por cada elemento
        3: Indiquen la fuente de datos, o la estructura que contiene sus datos primitivos
         */
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_item,
                        opciones
                        );
        spOpciones.setAdapter(adaptador);
    }

    private void mostrarDatos() {
        /*txtResultado.setText("Nombre: " + estudiante.getNombre()  + "\n "
                + "Apellido: " + estudiante.getApellido() + "\n"
        );*/
        txtResultado.setText(estudiante.toString());
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
        spOpciones = findViewById(R.id.spOpciones);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    private void recibirDatosPantallaA() {
        //Paso 2: recibir los datos forma primitiva
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

        //Paso2: forma alternativa Objeto Estudiante en formato bytes
        estudiante = (Estudiante) this.getIntent().getExtras().getSerializable("objeto_estudiante");
    }
}















