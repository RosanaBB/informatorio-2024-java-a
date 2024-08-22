package ejerciciosmaestro;

/*
Cálculo de la media aritmética: Escribir un programa en Java que calcule la media aritmética de un conjunto de números.
Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son los números y k es el número total de
elementos. Utilicen variables y constantes según corresponda. Muestre el resultado por pantalla.
 */

import java.util.Scanner;

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        // Crear un arreglo para almacenar los números
        double[] numeros = new double[cantidad];

        // Solicitar al usuario que ingrese los números
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += numeros[i];
        }

        // Calcular la media aritmética
        double media = suma / cantidad;

        // Mostrar el resultado
        System.out.println("La media aritmética es: " + media);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

