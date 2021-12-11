package com.example.appcontrolpersonal;

public class clsHorario {
    private int id;
    private String detalle;
    private String entrada;
    private String salida;
    private String inicioReceso;
    private String finReceso;
    private String estado;
    private String dirigido;

    public clsHorario(int id, String detalle, String entrada, String salida, String inicioReceso, String finReceso, String estado, String dirigido) {
        this.id = id;
        this.detalle = detalle;
        this.entrada = entrada;
        this.salida = salida;
        this.inicioReceso = inicioReceso;
        this.finReceso = finReceso;
        this.estado = estado;
        this.dirigido = dirigido;
    }

    public int getId() {
        return id;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public String getInicioReceso() {
        return inicioReceso;
    }

    public String getFinReceso() {
        return finReceso;
    }

    public String getEstado() {
        return estado;
    }

    public String getDirigido() {
        return dirigido;
    }
}
