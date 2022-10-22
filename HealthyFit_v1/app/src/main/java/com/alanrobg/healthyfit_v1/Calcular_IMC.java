package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Calcular_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc);

        Button btn10 = findViewById(R.id.btnRecomend);
        btn10.setOnClickListener(view -> {
            Intent i = new Intent(this,Recomendacion.class);
            startActivity(i);
        });
    }
}