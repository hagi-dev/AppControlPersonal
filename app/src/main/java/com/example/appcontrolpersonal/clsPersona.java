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
    private String telefono;
    private int edad;

    public clsPersona(int id, String dni, String nombre, String paterno, String materno, String genero, String fechaNacimiento,
                      String urlFoto, String direccion, String estado, String telefono, int edad)
    {

        this.id=id;
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.genero=genero;
        this.fechaNacimiento=fechaNacimiento;
        this.urlFoto=urlFoto;
        this.direccion=direccion;
        this.estado= estado;
        this.telefono=telefono;

    }
    public clsPersona(){}

    public String getTelefono() {return telefono;}

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre+' '+ paterno;
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

    public String getEdad() {
        return String.valueOf(edad);
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
