package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Historial_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_imc);

        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(view -> {
            Intent i = new Intent(this,Menu.class);
            startActivity(i);
        });
        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(view -> {
            Intent i = new Intent(this,Datos.class);
            startActivity(i);
        });
    }
}