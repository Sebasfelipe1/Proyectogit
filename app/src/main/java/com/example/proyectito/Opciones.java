package com.example.proyectito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }

    public void Lecturas(View v){
        Intent i = new Intent(this,Lecturas.class);
        startActivity(i);
    }

    public void Funciones(View v){
        Intent i = new Intent(this,Funciones.class);
        startActivity(i);
    }
    public void Configuracion(View v){
        Intent i = new Intent(this,Configuracion.class);
        startActivity(i);
    }

}