package ejerciciospoo;

public class Main {
    public static void main(String[] args) {
        // Crear un vehículo
        Vehiculo vehiculo = new Vehiculo("Toyota", 4, false, "200000", "1000");
        vehiculo.mostrarPorPantallaMarca();
        vehiculo.arrancarVehiculo();

        // Crear una persona
        Persona persona = new Persona(12345678L, "Juan Pérez", true);
        persona.setVehiculo(vehiculo);

        // Mostrar información de la persona
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Vehículo de la persona: " + persona.getVehiculo().getMarca());
    }
}

