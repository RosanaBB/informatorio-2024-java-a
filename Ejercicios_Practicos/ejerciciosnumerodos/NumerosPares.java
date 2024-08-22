package ejerciciosnumerodos;

/*
Amimegustanlos apres: Escribe un programa que imprima solo los N números pares, donde los N números son guardados en
variables o constantes según corresponda.
 */

public class NumerosPares {
    public static void main(String[] args) {
        int N = 10; // Puedes cambiar este valor para imprimir más o menos números pares

        // Imprimir los primeros N números pares
        System.out.println("Los primeros " + N + " números pares son:");

        for (int i = 1; i <= N; i++) {
            int numeroPar = i * 2;
            System.out.println(numeroPar);
        }
    }
}

