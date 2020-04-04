package com.example.ejemplocardviewrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Usuario> listaUsuarios;

    private RecyclerView rvUsuarios;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUsuarios = findViewById(R.id.rvUsuarios);

        listaUsuarios = new ArrayList<Usuario>();

        listaUsuarios.add(new Usuario(R.drawable.icon_user_card, "Sergio P", "987654321", "sergio@hola.es"));
        listaUsuarios.add(new Usuario(R.drawable.icon_user_card, "Laura H", "123456789", "laura@hola.es"));
        listaUsuarios.add(new Usuario(R.drawable.icon_user_card, "Juan G", "435635353", "Juan@hola.es"));

        rvUsuarios.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rvUsuarios.setLayoutManager(lManager);

        adapter = new AdapterUsuario(listaUsuarios);
        rvUsuarios.setAdapter(adapter);

    }
}
