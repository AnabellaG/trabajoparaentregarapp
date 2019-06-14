package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;
import java.util.zip.Inflater;

public class home4 extends AppCompatActivity {

    //declaro objetos
    public Button boton_iralsitioweb;
    public Button boton_acercede;
    public Button boton_quienes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);

        //referencio objetos
        boton_iralsitioweb = findViewById(R.id.boton_iralsitioweb);
        boton_quienes = findViewById(R.id.boton_quienes);
        boton_acercede = findViewById(R.id.boton_acercade);

        boton_acercede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent8 = new Intent(home4.this,acercade6.class );
                startActivity(intent8);
            }
        });
        boton_quienes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent9 = new Intent(home4.this,quienesomos5.class );
                startActivity(intent9);
            }
        });

        boton_iralsitioweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.adidas.com.ar") );
                startActivity(intent);
            }
        });












    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater = getMenuInflater();
        Inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

    }*/

}




