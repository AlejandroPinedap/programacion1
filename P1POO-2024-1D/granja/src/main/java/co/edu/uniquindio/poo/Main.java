package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaAnimales = new ArrayList<>();

        // Agregar animales a la lista
        listaAnimales.add(new Perro("Firulais", 3, "Marrón"));
        listaAnimales.add(new Gato("Garfield", 5, "Naranja"));

        // Eliminar un animal de la lista
        listaAnimales.remove(0);
    }
}
