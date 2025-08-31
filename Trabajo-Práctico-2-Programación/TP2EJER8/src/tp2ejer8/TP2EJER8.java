/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer8;

import java.util.Scanner;

/**
 *
 * Cálculo del Precio Final con impuesto y descuento.
 * Crea un método calcularPrecioFinal(double impuesto, double
 * descuento) que calcule el precio final de un producto en un e-commerce. La
 * fórmula es:
 * PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
 * PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
 * Descuento)
 * Desde main(), solicita el precio base del producto, el porcentaje de
 * impuesto y el porcentaje de descuento, llama al método y muestra el precio
 * final.
 * Ejemplo de entrada/salida:
 * Ingrese el precio base del producto: 100
 * Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
 * Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
 * El precio final del producto es: 105.0
 * 
 * @author Gabriel
 */
public class TP2EJER8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioBase,descuento,impuesto;
        System.out.print("Ingrese el precio base del producto:");
        precioBase = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        impuesto = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        descuento = Double.parseDouble(sc.nextLine());
        System.out.print("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }
    
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        return precioBase+(precioBase*impuesto/100)-(precioBase*descuento/100);
    }
    
}
