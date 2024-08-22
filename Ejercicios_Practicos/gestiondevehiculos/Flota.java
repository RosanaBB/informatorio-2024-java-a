package gestiondevehiculos;

public class Flota {

    public void moverVehiculo(Vehiculo vehiculo) {
        vehiculo.mover();
    }

    public void mantenerVehiculo(Mantenimiento vehiculo) {
        vehiculo.realizarMantenimiento();
    }
}


