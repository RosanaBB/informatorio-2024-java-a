package gestiondevehiculos;

public class Coche extends Vehiculo implements Mantenimiento {

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El coche " + getMarca() + " " + getModelo() + " está conduciendo.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("El coche " + getMarca() + " " + getModelo() + " está en mantenimiento.");
    }
}
