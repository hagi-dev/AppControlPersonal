package com.example.appcontrolpersonal;

public class clsPersona {
    private int id;
    private String dni;
    private String nombre;
    private String paterno;
    private String materno;
    private String genero;
    private String fechaNacimiento;
    private String urlFoto;
    private String direccion;
    private String estado;

    public clsPersona(int id, String dni, String nombre, String paterno, String materno, String genero, String fechaNacimiento,
                      String urlFoto, String direccion, String estado)
    {

        this.id=id;
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.genero=genero;
        this.fechaNacimiento=fechaNacimiento;
        this.urlFoto=urlFoto;
        this.direccion=direccion;
        this.estado= estado;

    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }
}
