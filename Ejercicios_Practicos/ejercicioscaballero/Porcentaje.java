package ejercicioscaballero;

/*
Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el porcentaje que indique el segundo
número del primer número.
 */

import java.util.Scanner;

public class Porcentaje {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número real
        System.out.print("Ingrese un número real: ");
        double numeroReal = scanner.nextDouble();

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int porcentaje = scanner.nextInt();

        // Calcular el porcentaje
        double resultado = (numeroReal * porcentaje) / 100;

        // Mostrar el resultado
        System.out.println(porcentaje + "% de " + numeroReal + " es " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

