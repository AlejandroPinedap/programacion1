package co.edu.uniquindio.poo;

public class Perro extends Animal {
    
    public Perro(String nombre, int edad, String color) {
		super(nombre, edad, color);

    }

	@Override
    public String toString() {
        return "Perro: " + nombre + ", Edad: " + edad + ", Color: " + color;
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace un ladrido.");
    
        
    }
  

}