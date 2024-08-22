package ejerciciosnumerodos;

/*
Dequesetrata esto? : Realizar un programa que guarde un número en memoria y determine si es positivo, negativo o cero.
 */

import java.util.Scanner;

public class NumeroCategoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número del usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}

