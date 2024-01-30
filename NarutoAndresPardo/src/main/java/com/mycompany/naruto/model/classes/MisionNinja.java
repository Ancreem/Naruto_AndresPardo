package com.mycompany.naruto.model.classes;

import java.time.LocalDate;

public class MisionNinja {
    private long misionNinjaId;
    private long idMision;
    private long idNinja;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;

    public MisionNinja() {
    }

    public MisionNinja(String estado) {
        this.estado = estado;
    }

    public MisionNinja(long misionNinjaId, long idMision, long idNinja, LocalDate fechaInicio, LocalDate fechaFin, String estado) {
        this.misionNinjaId = misionNinjaId;
        this.idMision = idMision;
        this.idNinja = idNinja;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getMisionNinjaId() {
        return misionNinjaId;
    }

    public void setMisionNinjaId(long misionNinjaId) {
        this.misionNinjaId = misionNinjaId;
    }

    public long getIdMision() {
        return idMision;
    }

    public void setIdMision(long idMision) {
        this.idMision = idMision;
    }

    public long getIdNinja() {
        return idNinja;
    }

    public void setIdNinja(long idNinja) {
        this.idNinja = idNinja;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    @Override
    public String toString() {
        return "MisionNinja{" +
                "misionNinjaId=" + misionNinjaId +
                ", idMision=" + idMision +
                ", idNinja=" + idNinja +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", estado='" + estado + '\'' +
                '}';
    }

}
