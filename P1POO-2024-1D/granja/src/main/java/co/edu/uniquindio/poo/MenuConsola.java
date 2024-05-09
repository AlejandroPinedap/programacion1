package co.edu.uniquindio.poo;

import java.util.Scanner;

public class MenuConsola {

    
    private static Animal[] listaAnimales = new Animal[10];
    private static int contador;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        

        do {
            System.out.println("----- Menú de Opciones -----");
            System.out.println("1. Añadir un animal");
            System.out.println("2. Hacer que los animales hagan un sonido");
            System.out.println("3. Mostrar información de todos los animales");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
            // Dentro del switch (opcion):
            // Dentro del caso 1:
            
            case 1:
            System.out.println("Selecciona el tipo de animal (1: Perro, 2: Gato, 3: Pato):");
            int tipoAnimal = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            
            System.out.print("Nombre del animal: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Edad del animal: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero
            
            System.out.print("Color del animal: ");
            String color = scanner.nextLine();
            
            // Crear una instancia del animal seleccionado
            Animal nuevoAnimal;
            switch (tipoAnimal) {
                case 1:
                    nuevoAnimal = new Perro(nombre, edad, color);
                    break;
                case 2:
                    nuevoAnimal = new Gato(nombre, edad, color);
                    break;
                case 3:
                    nuevoAnimal = new Pato(nombre, edad, color);
                    break;
                default:
                    System.out.println("Tipo de animal no válido.");
                    return; 

            }
            
            // Agregar el nuevo animal a la lista
            listaAnimales[contador] = nuevoAnimal;
            contador++;
            System.out.println("Animal añadido correctamente.");
            break;
                 // Agregar el nuevo animal a la lista
                 
                 

            case 2:
                for (Animal animal : listaAnimales) {
                animal.hacerSonido();
                }
                break;
             case 3:
                for (Animal animal : listaAnimales) {
                System.out.println(animal); 
                }
                break;

            case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
