package ejerciciosmaestro;

/*
Cálculo de la fuerza centrípeta: Escribir un programa en Java que calcule la fuerza centrípeta necesaria para mantener
un objeto en una trayectoria circular, dados su masa, la velocidad angular y el radio de la trayectoria. Utilizar la
fórmula: F_c = m * v^2 / r, donde F_c es lafuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r
es el radio de la trayectoria. Muestre el resultado por pantalla.
 */

import java.util.Scanner;

public class CalculoFuerzaCentripeada {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de objetos
        System.out.print("Ingrese la cantidad de objetos: ");
        int cantidad = scanner.nextInt();

        // Crear arreglos para almacenar la masa, la velocidad angular y el radio de cada objeto
        double[] masas = new double[cantidad];
        double[] velocidadesAngulares = new double[cantidad];
        double[] radios = new double[cantidad];

        // Solicitar al usuario que ingrese la masa, la velocidad angular y el radio para cada objeto
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la masa del objeto " + (i + 1) + " (en kg): ");
            masas[i] = scanner.nextDouble();

            System.out.print("Ingrese la velocidad angular del objeto " + (i + 1) + " (en m/s): ");
            velocidadesAngulares[i] = scanner.nextDouble();

            System.out.print("Ingrese el radio de la trayectoria del objeto " + (i + 1) + " (en m): ");
            radios[i] = scanner.nextDouble();
        }

        // Calcular y mostrar la fuerza centrípeta para cada objeto
        for (int i = 0; i < cantidad; i++) {
            double masa = masas[i];
            double velocidadAngular = velocidadesAngulares[i];
            double radio = radios[i];
            double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

            System.out.println("La fuerza centrípeta para el objeto " + (i + 1) + " es: " + fuerzaCentripeta + " Newtons.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

