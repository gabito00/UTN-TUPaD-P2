/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1e4;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TP1E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Hola " + nombre + "usted tiene " + edad + " años");
    }
    
}
