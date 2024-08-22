package ejerciciosiniciado;


    /*
    Se les solicita que guarden dos números enteros y los sumen. El resultado guardarlo, mostrarlo por pantalla junto
    con un mensaje que indique si se trata de
    un número par o impar. El mensaje debe tener el siguiente formato: “El resultado es “ {Resultado} “y es” {paridad}
     */

    import java.util.Scanner;

    public class SumaParImpar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese el primer número
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            // Solicitar al usuario que ingrese el segundo número
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            // Sumar los dos números
            int suma = numero1 + numero2;

            // Determinar si el resultado es par o impar
            String paridad;
            if (suma % 2 == 0) {
                paridad = "par";
            } else {
                paridad = "impar";
            }

            // Mostrar el resultado y la paridad
            System.out.println("El resultado es " + suma + " y es " + paridad + ".");
        }
    }

