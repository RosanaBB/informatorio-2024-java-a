package ejerciciospoo;
import java.time.LocalDate;

class Persona {
    // Atributos de la clase Persona
    private long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo;

    // Constructor sin parámetros
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(long dni, String nombre, boolean licencia) {
        this.dni = dni;
        this.nombre = nombre;
        if (licencia) {
            System.out.println("Persona con licencia.");
        } else {
            System.out.println("Persona sin licencia.");
        }
    }

    // Getters y Setters
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

