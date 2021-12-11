package com.example.appcontrolpersonal;

import java.util.Date;

public class clsContrato {
    private int id;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;

    public clsContrato(int id, String fechaEntrada,String fechaSalida, String estado){
        this.id=id;
        this.fechaSalida= fechaSalida;
        this.fechaEntrada=fechaEntrada;
        this.estado=estado;
    }

    public int getId(){return id;}
    public String getFechaEntrada(){return fechaEntrada;}
    public String getFechaSalida(){return fechaSalida;}
    public String getEstado(){return estado;}
}
