package com.mycompany.naruto.model.classes;

public class Habilidad {
    private long idNinja;
    private String nombre;
    private String descripcion;

    public long getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(long idNinja) {
        this.idNinja = idNinja;
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

    @Override
    public String toString() {
        return "Habilidad{" +
                "idNinja=" + idNinja +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
