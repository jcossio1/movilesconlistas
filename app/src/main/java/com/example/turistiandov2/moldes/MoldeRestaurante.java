package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {
    private String Nombre;
    private String telefono;
    private String rangoPrecio;
    private String platoRecomendado;
    private Integer foto;
    private Integer foto2;
    private Integer estrellas;
    private String reseñaRes;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, String telefono, String rangoPrecio, String platoRecomendado, Integer foto, Integer foto2, Integer estrellas, String reseñaRes) {
        Nombre = nombre;
        this.telefono = telefono;
        this.rangoPrecio = rangoPrecio;
        this.platoRecomendado = platoRecomendado;
        this.foto = foto;
        this.foto2 = foto2;
        this.estrellas = estrellas;
        this.reseñaRes = reseñaRes;
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

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }

    public String getReseñaRes() {
        return reseñaRes;
    }

    public void setReseñaRes(String reseñaRes) {
        this.reseñaRes = reseñaRes;
    }
}
