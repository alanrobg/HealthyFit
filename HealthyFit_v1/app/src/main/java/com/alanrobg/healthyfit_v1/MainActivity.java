package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn10 = findViewById(R.id.btnRegis);
        Button btn9 = findViewById(R.id.button9);
        btn10.setOnClickListener(view -> {
            Intent i = new Intent(this,Registro.class);
            startActivity(i);
        });
        btn9.setOnClickListener(view -> {
            Intent i = new Intent(this,Menu.class);
            startActivity(i);
        });
    }
}