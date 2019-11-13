package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume () {
        super.onResume(); // Este codigo se ejecuta antes de todo.
        // En este punto la aplicacion ya cargo.
        // This en un activity: es la escencia de una pantalla
        // This es de tipo contexto

        Toast.makeText(this,
                "Aplicación Iniciada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop () {
        super.onStop();
        Toast.makeText(this,
                "Aplicación Stopeada",
                Toast.LENGTH_LONG).show();
    }
}
