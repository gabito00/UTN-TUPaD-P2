/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e4;

/**
 *
 * @author Gabriel
 */
abstract class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método abstracto que DEBE ser implementado por las subclases
    public abstract void hacerSonido();
    
    // Método concreto que puede ser usado por todos los animales
    public abstract void describirAnimal();
}
