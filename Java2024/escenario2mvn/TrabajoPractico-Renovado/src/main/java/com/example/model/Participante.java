package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String id;
    private String nombre;
    private String apellido;
    private String interesesCulinarios;
    private List<Evento> historialEventos;

    public Participante(String id, String nombre, String apellido, String interesesCulinarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.interesesCulinarios = interesesCulinarios;
        this.historialEventos = new ArrayList<>();
    }

    public void agregarEventoAlHistorial(Evento evento) {
        historialEventos.add(evento);
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getInteresesCulinarios() {
        return interesesCulinarios;
    }

    public void setInteresesCulinarios(String interesesCulinarios) {
        this.interesesCulinarios = interesesCulinarios;
    }

    public List<Evento> getHistorialEventos() {
        return historialEventos;
    }

    public void setHistorialEventos(List<Evento> historialEventos) {
        this.historialEventos = historialEventos;
    }
}

