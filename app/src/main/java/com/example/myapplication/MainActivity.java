package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declaro objeto
    public Button Aceptar;
    public Button aun_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin1);

        //esconder menu
        getSupportActionBar().hide();

        //referencio objetos
        Aceptar = findViewById(R.id.Aceptar);
        aun_no = findViewById(R.id.aun_no);

        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this,home4.class );
                startActivity(intent1);
            }
        });

        aun_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this,altausuario2.class );
                startActivity(intent2);
            }
        });
    }

}



