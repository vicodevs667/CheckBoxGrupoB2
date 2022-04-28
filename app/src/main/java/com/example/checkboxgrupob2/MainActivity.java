package com.example.checkboxgrupob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Atroibutos -> componentes visuales
    private EditText etNombre, etApellido, etCelular, etEmail, etCodigo;
    private Button btnRegistrar;
    private Switch swEstudiante;

    //Atributos generales
    private Estudiante estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        etCodigo.setVisibility(View.GONE);
        btnRegistrar.setOnClickListener(view -> {

        });
        //Evento cambio de Marcado para Checkboxes y Switches
        //Listener para estar atento al cambio de marcado del Switch
        swEstudiante.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                gestionarCodigoView(b);
            }
        });
        //Toast.makeText(this, "Creando", Toast.LENGTH_SHORT).show();

    }

    private void gestionarCodigoView(boolean marcado) {
        if(marcado) {
            etCodigo.setVisibility(View.VISIBLE);
        } else {
            etCodigo.setVisibility(View.GONE);
        }
    }

    private void mostrarMensaje(boolean b) {
        String mensaje = "no estoy marcado";
        if(b) {
            mensaje = "estoy marcado";
        }
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Toast.makeText(this,"Empezando",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this,"estoy corriendo",Toast.LENGTH_SHORT).show();
    }

    private void inicializarVistas() {
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etCelular = findViewById(R.id.etCelular);
        etEmail = findViewById(R.id.etEmail);
        etCodigo = findViewById(R.id.etCodigo);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        swEstudiante = findViewById(R.id.swEstudiante);
    }

    private void obtenerInformacion() {
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String email = etEmail.getText().toString();
        int celular = Integer.parseInt(etCelular.getText().toString());
        //en el switch o checbox ustedes quieren obtener el valor
        //cuando el elemento ha sido marcado y eso es un atributo
        //llamado checked
        //en valores booleanos el get cambia por is por temas del ingles
        boolean esEstudiante = swEstudiante.isChecked();
        estudiante = new Estudiante(nombre, apellido, celular, email);
    }
}













