package com.example.appcontrolpersonal;

public class clsTipoTrabajador {

    private int id;
    private String area;
    private String cargo;

    public clsTipoTrabajador(int id, String area, String cargo) {
        this.id = id;
        this.area = area;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public String getCargo() {
        return cargo;
    }
}
