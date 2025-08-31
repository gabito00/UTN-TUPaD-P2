/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer5;

import java.util.Scanner;

/**
 *
 * Escribe un programa que solicite números al usuario y sume solo los
 * números pares. El ciclo debe continuar hasta que el usuario ingrese el número
 * 0, momento en el que se debe mostrar la suma total de los pares ingresados.
 * Ejemplo de entrada/salida:
 * Ingrese un número (0 para terminar): 4
 * Ingrese un número (0 para terminar): 7
 * Ingrese un número (0 para terminar): 2
 * Ingrese un número (0 para terminar): 0
 * La suma de los números pares es: 6
 * @author Gabriel
 */
public class TP2EJER5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.MAX_VALUE, suma=0;
        while(number!=0){
            System.out.print("Ingrese un numero: ");
            number = Integer.parseInt(sc.nextLine());
            if(number % 2 == 0)
                suma += number;
        }
        System.out.println("La suma de los números pares es:" + suma);
    }
    
}
