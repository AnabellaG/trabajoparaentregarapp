package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acercade6 extends AppCompatActivity {
    public Button boton_volveralhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade6);
        getSupportActionBar().hide();

        //referencio objetos
        boton_volveralhome = findViewById(R.id.boton_volveralhome);

        boton_volveralhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent7 = new Intent(acercade6.this,home4.class );
                startActivity(intent7);
            }
        });
    }
}
