package ejerciciosiniciado;

/*
Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los sumen, determine si el primer número
es divisible por el segundo número y muestre el resultado.
 */

import java.util.Scanner;

public class SumaYDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumar los dos números
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Determinar si el primer número es divisible por el segundo número
        if (numero2 != 0) {
            if (numero1 % numero2 == 0) {
                System.out.println(numero1 + " es divisible por " + numero2);
            } else {
                System.out.println(numero1 + " no es divisible por " + numero2);
            }
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}