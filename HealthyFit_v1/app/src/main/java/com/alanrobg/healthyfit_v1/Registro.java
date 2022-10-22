package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import  android.database.sqlite.SQLiteDatabase;

public class Registro extends AppCompatActivity {
    Database myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myDb= new Database(this);
        SQLiteDatabase database =  myDb.getWritableDatabase();
        setContentView(R.layout.activity_registro);
        Button btn9 = findViewById(R.id.btnRegis2);
        btn9.setOnClickListener(view -> {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        });
    }

}