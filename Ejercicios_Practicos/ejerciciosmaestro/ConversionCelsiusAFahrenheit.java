package ejerciciosmaestro;

/*
Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en Java que convierta una temperatura en
 grados Celsius a grados Fahrenheit. Buscar la fórmula con la que se resuelve.

Fahrenheit=(Celsius× 9/5) + 32
 */

import java.util.Scanner;

public class ConversionCelsiusAFahrenheit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir grados Celsius a grados Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Mostrar el resultado
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
