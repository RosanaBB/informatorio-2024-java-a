package ejerciciospadawan;

/*
Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en otro espacio de memoria realice la
 conversión de esas libras a kilogramos. Utilice una constante de los valores que no van a cambiar en esta conversión.
 Muestre el resultado por pantalla
 */

public class ConversorLibrasAKilogramos {
    // Definir una constante para el factor de conversión de libras a kilogramos
    private static final double FACTOR_CONVERSION = 0.45359237; // 1 libra = 0.45359237 kilogramos

    public static void main(String[] args) {
        // Guardar el valor en libras en una variable
        double libras = 150; // Puedes cambiar este valor para probar con otros números

        // Realizar la conversión a kilogramos
        double kilogramos = libras * FACTOR_CONVERSION;

        // Mostrar el resultado por pantalla
        System.out.println(libras + " libras son equivalentes a " + kilogramos + " kilogramos.");
    }
}

