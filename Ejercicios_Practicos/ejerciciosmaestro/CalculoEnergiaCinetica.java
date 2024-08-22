package ejerciciosmaestro;

/*
Cálculo de la energía cinética: Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad. Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética,
m es la masa del objeto y v es la velocidad. Muestre el resultado por pantalla.
 */

import java.util.Scanner;

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de objetos
        System.out.print("Ingrese la cantidad de objetos: ");
        int cantidad = scanner.nextInt();

        // Crear arreglos para almacenar la masa y la velocidad de cada objeto
        double[] masas = new double[cantidad];
        double[] velocidades = new double[cantidad];

        // Solicitar al usuario que ingrese la masa y la velocidad para cada objeto
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la masa del objeto " + (i + 1) + " (en kg): ");
            masas[i] = scanner.nextDouble();

            System.out.print("Ingrese la velocidad del objeto " + (i + 1) + " (en m/s): ");
            velocidades[i] = scanner.nextDouble();
        }

        // Calcular y mostrar la energía cinética para cada objeto
        for (int i = 0; i < cantidad; i++) {
            double masa = masas[i];
            double velocidad = velocidades[i];
            double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

            System.out.println("La energía cinética del objeto " + (i + 1) + " es: " + energiaCinetica + " Joules.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

