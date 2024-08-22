package gestiondevehiculos;

public class Main {

    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla");
        Vehiculo moto = new Moto("Yamaha", "R1");

        Flota flota = new Flota();

        flota.moverVehiculo(coche);
        flota.moverVehiculo(moto);

        flota.mantenerVehiculo((Mantenimiento) coche);
        flota.mantenerVehiculo((Mantenimiento) moto);
    }
}

