/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer7;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ====== Conductores ======
        Conductor c1 = new Conductor("Ana Gómez", "LIC-001");
        Conductor c2 = new Conductor("Carlos Pérez", "LIC-002");
        Conductor c3 = new Conductor("María López", "LIC-003");

        // ====== Motores ======
        Motor m1 = new Motor("Nafta", "SN-1001");
        Motor m2 = new Motor("Diésel", "SN-2002");
        Motor m3 = new Motor("Eléctrico", "SN-3003");

        // ====== Vehículos ======
        Vehiculo v1 = new Vehiculo("AA123BB","Sedán LX", m1);
        v1.setConductor(c1);

        Vehiculo v2 = new Vehiculo("AC456CD", "PickUp XR", m2);
        v2.setConductor(c2);

        Vehiculo v3 = new Vehiculo("AE789EF", "Hatch GT", m3);
        v3.setConductor(c3);

        // ====== Estado inicial ======
        System.out.println("=== Estado inicial ===");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // ====== Cambios ======
        System.out.println("\n=== Cambios ===");
        System.out.println("1) v1 cambia a motor eléctrico (m3) y v3 toma el naftero (swap m1 <-> m3)");
        Motor tmp = v1.getMotor();  // m1
        v1.setMotor(v3.getMotor()); // m3
        v3.setMotor(tmp);           // m1

        System.out.println("2) v2 cambia de conductor: ahora conduce Ana (c1)");
        v2.setConductor(c1);

        System.out.println("3) Actualizar datos: v1 cambia a 'Sedán LX Plus', m3 renumera serie, Carlos actualiza nombre");
        v1.setModelo("Sedán LX Plus");
        v1.getMotor().setNumeroSerie("SN-3003-REV2"); // el motor actual de v1 es m3
        c2.setNombre("Carlos A. Pérez");

        System.out.println("4) v3 queda temporalmente sin conductor");
        v3.setConductor(null);

        System.out.println("5) v2 se queda sin motor (en reparación)");
        v2.setMotor(null);

        // ====== Estado después de los cambios ======
        System.out.println("\n=== Estado después de los cambios ===");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // ====== Chequeo desde objetos individuales (toString propios) ======
        System.out.println("\n=== Objetos individuales ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
    
}
