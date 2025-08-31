/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer7;

import java.util.Scanner;

/**
 *
 * Validación de Nota entre 0 y 10 (do-while).
 * Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
 * usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
 * hasta que ingrese un valor válido.
 * Ejemplo de entrada/salida:
 * Ingrese una nota (0-10): 15
 * Error: Nota inválida. Ingrese una nota entre 0 y 10.
 * Ingrese una nota (0-10): -2
 * Error: Nota inválida. Ingrese una nota entre 0 y 10.
 * Ingrese una nota (0-10): 8
 * Nota guardada correctamente.
 * 
 * @author Gabriel
 */
public class TP2EJER7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota:");
            nota = Integer.parseInt(sc.nextLine());
        } while (!isValid(nota));
        System.out.println("Nota guardada gorrectamente!");
    }
    
    private static boolean isValid(int nota){
        if(nota>0 && nota <= 10)
            return true;
        else
        {
            System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            return false;
        }
            
    }
    
}
