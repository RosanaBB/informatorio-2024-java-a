package com.example;

import com.example.model.*;
import com.example.service.*;
import com.example.utils.FileExporter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class CookingEventsApplication {

    private EventoService eventoService = new EventoService();
    private ChefService chefService = new ChefService();
    private ParticipanteService participanteService = new ParticipanteService();
    private ResenaService resenaService = new ResenaService();
    private FileExporter fileExporter = new FileExporter();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CookingEventsApplication app = new CookingEventsApplication();
        app.run();
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear Evento");
            System.out.println("2. Inscribir Participante en Evento");
            System.out.println("3. Gestionar Chefs");
            System.out.println("4. Dejar Resena sobre Evento");
            System.out.println("5. Listar Eventos Disponibles");
            System.out.println("6. Exportar Eventos No Disponibles");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearEvento();
                    break;
                case 2:
                    inscribirParticipante();
                    break;
                case 3:
                    gestionarChefs();
                    break;
                case 4:
                    dejarResena();
                    break;
                case 5:
                    listarEventosDisponibles();
                    break;
                case 6:
                    exportarEventosNoDisponibles();
                    break;
                case 0:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void crearEvento() {
        System.out.println("Ingrese el ID del evento:");
        String id = scanner.nextLine();
        System.out.println("Ingrese el nombre del evento:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la descripción del evento:");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese la fecha y hora del evento (yyyy-MM-dd HH:mm):");
        LocalDateTime fechaHora = LocalDateTime.parse(scanner.nextLine());
        System.out.println("Ingrese la ubicación del evento:");
        String ubicacion = scanner.nextLine();
        System.out.println("Ingrese la capacidad máxima del evento:");
        int capacidadMaxima = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el ID del chef encargado:");
        String chefId = scanner.nextLine();

        Chef chef = chefService.obtenerChefPorId(chefId);
        Evento evento = new Evento(id, nombre, descripcion, fechaHora, ubicacion, capacidadMaxima, chef);
        eventoService.crearEvento(evento);
        System.out.println("Evento creado exitosamente.");
    }

    private void inscribirParticipante() {
        System.out.println("Ingrese el ID del participante:");
        String participanteId = scanner.nextLine();
        System.out.println("Ingrese el nombre del participante:");
        String nombreParticipante = scanner.nextLine();
        System.out.println("Ingrese el apellido del participante:");
        String apellidoParticipante = scanner.nextLine();
        System.out.println("Ingrese los intereses culinarios del participante:");
        String intereses = scanner.nextLine();

        Participante participante = new Participante(participanteId, nombreParticipante, apellidoParticipante, intereses);

        System.out.println("Ingrese el ID del evento al que desea inscribirse:");
        String eventoId = scanner.nextLine();
        Evento evento = eventoService.obtenerEventoPorId(eventoId);

        participanteService.inscribirParticipanteEnEvento(participante, evento);
        System.out.println("Participante inscrito exitosamente.");
    }

    private void gestionarChefs() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar Chef");
        System.out.println("2. Asignar Evento a Chef");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                agregarChef();
                break;
            case 2:
                asignarEventoAChef();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void agregarChef() {
        System.out.println("Ingrese el ID del chef:");
        String id = scanner.nextLine();
        System.out.println("Ingrese el nombre del chef:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la especialidad del chef:");
        String especialidad = scanner.nextLine();

        Chef chef = new Chef(id, nombre, especialidad);
        chefService.agregarChef(chef);
        System.out.println("Chef agregado exitosamente.");
    }

    private void asignarEventoAChef() {
        System.out.println("Ingrese el ID del chef:");
        String chefId = scanner.nextLine();
        System.out.println("Ingrese el ID del evento:");
        String eventoId = scanner.nextLine();

        Evento evento = eventoService.obtenerEventoPorId(eventoId);
        chefService.asignarEventoAChef(chefId, evento);
        System.out.println("Evento asignado al chef exitosamente.");
    }

    private void dejarResena() {
        System.out.println("Ingrese el ID de la reseña:");
        String id = scanner.nextLine();
        System.out.println("Ingrese el ID del evento:");
        String eventoId = scanner.nextLine();
        System.out.println("Ingrese el ID del participante:");
        String participanteId = scanner.nextLine();
        System.out.println("Ingrese la calificación (1-5):");
        int calificacion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el comentario:");
        String comentario = scanner.nextLine();

        Evento evento = eventoService.obtenerEventoPorId(eventoId);
        Participante participante = participanteService.obtenerParticipantePorId(participanteId);

        Resena resena = new Resena(id, evento, participante, calificacion, comentario);
        resenaService.agregarResena(resena);
        System.out.println("Reseña añadida exitosamente.");
    }

    private void listarEventosDisponibles() {
        System.out.println("Ingrese la fecha a partir de la cual listar eventos (yyyy-MM-ddTHH:mm):");
        LocalDateTime fecha = LocalDateTime.parse(scanner.nextLine());

        List<Evento> eventosDisponibles = eventoService.listarEventosDisponibles(fecha);
        eventosDisponibles.forEach(evento -> System.out.println(evento.getNombre()));
    }

    private void exportarEventosNoDisponibles() {
        System.out.println("Ingrese la fecha a partir de la cual exportar eventos (yyyy-MM-ddTHH:mm):");
        LocalDateTime fecha = LocalDateTime.parse(scanner.nextLine());

        List<Evento> eventosNoDisponibles = eventoService.listarEventosNoDisponibles(fecha);
        try {
            fileExporter.exportarEventosNoDisponibles(eventosNoDisponibles, "eventos_no_disponibles.txt");
            System.out.println("Eventos no disponibles exportados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al exportar eventos: " + e.getMessage());
        }
    }
}




