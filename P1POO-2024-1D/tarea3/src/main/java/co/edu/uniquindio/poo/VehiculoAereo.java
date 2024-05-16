package co.edu.uniquindio.poo;

public class VehiculoAereo extends Vehiculo {
    public VehiculoAereo() {
        super("Aéreo");
    }

    // Métodos específicos para vehículos aéreos
    public void despegar() {
        System.out.println("Despegando.");
    }

    public void aterrizar() {
        System.out.println("Aterrizando.");
    }

 
}
