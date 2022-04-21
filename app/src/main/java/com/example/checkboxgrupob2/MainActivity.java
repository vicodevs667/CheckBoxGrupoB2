package com.example.checkboxgrupob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    //Atroibutos -> componentes visuales
    private EditText etNombre, etApellido, etCelular;
    private Button btnRegistrar;
    private Switch swEstudiante;

    //Atributos generales
    private Estudiante estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //TODO botones

    }

    private void inicializarVistas() {
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etCelular = findViewById(R.id.etCelular);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        swEstudiante = findViewById(R.id.swEstudiante);
    }

    private void obtenerInformacion() {
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        int celular = Integer.parseInt(etCelular.getText().toString());
        //en el switch o checbox ustedes quieren obtener el valor
        //cuando el elemento ha sido marcado y eso es un atributo
        //llamado checked
        //en valores booleanos el get cambia por is por temas del ingles
        boolean esEstudiante = swEstudiante.isChecked();
        estudiante = new Estudiante(nombre, apellido, celular, esEstudiante);
    }
}













