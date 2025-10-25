/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7e4;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Max", 3, "Labrador");
        Gato gato = new Gato("Luna", 2, true);
        Vaca vaca = new Vaca("Margarita", 5, 20);
        
        Animal[] animales = {
            new Perro("Rex", 4, "Pastor Alemán"),
            new Gato("Simba", 1, false),
            new Vaca("Blanca", 6, 25),
            new Perro("Bobby", 2, "Chihuahua"),
            new Gato("Mimi", 3, true)
        };
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }

    }
    
}
