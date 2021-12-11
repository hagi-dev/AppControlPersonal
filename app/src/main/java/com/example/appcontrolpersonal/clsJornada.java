package com.example.appcontrolpersonal;

public class clsJornada {
    private int id;
    private String fechaLaboral;
    private String observacion;
    private String asistencia;
    private int idContrato;

    public clsJornada(int id, String fechaLaboral, String observacion, String asistencia, int idContrato) {
        this.id = id;
        this.fechaLaboral = fechaLaboral;
        this.observacion = observacion;
        this.asistencia = asistencia;
        this.idContrato = idContrato;
    }

    public int getId() {
        return id;
    }

    public String getFechaLaboral() {
        return fechaLaboral;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public int getIdContrato() {
        return idContrato;
    }
}
