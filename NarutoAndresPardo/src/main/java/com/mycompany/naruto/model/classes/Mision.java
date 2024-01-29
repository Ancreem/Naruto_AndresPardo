package com.mycompany.naruto.model.classes;

public class Mision {
    private long misionId;
    private String descripcion;
    private String rango;
    private double recompensa;

    public long getMisionId() {
        return misionId;
    }

    public void setMisionId(long misionId) {
        this.misionId = misionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "misionId=" + misionId +
                ", descripcion='" + descripcion + '\'' +
                ", rango='" + rango + '\'' +
                ", recompensa=" + recompensa +
                '}';
    }
}
