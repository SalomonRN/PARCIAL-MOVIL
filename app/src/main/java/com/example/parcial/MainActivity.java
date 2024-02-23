package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;

    EditText name, lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.b_next);
        name = findViewById(R.id.id_nom);
        lastname = findViewById(R.id.id_ape);


        next.setOnClickListener(view -> {
            System.out.println("HEREEEEEEEEEEEEEE");
                Intent intent = new Intent(this, Store.class);
                intent.putExtra("Nombre", name.getText().toString());
                intent.putExtra("Apellido", lastname.getText().toString());
                startActivity(intent);
        });
    }
}