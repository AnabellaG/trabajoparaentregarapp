package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quienesomos5 extends AppCompatActivity {

    public Button boton_github;
    public Button botonllamar;
    public Button boton_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienesomos5);

        getSupportActionBar().hide();
        //Rerefencio objetos


        //referencio objetos
        boton_github = findViewById(R.id.boton_github);
        botonllamar = findViewById(R.id.botonllamar);
        boton_volver = findViewById(R.id.boton_volver);

        //metodo boton volver al home
        boton_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent12 = new Intent(quienesomos5.this,home4.class );
                startActivity(intent12);
            }
        });

        //metodo boton github
        boton_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/anabellag"));
                startActivity(intent6);
            }
        });


        //metodo boton llamar
        boton_github.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel://1133022443"));

                if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    Activity#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for Activity#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }
        });
    }
}
