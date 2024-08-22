package ejerciciosiniciado;

/*
Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego guarde otros
dos números enteros y multiplicarlos. Guarde en un espacio de memoria la suma entre estas dos multiplicaciones
¿Que resultado le da? ¿Entero o real? ¿Por qué?
 */

import java.util.Scanner;

public class MultiplicacionYSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números reales
        System.out.print("Ingrese el primer número real: ");
        double numeroReal1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número real: ");
        double numeroReal2 = scanner.nextDouble();

        // Multiplicar los dos números reales
        double multiplicacionReales = numeroReal1 * numeroReal2;

        // Solicitar al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numeroEntero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int numeroEntero2 = scanner.nextInt();

        // Multiplicar los dos números enteros
        int multiplicacionEnteros = numeroEntero1 * numeroEntero2;

        // Guardar la suma de las dos multiplicaciones en un espacio de memoria
        double sumaMultiplicaciones = multiplicacionReales + multiplicacionEnteros;

        // Mostrar el resultado de la suma de las multiplicaciones
        System.out.println("El resultado de la suma de las multiplicaciones es: " + sumaMultiplicaciones);

        // Determinar si el resultado es entero o real y mostrar por pantalla
        if (sumaMultiplicaciones == (int) sumaMultiplicaciones) {
            System.out.println("El resultado es un número entero.");
        } else {
            System.out.println("El resultado es un número real.");
        }

        // Explicación
        System.out.println("¿Por qué?");
        System.out.println("El resultado es un número real porque hemos sumado un valor de tipo double con otro de tipo"
                + " int, y en Java, la operación aritmética que involucra tipos de datos diferentes se promueve al " +
                "tipo de mayor precisión, en este caso double.");
    }
}

