package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EditarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_datos);
        Button btn8 = findViewById(R.id.button12);
        btn8.setOnClickListener(view -> {
            Intent i = new Intent(this,Datos.class);
            startActivity(i);
        });
    }
}