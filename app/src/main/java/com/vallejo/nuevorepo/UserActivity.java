package com.vallejo.nuevorepo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity {
    String nombre, telefono;
    int imagen;
    CircleImageView foto;
    TextView textoNombre, textotelefono;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        textoNombre = findViewById(R.id.nombre);
        textotelefono = findViewById(R.id.telefono);
        foto = findViewById(R.id.fotoperfil);

        Intent recibir = this.getIntent();
        if(recibir != null){
            nombre = recibir.getStringExtra("Nombre: ");
            telefono = recibir.getStringExtra("Telefono: ");
            imagen = recibir.getIntExtra("Foto de Perfil: ", R.drawable.cristiano2008);

            //Asignar el nombre y el telefono al TextView correspondiente
            //La imagen al CircleImageView
        }
    }
}