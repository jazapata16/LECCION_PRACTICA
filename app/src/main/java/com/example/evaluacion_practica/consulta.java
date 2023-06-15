package com.example.evaluacion_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.ArrayList;

public class consulta extends AppCompatActivity {
    private String txt_busqueda;

    private String token = "925571252058726";
    private RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        Intent intent = getIntent();

        txt_busqueda = intent.getStringExtra("txt_busqueda");
        busqueda(txt_busqueda);
    }

    public void busqueda(String txt_busqueda){

        String url_temp = "https://superheroapi.com/api/"+token+"/search/"+txt_busqueda;
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET, url_temp, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println(response);
                        try {

                            System.out.println(response.getString("results"));



                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });;
        mQueue.add(request);

    }
}