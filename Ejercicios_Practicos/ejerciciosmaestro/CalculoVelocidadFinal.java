package ejerciciosmaestro;

/*
Cálculo de la velocidad final: Escribir un programa en Java que calcule la velocidad final de un objeto en caída libre,
dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido. Utilizar la fórmula:
 v_f = v_i + g * t, donde v_f es la velocidad final, v_i es la velocidad inicial, g es la aceleración de la gravedad
 y t es el tiempo transcurrido.
 */

import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de objetos
        System.out.print("Ingrese la cantidad de objetos: ");
        int cantidad = scanner.nextInt();

        // Crear arreglos para almacenar la velocidad inicial, aceleración de la gravedad y el tiempo
        double[] velocidadesIniciales = new double[cantidad];
        double[] aceleracionesGravedad = new double[cantidad];
        double[] tiempos = new double[cantidad];

        // Solicitar al usuario que ingrese la velocidad inicial, la aceleración de la gravedad y el tiempo para cada objeto
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la velocidad inicial del objeto " + (i + 1) + " (en m/s): ");
            velocidadesIniciales[i] = scanner.nextDouble();

            System.out.print("Ingrese la aceleración de la gravedad del objeto " + (i + 1) + " (en m/s²): ");
            aceleracionesGravedad[i] = scanner.nextDouble();

            System.out.print("Ingrese el tiempo transcurrido del objeto " + (i + 1) + " (en segundos): ");
            tiempos[i] = scanner.nextDouble();
        }

        // Calcular y mostrar la velocidad final para cada objeto
        for (int i = 0; i < cantidad; i++) {
            double velocidadInicial = velocidadesIniciales[i];
            double gravedad = aceleracionesGravedad[i];
            double tiempo = tiempos[i];
            double velocidadFinal = velocidadInicial + gravedad * tiempo;

            System.out.println("La velocidad final del objeto " + (i + 1) + " es: " + velocidadFinal + " m/s.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

