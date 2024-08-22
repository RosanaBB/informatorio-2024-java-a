package com.example.service;

import com.example.model.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventoService {
    private Map<String, Evento> eventos = new HashMap<>();

    public void crearEvento(Evento evento) {
        eventos.put(evento.getId(), evento);
    }

    public Evento obtenerEventoPorId(String id) {
        return eventos.get(id);
    }

    public List<Evento> listarEventosDisponibles(LocalDateTime fecha) {
        List<Evento> disponibles = new ArrayList<>();
        for (Evento evento : eventos.values()) {
            if (evento.getFechaHora().isAfter(fecha) && evento.getCapacidad() > evento.getParticipantes().size()) {
                disponibles.add(evento);
            }
        }
        return disponibles;
    }

    public List<Evento> listarEventosNoDisponibles(LocalDateTime fecha) {
        List<Evento> noDisponibles = new ArrayList<>();
        for (Evento evento : eventos.values()) {
            if (evento.getFechaHora().isBefore(fecha) && evento.getCapacidad() <= evento.getParticipantes().size()) {
                noDisponibles.add(evento);
            }
        }
        return noDisponibles;
    }
}


