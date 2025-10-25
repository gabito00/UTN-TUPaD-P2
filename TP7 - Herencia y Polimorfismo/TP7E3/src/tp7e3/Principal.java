/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7e3;

/**
 *
 * @author Gabriel
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear lista de empleados (polimorfismo)
        Empleado[] empleados = {
            new EmpleadoPlanta(2500.0, "Ana Baez", "EMP001"),
            new EmpleadoTemporal(160.0, 15, "Carlos Torres", "TEMP001"),
            new EmpleadoPlanta(2800.0, "María Marroco", "EMP002"),
            new EmpleadoTemporal(120.0, 18.0, "Pedro Fernandez", "TEMP002")
        };
        
        // Calcular sueldos usando polimorfismo
        System.out.println("=== SUELDOS DE EMPLEADOS ===");
        double totalSueldos = 0;
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            totalSueldos += empleado.calcularSueldo();
            
            // Usar instanceof para clasificar empleados
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                System.out.println("Tipo: Empleado de Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println("-------------------");
        }
        
        // Mostrar resumen
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total empleados de planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        System.out.println("Total sueldos a pagar: $" + totalSueldos);
        
        // Ejemplo de downcasting seguro
        System.out.println("\n=== DETALLE EMPLEADOS TEMPORALES ===");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoTemporal) {
                EmpleadoTemporal temp = (EmpleadoTemporal) empleado;
                System.out.println(temp.nombre + " - Tipo: Temporal");
            }
        }
    }
    
}
