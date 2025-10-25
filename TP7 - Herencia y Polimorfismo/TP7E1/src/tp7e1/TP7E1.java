/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7e1;

/**
 *
 * @author Gabriel
 */
public class TP7E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de Auto
        Auto auto1 = new Auto("Toyota", "Corolla", 4);
        Auto auto2 = new Auto("Ford", "Fiesta", 2);
                
        // Mostrar información de cada vehículo
        System.out.println("=== INFORMACIÓN DE VEHÍCULOS ===");
        auto1.mostrarInfo();
        auto2.mostrarInfo();
        
        // Demostración de polimorfismo con array de Vehiculo
        System.out.println("\n=== POLIMORFISMO CON VEHÍCULOS ===");
        Vehiculo[] vehiculos = {
            new Auto("Chevrolet", "Onix", 4),
            new Auto("Volkswagen", "Golf", 5),
            auto1
        };
        
        // Recorrer el array polimórficamente
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
        }
        
        // Demostración de upcasting y downcasting
        System.out.println("\n=== UPCasting y DOWNCASTING ===");
        Vehiculo vehiculo = new Auto("Nissan", "Sentra", 4);
        
        // Verificar tipo antes de downcasting
        if (vehiculo instanceof Auto) {
            Auto autoConvertido = (Auto) vehiculo;
            System.out.println("Downcasting exitoso! Puertas: " + autoConvertido.getPuertas());
        }
    }
    
}
