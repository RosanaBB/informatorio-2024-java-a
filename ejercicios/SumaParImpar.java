package ejercicios;

import java.util.Scanner;

public class SumaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        if (suma % 2 == 0) {
            System.out.println("El resultado es un número par.");
        } else {
            System.out.println("El resultado es un número impar.");
        }
    }
}
