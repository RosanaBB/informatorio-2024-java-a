package com.example.utils;

import com.example.model.Evento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileExporter {

    public void exportarEventosNoDisponibles(List<Evento> eventos, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Evento evento : eventos) {
                writer.write(evento.getNombre() + ", " + evento.getFechaHora() + ", " + evento.getUbicacion());
                writer.newLine();
            }
        }
    }
}

