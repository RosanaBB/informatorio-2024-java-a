package com.example.service;

import com.example.model.Evento;
import com.example.model.Participante;

public interface IParticipanteService {
    void inscribirParticipanteEnEvento(Participante participante, Evento evento);
    Participante obtenerParticipantePorId(String id);
}

