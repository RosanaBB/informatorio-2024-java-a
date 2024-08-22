package ejerciciospadawan;

/*
Contador: Se le solicita que guarde un número en un espacio de memoria e incremente dicho número 20 veces sin
usar asignación. ¿Que operador podría usar para hacerlo?
 */

public class Contador {
    public static void main(String[] args) {
        // Inicializar la variable contador
        int contador = 0;

        // Incrementar el contador 20 veces usando el operador +=
        for (int i = 0; i < 20; i++) {
            contador += 1; // Incrementa contador en 1
        }

        // Mostrar el resultado
        System.out.println("El valor final del contador es: " + contador);
    }
}

