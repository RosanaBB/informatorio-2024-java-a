package ejerciciosnumerodos;

/*
Lasumadelos primeros: Realizar un programa que calcule la suma de los primeros N números naturales, donde N es un
 número entero guardado en memoria.
 */

import java.util.Scanner;

public class SumaPrimerosNNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        // Calcular la suma de los primeros N números naturales
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);

        scanner.close();
    }
}
