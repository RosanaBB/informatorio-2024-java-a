package com.example.service;

import com.example.model.Resena;

import java.util.ArrayList;
import java.util.List;

public class ResenaService implements IResenaService {
    private List<Resena> resenas = new ArrayList<>();

    @Override
    public void agregarResena(Resena resena) {
        resenas.add(resena);
    }
}

