package ejerciciosiniciado;

/*
Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre y apellido, luego guarde su edad
e imprimalos por pantalla. El mensaje debe tener el siguiente formato:“Mi nombre es “ {Nombre} “Mi edad es” {Edad}
 */

import java.util.Scanner;

public class InformacionPersonal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese su apellido
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Mostrar la información por pantalla en el formato solicitado
        System.out.println("Mi nombre es " + nombre + " " + apellido + ". Mi edad es " + edad + ".");
    }
}
