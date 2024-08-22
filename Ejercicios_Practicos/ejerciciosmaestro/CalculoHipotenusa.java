package ejerciciosmaestro;

/*
Cálculo de la hipotenusa de un triángulo: Escribir un programa en Java que calcule la hipotenusa de un triángulo
rectángulo, dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la hipotenusa, a y b
 son los catetos.
 */

import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los valores de los catetos
        System.out.print("Ingrese el valor del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        // Calcular la hipotenusa usando la fórmula h^2 = a^2 + b^2
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        // Mostrar el resultado
        System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
