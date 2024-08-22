package ejercicioscaballero;

/*
Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al usuario una cantidad en bitcoins y
muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de
1 bitcoin = 50000 dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 */

import java.util.Scanner;

public class ConversionBitcoinADolares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la tasa de cambio fija
        final double TASA_DE_CAMBIO = 50000.0;

        // Solicitar al usuario que ingrese una cantidad en bitcoins
        System.out.print("Ingrese la cantidad en bitcoins: ");
        double bitcoins = scanner.nextDouble();

        // Convertir bitcoins a dólares
        double dolares = bitcoins * TASA_DE_CAMBIO;

        // Mostrar el resultado
        System.out.println(bitcoins + " bitcoins equivalen a " + dolares + " dólares.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

