package com.example.checkboxgrupob2;

//Representacion de una clase POJO (Plain Old Java Object)
public class Estudiante {
    private String nombre;
    private String apellido;
    private int celular;
    private boolean estudiante;

    public Estudiante(String nombre, String apellido, int celular, boolean esEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.estudiante = esEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular=" + celular +
                ", estudiante=" + estudiante +
                '}';
    }
}



















