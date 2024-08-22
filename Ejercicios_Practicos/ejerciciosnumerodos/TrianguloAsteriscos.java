package ejerciciosnumerodos;

/*
Triangulo de asteriscos : Se le solicita que creen un programa que imprima un triángulo de asteriscos en la consola.
Usar bucles.
 */

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        int filas = 5; // Número de filas del triángulo

        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();
        }
    }
}

