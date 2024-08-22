package ejercicioscaballero;

/*
Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario una cantidad en pesos y muestre
el equivalente en euros, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos,
y el usuario ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */

import java.util.Scanner;

public class ConversionPesosAEuros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio fija
        final double TASA_DE_CAMBIO = 20.0;

        // Solicitar al usuario que ingrese una cantidad en pesos
        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        // Convertir pesos a euros
        double euros = pesos / TASA_DE_CAMBIO;

        // Mostrar el resultado
        System.out.println(pesos + " pesos equivalen a " + euros + " euros.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

