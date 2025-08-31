/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer6;

import java.util.Scanner;

/**
 *
 * Contador de Positivos, Negativos y Ceros (for).
 * Escribe un programa que pida al usuario ingresar 10 números enteros y
 * cuente cuántos son positivos, negativos y cuántos son ceros.
 * Ejemplo de entrada/salida:
 * Ingrese el número 1: -5
 * Ingrese el número 2: 3
 * Ingrese el número 3: 0
 * Ingrese el número 4: -1
 * Ingrese el número 5: 6
 * Ingrese el número 6: 0
 * Ingrese el número 7: 9
 * Ingrese el número 8: -3
 * Ingrese el número 9: 4
 * Ingrese el número 10: -8
 * Resultados:
 * Positivos: 4
 * Negativos: 4
 * Ceros: 2
 * @author Gabriel
 */
public class TP2EJER6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, total, positives=0,negatives=0,zeros=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + i + " : ");
            number = Integer.parseInt(sc.nextLine());
            if (number > 0) positives++;
            else if(number <0) negatives++;
            else zeros++;
            
        }
        System.out.println("Resultados:");
        System.out.println("Positivos:" + positives);
        System.out.println("Negativos:" + negatives);
        System.out.println("Ceros:" + zeros);
        
    }
    
}
