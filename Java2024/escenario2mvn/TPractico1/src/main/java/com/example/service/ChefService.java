package com.example.service;

import com.example.model.Chef;
import com.example.model.Evento;

import java.util.HashMap;
import java.util.Map;

public class ChefService {
    private Map<String, Chef> chefs = new HashMap<>();

    public void agregarChef(Chef chef) {
        chefs.put(chef.getId(), chef);
    }

    public Chef obtenerChefPorId(String id) {
        return chefs.get(id);
    }

    public void asignarEventoAChef(String chefId, Evento evento) {
        Chef chef = obtenerChefPorId(chefId);
        if (chef != null) {
            chef.getEventos().add(evento);
        }
    }
}


