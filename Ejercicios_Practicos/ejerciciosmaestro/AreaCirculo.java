package ejerciciosmaestro;

/*
Cálculo del área de un círculo: Escribir un programa en Java que calcule el área de un círculo con un radio de
5 unidades. Buscar la fórmula con la que se resuelve.
Fahrenheit=(Celsius× 9/5) + 32

 */

public class AreaCirculo {
    public static void main(String[] args) {
        // Definir el radio del círculo
        double radio = 5.0;

        // Calcular el área del círculo usando la fórmula A = πr^2
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área de un círculo con un radio de " + radio + " unidades es " + area + " unidades cuadradas.");
    }
}

