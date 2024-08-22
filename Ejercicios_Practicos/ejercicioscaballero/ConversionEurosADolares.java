package ejercicioscaballero;

/*
Conversión de euros a dólares: Escribir un programa en Java que solicite al usuario una cantidad en euros y muestre
el equivalente en dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de
1 euro = 1.20 dólares, y el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */

import java.util.Scanner;

public class ConversionEurosADolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio fija
        final double TASA_DE_CAMBIO = 1.20;

        // Solicitar al usuario que ingrese una cantidad en euros
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Convertir euros a dólares
        double dolares = euros * TASA_DE_CAMBIO;

        // Mostrar el resultado
        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
