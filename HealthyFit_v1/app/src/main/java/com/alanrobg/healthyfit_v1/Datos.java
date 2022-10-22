package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Button btn8 = findViewById(R.id.btnEditar);
        btn8.setOnClickListener(view -> {
            Intent i = new Intent(this,EditarDatos.class);
            startActivity(i);
        });
        Button btn9 = findViewById(R.id.btnHome);
        btn9.setOnClickListener(view -> {
            Intent i = new Intent(this,Menu.class);
            startActivity(i);
        });
    }
}