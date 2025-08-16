/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1e5;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TP1E5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma, resta, multi;
        double division;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());
        
        //Operaciones
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;
        division = num1 / (double) num2;
        
        System.out.println("El resultado de " + num1 + "+" + num2 + "=" + suma);
        
        System.out.println("El resultado de " + num1 + "-" + num2 + "=" + resta);
        
        System.out.println("El resultado de " + num1 + "*" + num2 + "=" + multi);
        
        System.out.println("El resultado de " + num1 + "/" + num2 + "=" + division);
        
    }
    
}
