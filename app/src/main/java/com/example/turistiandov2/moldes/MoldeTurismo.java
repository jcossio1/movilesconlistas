package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {

    private String nombre;
    private String contacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String reseñaTurismo;
    private Integer foto2;
    private Integer estrellasTurism;

    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String contacto, String telefono, String precio, Integer foto, String reseñaTurismo, Integer foto2, Integer estrellasTurism) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.reseñaTurismo = reseñaTurismo;
        this.foto2 = foto2;
        this.estrellasTurism = estrellasTurism;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getReseñaTurismo() {
        return reseñaTurismo;
    }

    public void setReseñaTurismo(String reseñaTurismo) {
        this.reseñaTurismo = reseñaTurismo;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public Integer getEstrellasTurism() {
        return estrellasTurism;
    }

    public void setEstrellasTurism(Integer estrellasTurism) {
        this.estrellasTurism = estrellasTurism;
    }
}
