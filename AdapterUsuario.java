package com.example.ejemplocardviewrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {

    private List<Usuario> listaUsuarios;

    public AdapterUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_card_view, viewGroup, false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.ivImagen.setImageResource(listaUsuarios.get(i).getImagen());
        usuarioViewHolder.tvNombre.setText(listaUsuarios.get(i).getNombre());
        usuarioViewHolder.tvTelefono.setText(listaUsuarios.get(i).getTelefono());
        usuarioViewHolder.tvEmail.setText(listaUsuarios.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImagen;
        TextView tvNombre, tvTelefono, tvEmail;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImagen = itemView.findViewById(R.id.imagen);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
}
