package ejerciciosiniciado;
/*
Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre y luego imprimirlos
 por pantalla. ¿Por qué no puede usar "" en el char?
 */

public class NombreCaracteres {
    public static void main(String[] args) {
        // Definir el nombre
        String nombre = "Juan";

        // Crear un array de char para almacenar cada carácter del nombre
        char[] caracteres = new char[nombre.length()];

        // Guardar cada carácter del nombre en el array
        for (int i = 0; i < nombre.length(); i++) {
            caracteres[i] = nombre.charAt(i);
        }

        // Imprimir cada carácter por pantalla
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
    }
}

