package com.mycompany.naruto.model.classes;

public class Ninja {
    private long ninjaId;
    private String nombre;
    private String rango;
    private String aldea;


    public long getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(long ninjaId) {
        this.ninjaId = ninjaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "ninjaId=" + ninjaId +
                ", nombre='" + nombre + '\'' +
                ", rango='" + rango + '\'' +
                ", aldea='" + aldea + '\'' +
                '}';
    }
}
