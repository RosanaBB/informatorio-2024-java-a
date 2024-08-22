package ejercicioscaballero;

/*
Conversión de dólares a pesos: Escribir un programa en Java que solicite al usuario una cantidad en dólares y
muestre el equivalente en pesos, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de
 1 dólar = 20 pesos, y el usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */

import java.util.Scanner;

public class ConversionDolaresAPesos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio fija
        final double TASA_DE_CAMBIO = 20.0;

        // Solicitar al usuario que ingrese una cantidad en dólares
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        // Convertir dólares a pesos
        double pesos = dolares * TASA_DE_CAMBIO;

        // Mostrar el resultado
        System.out.println(dolares + " dólares equivalen a " + pesos + " pesos.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

