package co.edu.uniquindio.poo;

public class Cuadrado extends Figura {
    
    private double lado;

    //constructor

    public Cuadrado (double lado){

        this.lado = lado;


    }

    public double CalcularArea () {

        assert lado >= 0; 

        return lado * lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


}
