package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class home4 extends AppCompatActivity {

    //declaro objetos
    public Button boton_iralsitioweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);

        //referencio objetos
        boton_iralsitioweb = findViewById(R.id.boton_iralsitioweb);

        boton_iralsitioweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.adidas.com.ar") );
                startActivity(intent);
            }
        });

    }
}




