package ejerciciosiniciado;

/*
Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y luego haga la potencia de ese
 número al cuadrado y al cubo.
 */

import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular la potencia al cuadrado
        double cuadrado = Math.pow(numero, 2);

        // Calcular la potencia al cubo
        double cubo = Math.pow(numero, 3);

        // Mostrar los resultados por pantalla
        System.out.println("El número ingresado es: " + numero);
        System.out.println("El número " + numero + " al cuadrado es: " + cuadrado);
        System.out.println("El número " + numero + " al cubo es: " + cubo);
    }
}
