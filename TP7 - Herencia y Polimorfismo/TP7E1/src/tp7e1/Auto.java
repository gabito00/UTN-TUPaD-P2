/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7e1;

/**
 *
 * @author Gabriel
 */
public class Auto extends Vehiculo{
    private int puertas;

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    

    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo + " " + puertas + " puertas");
    }
    
    
    
}
