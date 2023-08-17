package com.example.turistiandov2.moldes;

public class MoldeRestaurante {
    private String Nombre;
    private String telefono;
    private String rangoPrecio;
    private String platoRecomendado;
    private Integer foto;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, String telefono, String rangoPrecio, String platoRecomendado, Integer foto) {
        Nombre = nombre;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.platoRecomendado = platoRecomendado;
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return rangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    public String getPlatoRecomendado() {
        return platoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        this.platoRecomendado = platoRecomendado;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
