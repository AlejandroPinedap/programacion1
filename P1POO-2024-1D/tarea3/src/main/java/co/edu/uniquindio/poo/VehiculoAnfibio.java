package co.edu.uniquindio.poo;

public class VehiculoAnfibio extends Vehiculo implements OperacionesAcuaticas,OperacionesTerrestres{
    public VehiculoAnfibio() {
        super("Anfibio");
    }

    // Métodos específicos para vehículos anfibios
    public void avanzarEnAgua() {
        System.out.println("Avanza en el agua.");
    }

    public void avanzarEnTierra() {
        System.out.println("Avanza en tierra.");
    }

    @Override
    public void avanzar() {
        
    }

    @Override
    public void retroceder() {
       
    }

    @Override
    public void girar() {
        
    }

    @Override
    public void detener() {
       
    }

    @Override
    public void encender() {
        
    }

    @Override
    public void apagar() {
        
    }
}