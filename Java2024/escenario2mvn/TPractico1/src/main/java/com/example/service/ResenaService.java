package com.example.service;

import com.example.model.Resena;

import java.util.ArrayList;
import java.util.List;

public class ResenaService {
    private List<Resena> resenas = new ArrayList<>();

    public void agregarResena(Resena resena) {
        resenas.add(resena);
    }
}


