package com.example.evaluacion_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class consulta extends AppCompatActivity {
    private String txt_busqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        Intent intent = getIntent();

        txt_busqueda = intent.getStringExtra("txt_busqueda");
    }
}