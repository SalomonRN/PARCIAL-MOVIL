package com.example.parcial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Store extends AppCompatActivity {
    Carrito carrito = new Carrito();
    Button btn_next;
    Button btn_tomate;
    Button btn_lechuga;
    Button btn_cebolla;
    Button btn_mango;
    TextView msg;
    String mensaje;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);

        btn_next = findViewById(R.id.b_next_resum);

        btn_tomate = findViewById(R.id.btn_add_tomate);
        btn_cebolla = findViewById(R.id.btn_add_cebolla);
        btn_lechuga = findViewById(R.id.btn_add_lechuga);
        btn_mango = findViewById(R.id.btn_add_mango);


        msg = findViewById(R.id.saludo);

        Intent i = getIntent();
        mensaje = "Hola " + i.getStringExtra("Nombre") + " " + i.getStringExtra("Apellido");
        msg.setText(mensaje);


        btn_tomate.setOnClickListener(v -> {
            carrito.n_tomate += 1;
        });

        btn_cebolla.setOnClickListener(v -> {
            carrito.n_cebolla += 1;
        });

        btn_lechuga.setOnClickListener(v -> {
            carrito.n_lechuga += 1;
        });

        btn_mango.setOnClickListener(v -> {
            carrito.n_mango += 1;
        });

        btn_next.setOnClickListener(view->{
            Intent intent2 = new Intent(this, Resumen.class);
            intent2.putExtra("Nombre",  i.getStringExtra("Nombre"));
            intent2.putExtra("Apellido",  i.getStringExtra("Apellido"));
            intent2.putExtra("n_tomate", carrito.getN_tomate());
            intent2.putExtra("n_cebolla", carrito.getN_cebolla());
            intent2.putExtra("n_lechuga", carrito.getN_lechuga());
            intent2.putExtra("n_mango", carrito.getN_mango());
            startActivity(intent2);
        });


    }

}
