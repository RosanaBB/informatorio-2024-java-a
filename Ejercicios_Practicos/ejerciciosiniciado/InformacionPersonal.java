package ejerciciosiniciado;

/*
Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la información de:
 El nombre de su última mascota y nombre de la última película vista. Por último mostrarlo
por pantalla con el siguiente formato: “Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
 */

import java.util.Scanner;

public class InformacionPersonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre de su última mascota
        System.out.print("Ingrese el nombre de su última mascota: ");
        String nombreMascota = scanner.nextLine();

        // Solicitar al usuario que ingrese el nombre de la última película vista
        System.out.print("Ingrese el nombre de la última película vista: ");
        String nombrePelicula = scanner.nextLine();

        // Mostrar la información por pantalla en el formato solicitado
        System.out.println("Nombre de la próxima bebida: " + nombreMascota + " " + nombrePelicula);
    }
}
