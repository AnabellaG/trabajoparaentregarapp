package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class altausuario2 extends AppCompatActivity {

    //declaro objeto
    public Button boton_siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altausuario2);
        getSupportActionBar().hide();

        //referencio objetos
        boton_siguiente = findViewById(R.id.boton_siguiente);

        boton_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(altausuario2.this,condicionesdeuso3.class );
                startActivity(intent3);
            }
        });

    }
}
