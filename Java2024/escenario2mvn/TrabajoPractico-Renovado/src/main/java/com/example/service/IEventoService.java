package com.example.service;

import com.example.model.Evento;

import java.time.LocalDateTime;
import java.util.List;

public interface IEventoService {
    void crearEvento(Evento evento);
    Evento obtenerEventoPorId(String id);
    List<Evento> listarEventosDisponibles(LocalDateTime fecha);
    List<Evento> listarEventosNoDisponibles(LocalDateTime fecha);
}
