package com.example.ejemplocardviewrecyclerview;

public class Usuario {

    private int imagen;
    private String nombre;
    private String telefono;
    private String email;

    public Usuario(int imagen, String nombre, String telefono, String email) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
