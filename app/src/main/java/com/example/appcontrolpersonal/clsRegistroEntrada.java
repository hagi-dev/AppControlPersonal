package com.example.appcontrolpersonal;

public class clsRegistroEntrada{

    private int id;
    private String horaEntrada;
    private String  justificacion;
    private int idJornada;
    private int idContrato;

    public clsRegistroEntrada(int id, String horaEntrada, String justificacion, int idJornada, int idContrato) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.justificacion = justificacion;
        this.idJornada = idJornada;
        this.idContrato = idContrato;
    }

    public int getId() {
        return id;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public int getIdContrato() {
        return idContrato;
    }
}

