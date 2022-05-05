package com.example.checkboxgrupob2;

import java.io.Serializable;

//Representacion de una clase POJO (Plain Old Java Object)
//Interfaz marcador: Serializable
public class Estudiante implements Serializable {
    private String nombre;
    private String apellido;
    private int celular;
    private String email;
    private int codigoEstudiante;

    public Estudiante(String nombre, String apellido, int celular, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular=" + celular +
                ", email='" + email + '\'' +
                ", codigoEstudiante=" + codigoEstudiante +
                '}';
    }
}



















