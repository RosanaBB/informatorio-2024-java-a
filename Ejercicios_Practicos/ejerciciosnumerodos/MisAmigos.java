package ejerciciosnumerodos;

/*
Mis amigos : Guarde en variables el nombre de N cantidad de amigos, itere sobre esa cantidad mostrando el nombre
de cada amigo.
 */

import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de amigos
        System.out.print("Ingrese el número de amigos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del número

        // Crear un array para almacenar los nombres
        String[] amigos = new String[cantidad];

        // Leer los nombres de los amigos
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            amigos[i] = scanner.nextLine();
        }

        // Mostrar los nombres de los amigos
        System.out.println("\nLos nombres de tus amigos son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(amigos[i]);
        }

        scanner.close();
    }
}

