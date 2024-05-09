package co.edu.uniquindio.poo;


public class Pato extends Animal {
    
    public Pato(String nombre, int edad, String color) {
		super(nombre, edad, color);

    }

	@Override
    public String toString() {
        return "Pato: " + nombre + ", Edad: " + edad + ", Color: " + color;
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pato haria cuak.");
    
        
    }
  

}
