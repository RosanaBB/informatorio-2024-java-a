package ejerciciospadawan;

/*
Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre en unicode y luego imprimirlos por
pantalla. ¿Por qué no puede usar "" en el char? ¿Qué es unicode?
 */

public class NombreUnicode {
    public static void main(String[] args) {
        // Guardar los caracteres del nombre en variables char usando valores Unicode
        char c1 = '\u004A'; // J
        char c2 = '\u006F'; // o
        char c3 = '\u0061'; // a
        char c4 = '\u006E'; // n
        char c5 = '\u0065'; // e

        // Imprimir los caracteres por pantalla
        System.out.println("Nombre en Unicode: " + c1 + c2 + c3 + c4 + c5);
    }
}

