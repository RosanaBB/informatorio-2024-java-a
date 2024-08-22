package ejerciciospadawan;

/*
Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de edad y los nombres de esas personas,
 luego saque su promedio e imprima por pantalla el nombre de la persona, su edad. Por último imprimir el promedio
 de sus edades.
 */

public class PromedioEdades {
    public static void main(String[] args) {
        // Guardar los nombres y edades en variables
        String nombre1 = "Ana";
        int edad1 = 25;

        String nombre2 = "Luis";
        int edad2 = 30;

        String nombre3 = "Marta";
        int edad3 = 22;

        String nombre4 = "Juan";
        int edad4 = 28;

        // Calcular el promedio de las edades
        int totalEdades = edad1 + edad2 + edad3 + edad4;
        int numeroPersonas = 4; // Total de personas
        double promedioEdades = (double) totalEdades / numeroPersonas;

        // Imprimir el nombre y edad de cada persona
        System.out.println("Nombre: " + nombre1 + ", Edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + ", Edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + ", Edad: " + edad3);
        System.out.println("Nombre: " + nombre4 + ", Edad: " + edad4);

        // Imprimir el promedio de las edades
        System.out.println("El promedio de las edades es: " + promedioEdades);
    }
}

