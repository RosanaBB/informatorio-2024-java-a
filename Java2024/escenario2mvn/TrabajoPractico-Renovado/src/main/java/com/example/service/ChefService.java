package com.example.service;

import com.example.model.Chef;
import com.example.model.Evento;

import java.util.HashMap;
import java.util.Map;

public class ChefService implements IChefService {
    private Map<String, Chef> chefs = new HashMap<>();

    @Override
    public void agregarChef(Chef chef) {
        chefs.put(chef.getId(), chef);
        System.out.println("Chef agregado exitosamente.");
    }

    @Override
    public Chef obtenerChefPorId(String id) {
        return chefs.get(id);
    }

    @Override
    public void asignarEventoAChef(String chefId, Evento evento) {
        Chef chef = obtenerChefPorId(chefId);
        if (chef != null) {
            chef.getEventos().add(evento);
            System.out.println("Evento asignado al chef exitosamente.");
        }
    }
}


