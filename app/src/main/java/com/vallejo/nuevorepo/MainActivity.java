package com.vallejo.nuevorepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ListView ListaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] fotoperfil = {
                R.drawable.cristiano2008,
                R.drawable.james2014,
                R.drawable.ronaldo2002,
                R.drawable.mbappe2022,
                R.drawable.zidane2006,
        };

        String[] nombres = {
                "Cristiano",
                "James",
                "Ronaldo",
                "Mbappe",
                "Zidane",
        };

        String[] telefonos = {
              "7777777777",
              "1010101010",
              "9999999999",
              "1010101077",
              "5555555555",
        };

        ListAdapter personas = new ListAdapter(MainActivity.this, nombres, telefonos, fotoperfil);
        ListaPersonas = (ListView) findViewById(R.id.listausuarios);
        ListaPersonas.setAdapter(personas);

        ListaPersonas.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> Lista, View Vista, int Posicion, long Id){

                Intent EnviarInfo = new Intent(MainActivity.this, UserActivity.class)
                        .putExtra("Nombre: ", nombres[Posicion])
                        .putExtra("Teléfono: ", telefonos[Posicion])
                        .putExtra("Foto de Perfil: ", fotoperfil[Posicion]);

                startActivity(EnviarInfo);
            }
        });
    }
}