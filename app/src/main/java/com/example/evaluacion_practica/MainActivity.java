package com.example.evaluacion_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt_busqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscarheroe(View view){
        txt_busqueda= findViewById(R.id.txt_busqueda);

        String texto = txt_busqueda.getText().toString();

        Intent intent = new Intent(this,consulta.class);
        intent.putExtra("txt_busqueda", texto);
    }


}