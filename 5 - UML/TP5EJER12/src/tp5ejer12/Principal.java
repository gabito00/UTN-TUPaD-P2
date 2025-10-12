/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer12;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // === Crear contribuyentes ===
        Contribuyente c1 = new Contribuyente("Ana Gómez", "20-12345678-3");
        Contribuyente c2 = new Contribuyente("Carlos Pérez", "23-22334455-9");

        // === Crear impuestos ===
        Impuesto i1 = new Impuesto(150000.0, c1);
        Impuesto i2 = new Impuesto( 35000.0, c2);

        // === Calculadora ===
        Calculadora calc = new Calculadora();

        System.out.println("=== Estado inicial ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(calc);

        // === Vincular y MODIFICAR SOLO con getters/setters ===
        // Cambiar datos del contribuyente c1
        c1.setNombre("Ana V. Gómez");
        c1.setCuil("20-12345678-4");

        // Actualizar montos
        i1.setMonto(i1.getMonto() + 25000.0);
        i2.setMonto(i2.getMonto() - 5000.0);

        // Reasignar contribuyente de un impuesto
        i2.setContribuyente(c1);

        System.out.println("\n=== Después de cambios (getters/setters) ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(i1);
        System.out.println(i2);

        // === Usar la calculadora ===
        System.out.println("\n=== Cálculo ===");
        calc.calcular(i1);
        calc.calcular(i2);
    }
    
}
