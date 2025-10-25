/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e4;

/**
 *
 * @author Gabriel
 */
public class Gato extends Animal {
    private boolean esDomestico;
    
    public Gato(String nombre, int edad, boolean esDomestico) {
        super(nombre, edad);
        this.esDomestico = esDomestico;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
    
    @Override
    public void describirAnimal() {
        String tipo = esDomestico ? "doméstico" : "callejero";
        System.out.println(nombre + " es un gato " + tipo + " de " + edad + " años");
    }
}
