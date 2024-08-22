package ejerciciosiniciado;

/*
Triangulo de asteriscos : Se le solicita que creen un programa que imprima un triángulo
de asteriscos en la consola.
 */

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Imprimir el triángulo de asteriscos
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}