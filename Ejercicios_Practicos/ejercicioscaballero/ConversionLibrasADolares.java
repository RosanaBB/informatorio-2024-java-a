package ejercicioscaballero;

/*
Conversión de libras esterlinas a dólares: Escribir un programa en Java que solicite al usuario una cantidad en
libras esterlinas y muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa
de cambio es de 1 libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa deberá
mostrar 70 dólares.
 */

import java.util.Scanner;

public class ConversionLibrasADolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio fija
        final double TASA_DE_CAMBIO = 1.40;

        // Solicitar al usuario que ingrese una cantidad en libras esterlinas
        System.out.print("Ingrese la cantidad en libras esterlinas: ");
        double libras = scanner.nextDouble();

        // Convertir libras esterlinas a dólares
        double dolares = libras * TASA_DE_CAMBIO;

        // Mostrar el resultado
        System.out.println(libras + " libras esterlinas equivalen a " + dolares + " dólares.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

