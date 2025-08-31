/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer10;

import java.util.Scanner;

/**
 *
 * Actualización de stock a partir de venta y recepción de productos.
 * Crea un método actualizarStock(int stockActual, int cantidadVendida,
 * int cantidadRecibida), que calcule el nuevo stock después de una venta y
 * recepción de productos:
 * NuevoStock = StockActual − CantidadVendida + CantidadRecibida
 * NuevoStock = CantidadVendida + CantidadRecibida
 * Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
 * cantidad recibida, y muestra el stock actualizado.
 * Ejemplo de entrada/salida:
 * Ingrese el stock actual del producto: 50
 * Ingrese la cantidad vendida: 20
 * Ingrese la cantidad recibida: 30
 * El nuevo stock del producto es: 60
 * @author Gabriel
 */
public class TP2EJER10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock, sellQty, receivedQty;
        System.out.print("Ingrese el stock actual del producto:");
        stock = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la cantidad vendida:");
        sellQty = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la cantidad recibida:");
        receivedQty = Integer.parseInt(sc.nextLine());
        System.out.print("El nuevo stock del producto es:" + actualizarStock(stock, sellQty, receivedQty));
    }
    
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida)
    {
        return stockActual + cantidadRecibida - cantidadVendida;
    }
    
}
