package ejerciciosnumerodos;

/*
Espero aprobar : Escribe un programa que imprima un título para el programa, luego un listado (Seguido, NO con
saltos de línea) de las N notas de mis exámenes, donde los N números son guardados en variables o constantes según
 corresponda. Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con cuanto
 */

public class CalificacionesExamenes {
    public static void main(String[] args) {
        // Definir las notas de los exámenes
        final int N = 5; // Número de exámenes
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0}; // Puedes cambiar estas notas según sea necesario
        double suma = 0;

        // Imprimir el título
        System.out.println("Programa de Cálculo de Promedio de Notas");

        // Imprimir las notas en una sola línea
        System.out.print("Notas: ");
        for (int i = 0; i < N; i++) {
            System.out.print(notas[i] + " ");
            suma += notas[i];
        }

        // Calcular el promedio
        double promedio = suma / N;

        // Mostrar el promedio
        System.out.println();
        System.out.println("Promedio: " + promedio);

        // Determinar si se aprobó o no
        double notaAprobacion = 7.0; // Nota mínima para aprobar
        if (promedio >= notaAprobacion) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            double diferencia = notaAprobacion - promedio;
            System.out.println("No has aprobado. Te falta " + diferencia + " puntos para aprobar.");
        }
    }
}

