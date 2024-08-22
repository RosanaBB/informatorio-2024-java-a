package ejerciciosnumerodos;

/*
Sumadenúmeros : Realizar un programa que guarde un número en memoria y determine si es par o impar.
 */

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número del usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        scanner.close();
    }
}

