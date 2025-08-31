/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer1;

import java.util.Scanner;

/**
 * Escribe un programa en Java que solicite al usuario un año y determine si es
 *bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
 *divisible por 400.
 *Ejemplo de entrada/salida:
 *Ingrese un año: 2024
 *El año 2024 es bisiesto.
 *Ingrese un año: 1900
 *El año 1900 no es bisiesto.
 * @author Gabriel
 */
public class TP2EJER1 {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        year = sc.nextInt();
        if(isLeapYear(year))
            System.out.println("El año " + year + " es bisiesto");
        else
            System.out.println("El año " + year + " no es bisiesto");
    }
    
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
}
