package com.example.proyectofinalandorid.utils;

import java.io.Serializable;

public class Serie extends Pelicula implements Serializable {
    private String nombre,descripcion,imagen,fechaDeLanzamineto;
    private int votos,popularidad;

    public Serie(String nombre, String descripcion, String imagen, String fechaDeLanzamineto, int votos, int popularidad) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fechaDeLanzamineto = fechaDeLanzamineto;
        this.votos = votos;
        this.popularidad = popularidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFechaDeLanzamineto() {
        return fechaDeLanzamineto;
    }

    public void setFechaDeLanzamineto(String fechaDeLanzamineto) {
        this.fechaDeLanzamineto = fechaDeLanzamineto;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
}
