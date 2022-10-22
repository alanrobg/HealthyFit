package com.alanrobg.healthyfit_v1;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular_IMC extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView et;
    private TextView et2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc);
        num1= (EditText)findViewById(R.id.editTextTextPersonName);
        num2=(EditText)findViewById(R.id.editTalla);
        et=(TextView)findViewById(R.id.textView8);
        et2=(TextView)findViewById(R.id.textView9);
        Button btn10 = findViewById(R.id.btnRecomend);
        btn10.setOnClickListener(view -> {
            Intent i = new Intent(this,Recomendacion.class);
            startActivity(i);
        });




    }
    public void Sumar(View view){
        String valor =num1.getText().toString();
        String valor2 =num2.getText().toString();
        int entero=Integer.parseInt(valor);
        double metro=Double.parseDouble(valor2);
       double suma =entero/(metro*metro) ;

       String resultado=String.valueOf("Su IMC  es de: " +suma+" ");
        et.setText(resultado);
        String resultado2 = null;
        if(suma <18.5){
            resultado2=String.valueOf("Usted tiene peso Insuficiente,"+"\n"+" le recomendamos los siguientes pasos ");}
        else if (suma>=18.5 || suma<=24.9){
             resultado2=String.valueOf("Usted tiene peso un Peso ideal, Puede seguir "+"\n"+"los siguientes pasos  "+"\n"+"para seguir manteniendote");
        }
        else if (suma>24.9 || suma<=29.9){
            resultado2=String.valueOf("Sobrepeso, le recomendamos los siguientes pasos");
        }
        else if (suma>30 ){
            resultado2=String.valueOf("Obeso, le recomendamos los siguientes pasos");
        }
        et2.setText(resultado2);



    }
}