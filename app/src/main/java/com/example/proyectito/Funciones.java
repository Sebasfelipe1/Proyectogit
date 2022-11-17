package com.example.proyectito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Funciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funciones);
    }
    public void Regulador_Temperatura(View v){
        Intent i = new Intent(this,Regulador_Temperatura.class);
        startActivity(i);
    }
}