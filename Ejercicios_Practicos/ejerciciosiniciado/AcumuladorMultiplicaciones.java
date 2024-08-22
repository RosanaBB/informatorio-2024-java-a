package ejerciciosiniciado;

/*
Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación de quince multiplicaciones entre dos
 números enteros divididos por el número de la multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … +
 Numero1*Numero2/15 El resultado mostrarlo por pantalla.
 */

import java.util.Scanner;

public class AcumuladorMultiplicaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Variable para acumular el resultado
        double acumulador = 0;

        // Realizar las quince multiplicaciones y acumular los resultados
        for (int i = 1; i <= 15; i++) {
            double resultado = (double) numero1 * numero2 / i;
            acumulador += resultado;
        }

        // Mostrar el resultado acumulado por pantalla
        System.out.println("El resultado de la acumulación de las quince multiplicaciones es: " + acumulador);
    }
}
