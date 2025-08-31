/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer9;

import java.util.Scanner;

/**
 *
 * Composición de funciones para calcular costo de envío y total de compra.
 * a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
 * envío basado en la zona de envío (Nacional o Internacional) y el peso del
 * paquete.
 * Nacional: $5 por kg
 * Internacional: $10 por kg
 * b. calcularTotalCompra(double precioProducto, double
 * costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
 * el costo de envío.
 * Desde main(), solicita el peso del paquete, la zona de envío y el precio
 * del producto. Luego, muestra el total a pagar.
 * Ejemplo de entrada/salida:
 * Ingrese el precio del producto: 50
 * Ingrese el peso del paquete en kg: 2
 * Ingrese la zona de envío (Nacional/Internacional): Nacional
 * El costo de envío es: 10.0
 * El total a pagar es: 60.0
 * 
 * @author Gabriel
 */
public class TP2EJER9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, packageWeight, deliveryCharge;
        String zone;
        
        System.out.print("Ingrese el precio:");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el peso del paquete:");
        packageWeight = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese la zona(Nacional/Internacional):");
        zone = sc.nextLine();
        if(dataIsValid(packageWeight, zone)){
            deliveryCharge = calcularCostoEnvio(packageWeight, zone);
            System.out.println("El costo de envio es: " + deliveryCharge);
            System.out.println("El total a pagar es: " + calcularTotalCompra(price, deliveryCharge));
        }
            
        
    }
    
    private static double calcularCostoEnvio(double packageWeight, String zone){
        if(zone.toLowerCase().contains("nacional"))
            return packageWeight*5;
        else
            return packageWeight*10;
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto+costoEnvio;
    }
    
    private static boolean dataIsValid(double packageWeight, String zone){
        if((zone.toLowerCase().contains("nacional") || zone.toLowerCase().contains("internacional")) && packageWeight>0 )
            return true;
        return false;
    }
    
}
