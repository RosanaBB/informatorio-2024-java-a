package com.example.service;

import com.example.model.Evento;
import com.example.model.Participante;

import java.util.HashMap;
import java.util.Map;

public class ParticipanteService implements IParticipanteService {
    private Map<String, Participante> participantes = new HashMap<>();

    @Override
    public void inscribirParticipanteEnEvento(Participante participante, Evento evento) {
        if (evento.getCapacidad() > evento.getParticipantes().size()) {
            evento.getParticipantes().add(participante);
        } else {
            System.out.println("Capacidad máxima alcanzada para este evento.");
        }
    }

    @Override
    public Participante obtenerParticipantePorId(String id) {
        return participantes.get(id);
    }
}
