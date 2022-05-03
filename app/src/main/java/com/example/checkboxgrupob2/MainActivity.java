package com.example.checkboxgrupob2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private String nombre;
    private String apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        etCodigo.setVisibility(View.GONE);
        btnRegistrar.setOnClickListener(view -> {
            obtenerInformacion();
            pasarOtraPantalla();
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

    //Manejo del Componente llamado INTENT
    private void pasarOtraPantalla() {
        /*
        Cuando se quiere navegar de una pantalla A a otra pantalla B
        se debe hacer uso del componente llamado INTENT
        el mismo se comporta como el criterio de querer responder
        a una intencion o deseo en terminos simples
        Si la intencion se puede resolver pues logramos el objetivo
        y un metodo en especifico lanzara la siguiente pantalla.
        Para configurar un INTENT en este sentido, se debe crear
        una instancia de la clase Intent y en su constructor
        indicarle de donde a donde quieren ir, pero deben ser referenciadas
        en conceptos del contexto de la clase que representa a esa pantalla
         */
        Intent intencion = new Intent(this, HomeActivity.class);
        /*
        Quieren pasar datos a otra pantalla
        Usar el Intent
        en el Intent -> configurar un archivo temporal
        archivo temporal -> guarda registro en un formato.
        ese formato se conoce como: CLAVE(key) -> VALOR(value)
        ejemplo: .putExtra("llave"(clave), valor(primitiva))
        El archivo pueden entenderlo que se llama EXTRAS
        y cada registro que crean se es un EXTRA
        La llave debe ser una cadena STRING unica
         */
        //Paso 1: pasar datos
        intencion.putExtra("nombre_persona", nombre);
        intencion.putExtra("apellido_persona", apellido);
        startActivity(intencion);
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
        nombre = etNombre.getText().toString();
        apellido = etApellido.getText().toString();
        //String email = etEmail.getText().toString();
        //int celular = Integer.parseInt(etCelular.getText().toString());
        //en el switch o checbox ustedes quieren obtener el valor
        //cuando el elemento ha sido marcado y eso es un atributo
        //llamado checked
        //en valores booleanos el get cambia por is por temas del ingles
        //boolean esEstudiante = swEstudiante.isChecked();
       //estudiante = new Estudiante(nombre, apellido, celular, email);
    }
}













