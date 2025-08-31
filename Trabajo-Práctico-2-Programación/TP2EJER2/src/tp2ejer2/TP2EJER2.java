/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer2;

import java.util.Scanner;

/**
 *Determinar el Mayor de Tres Números.
 *Escribe un programa en Java que pida al usuario tres números enteros y
 *determine cuál es el mayor.
 *Ejemplo de entrada/salida:
 *Ingrese el primer número: 8
 *Ingrese el segundo número: 12
 *Ingrese el tercer número: 5
 *El mayor es: 12
 * @author Gabriel
 */
public class TP2EJER2 {

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        number1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        number2 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el tercer numero: ");
        number3 = Integer.parseInt(sc.nextLine());
        System.out.println("El mayor es: " + getGreater(number1, number2, number3));
    }
    
    private static int getGreater(int a, int b, int c){
        if (a >= b && a >= c) return a; 
        else if (b >= a && b >= c) return b; 
        else return c;
    }
    
}
