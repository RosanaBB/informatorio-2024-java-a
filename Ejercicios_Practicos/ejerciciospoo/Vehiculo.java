package ejerciciospoo;

import java.time.LocalDate;

class Vehiculo {
    // Atributos de la clase Vehiculo
    private String marca;
    private int cantidadDeRuedas;
    private boolean competencia;
    private boolean alarma;
    private String kmMaximo;
    private String kmMinimo;

    // Constructor sin kmMinimo
    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMaximo) {
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.kmMaximo = kmMaximo;
    }

    // Constructor con kmMinimo
    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMaximo, String kmMinimo) {
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }

    // Métodos adicionales
    public void mostrarPorPantallaMarca() {
        System.out.println("Marca del vehículo: " + this.marca);
    }

    public void arrancarVehiculo() {
        System.out.println("El vehículo está arrancado.");
    }
}

