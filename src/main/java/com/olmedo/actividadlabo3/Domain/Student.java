package com.olmedo.actividadlabo3.Domain;

public class Student {
    private String nombre;
    private String apellido;
    private String fechaEntrada;
    private String carrera;
    private Boolean estado;

    public Student(String nombre, String apellido, String fechaEntrada, String carrera, Boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaEntrada = fechaEntrada;
        this.carrera = carrera;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Student() {
    }
}
