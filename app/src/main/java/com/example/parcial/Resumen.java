package com.example.parcial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Resumen extends AppCompatActivity {
    TextView txt_nombre;
    TextView txt_apellido;
    TextView txt_tomate;
    TextView txt_cebolla;
    TextView txt_lechuga;
    TextView txt_mangos;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen);

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_apellido = findViewById(R.id.txt_apellido);
        txt_tomate = findViewById(R.id.Total_Tomates);
        txt_cebolla = findViewById(R.id.total_cebolla);
        txt_lechuga = findViewById(R.id.total_lechuga);
        txt_mangos = findViewById(R.id.total_mangos);

        Intent i3 = getIntent();
        String msg = "Nombre: " + i3.getStringExtra("Nombre");
        String msg2 = "Apellido: " + i3.getStringExtra("Apellido");
        String msg3 =  "Total Tomates: " + i3.getIntExtra("n_tomate", 0);
        String msg4 = "Total Lechuga: " + i3.getIntExtra("n_lechuga", 0);
        String msg5 = "Total Mangos: " + i3.getIntExtra("n_mango", 100);
        String msg6 = "Total Cebollas " + i3.getIntExtra("n_cebolla", 0);



        txt_nombre.setText(msg);
        txt_apellido.setText(msg2);
        txt_tomate.setText(msg3);
        txt_lechuga.setText(msg4);
        txt_mangos.setText(msg5);
        txt_cebolla.setText(msg6);

    }
}

