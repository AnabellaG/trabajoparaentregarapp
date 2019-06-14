package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class condicionesdeuso3 extends AppCompatActivity {


    //declaro objeto
    public Button boton_aceptarcondiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicionesdeuso3);
        getSupportActionBar().hide();


        //referencio objetos
        boton_aceptarcondiciones = findViewById(R.id.boton_aceptarcondiciones);

        boton_aceptarcondiciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = new Intent(condicionesdeuso3.this,home4.class );
                startActivity(intent5);
            }
        });
    }
}
