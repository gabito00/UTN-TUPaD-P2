/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer5;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\n========= ESCENARIO 2: Computadora / PlacaMadre / Propietario =========");
        // Placa madre
        PlacaMadre pm = new PlacaMadre("ASUS", "B550");
        pm.setChipset("B550-Plus");

        // Computadora
        Computadora pc = new Computadora("Lenovo", "ThinkCentre M75", "MSI", "I79883");
        pc.setPlacaMadre(pm);

        // Propietario y vínculo bidireccional
        Propietario dueno = new Propietario("Carla Gómez", "30111222");
        pc.setPropietario(dueno);
        System.out.printf(pc.toString());


        // Cambiar propietario
        Propietario nuevoDueno = new Propietario("Diego Torres", "28999777");
        pc.setPropietario(nuevoDueno);

        // Cambiar la placa madre
        PlacaMadre pm2 = new PlacaMadre("MSI", "B650");
        pc.setPlacaMadre(pm2);
        System.out.printf(pc.toString());
    }
    
}
