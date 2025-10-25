/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e4;

/**
 *
 * @author Gabriel
 */
public class Vaca extends Animal {
    private int litrosLeche;
    
    public Vaca(String nombre, int edad, int litrosLeche) {
        super(nombre, edad);
        this.litrosLeche = litrosLeche;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuuuu!");
    }
    
    @Override
    public void describirAnimal() {
        System.out.println(nombre + " es una vaca que produce " + litrosLeche + " litros de leche y tiene " + edad + " años");
    }
}
