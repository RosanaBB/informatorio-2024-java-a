package com.example.service;

import com.example.model.Chef;
import com.example.model.Evento;

public interface IChefService {
    void agregarChef(Chef chef);
    Chef obtenerChefPorId(String id);
    void asignarEventoAChef(String chefId, Evento evento);
}

