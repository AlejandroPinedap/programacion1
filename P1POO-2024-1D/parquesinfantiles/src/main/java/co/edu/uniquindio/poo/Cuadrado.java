package co.edu.uniquindio.poo;

public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado (double lado){

        this.lado = lado;


    }

    public double CalcularArea () {

        assert lado >= 0; 

        return lado * lado;

    }



}
