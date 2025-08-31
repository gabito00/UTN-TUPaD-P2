/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer11;

import java.util.Scanner;

/**
 *
 * Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
 * método calcularDescuentoEspecial(double precio) que use la variable global para
 * calcular el descuento especial del 10%.
 * Dentro del método, declara una variable local descuentoAplicado, almacena
 * el valor del descuento y muestra el precio final con descuento.
 * Ejemplo de entrada/salida:
 * Ingrese el precio del producto: 200
 * El descuento especial aplicado es: 20.0
 * El precio final con descuento es: 180.0

 * @author Gabriel
 */
public class TP2EJER11 {

    /**
     * @param args the command line arguments
     */
    
    static double DESCUENTO = 0.1;
    
    public static void main(String[] args) {
        double precio, descuento;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(sc.nextLine());
        descuento = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + descuento);
        System.out.println("El precio final con descuento es: " + (precio-descuento));
    }
    
    private static double calcularDescuentoEspecial(double precio){
        return precio*DESCUENTO;
    }
    
}
