package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn1 = findViewById(R.id.btnMenu1);
        btn1.setOnClickListener(view -> {
            Intent i = new Intent(this,Calcular_IMC.class);
            startActivity(i);
        });
        Button btn2 = findViewById(R.id.btnMenu2);
        btn2.setOnClickListener(view -> {
            Intent i = new Intent(this,Historial_Peso.class);
            startActivity(i);
        });
        Button btn3 = findViewById(R.id.btnMenu3);
        btn3.setOnClickListener(view -> {
            Intent i = new Intent(this,Datos.class);
            startActivity(i);
        });
    }
}