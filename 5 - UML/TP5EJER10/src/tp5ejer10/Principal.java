/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer10;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ===== Titulares =====
        Titular t1 = new Titular("Ana Gómez", "87654321");
        Titular t2 = new Titular("Carlos Pérez", "22334455");

        // ===== Cuentas  =====
        CuentaBancaria c1 = new CuentaBancaria("0000003100000001234567", 150000.0, "A1B2C3", "2025-09-15");
        CuentaBancaria c2 = new CuentaBancaria("0000003100000009876543",  50000.0, "X9Y8Z7", "2025-09-10");

        // ===== Vincular bidireccionalmente con setters =====
        c1.setTitular(t1);
        c2.setTitular(t2);

        System.out.println("=== Estado inicial ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(c1.getClaveSeguridad());
        System.out.println(c2.getClaveSeguridad());

        // ===== Jugar con setters =====
        c1.setSaldo(c1.getSaldo() + 25000);
        c2.setSaldo(c2.getSaldo() - 10000);
        t1.setNombre("Ana V. Gómez");
        c1.setCbu("0000003100000001111111");

        // 2) Actualizar clave
        c1.getClaveSeguridad().setCodigo("A1B2C3-REV2");
        c1.getClaveSeguridad().setUltimaModificacion("2025-09-27");

        // 3) Reasignar titular
        c2.setTitular(t1);

        System.out.println("\n=== Después de cambios ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(c1.getClaveSeguridad());
        System.out.println(c2.getClaveSeguridad());
    }
    
}
