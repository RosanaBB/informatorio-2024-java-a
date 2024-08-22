package gestiondevehiculos;

public class Moto extends Vehiculo implements Mantenimiento {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto " + getMarca() + " " + getModelo() + " está acelerando.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("La moto " + getMarca() + " " + getModelo() + " está en mantenimiento.");
    }
}


