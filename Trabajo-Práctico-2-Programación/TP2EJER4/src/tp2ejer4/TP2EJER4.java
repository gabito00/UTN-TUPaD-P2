/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer4;

import java.util.Scanner;

/**
 * Calculadora de Descuento según categoría.
 * Escribe un programa que solicite al usuario el precio de un producto y
 * su categoría (A, B o C).
 * Luego, aplique los siguientes descuentos:
 * Categoría A: 10% de descuento
 * Categoría B: 15% de descuento
 * Categoría C: 20% de descuento
 * El programa debe mostrar el precio original, el descuento aplicado y el
 * precio final
 * Ejemplo de entrada/salida:
 * Ingrese el precio del producto: 1000
 * Ingrese la categoría del producto (A, B o C): B
 * Descuento aplicado: 15%
 * Precio final: 850.0

 * @author Gabriel
 */
public class TP2EJER4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        char option;
        System.out.print("Ingrese el valor del producto: $");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Categoría A: 10% de descuento\nCategoría B: 15% de descuento\nCategoría C: 20% de descuento\nIngrese la categoria: ");
        option = sc.nextLine().charAt(0);
        getDiscount(price, option);
    }
    
    private static void getDiscount(double price, char option){
        double rate=0;
        switch(Character.toUpperCase(option)){
            case 'A':
                rate = 0.10;
                break;
            case 'B':
                rate = 0.15;
                break;
            case 'C':
                rate = 0.20;
                break;
            default:
                System.out.println("Opcion incorrecta!");
                break;
        }
        System.out.printf("Descuento aplicado: %.0f%%%n", rate * 100);
        System.out.printf("Precio final: $%.2f%n", + getNewPrice(price, rate));
    }
    
    private static double getNewPrice(double p, double d){
        return p * (1 - d);
    }
    
}
