package co.edu.uniquindio.poo;

public class Gato extends Animal {
    

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad, color);
       
    }

    @Override
    public String toString() {
        return "Gato: " + nombre + ", Edad: " + edad + ", Color: " + color;
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("El fato haria meow.");
    
        
    }

   
}