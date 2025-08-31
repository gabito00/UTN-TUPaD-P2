/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2ejer3;

import java.util.Scanner;

/**
 *
 * Clasificación de Edad.
 * Escribe un programa en Java que solicite al usuario su edad y clasifique su
 * etapa de vida según la siguiente tabla:
 * Menor de 12 años: "Niño"
 * Entre 12 y 17 años: "Adolescente"
 * Entre 18 y 59 años: "Adulto"
 * 60 años o más: "Adulto mayor"
 * Ejemplo de entrada/salida:
 * Ingrese su edad: 25
 * Eres un Adulto.
 * Ingrese su edad: 10
 * Eres un Niño
 * @author Gabriel
 */
public class TP2EJER3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Ingrese su edad: ");
        age = Integer.parseInt(sc.nextLine());
        if (age > 0 && age <= 12)
            System.out.println("Eres un Niño");
        else if (age > 12 && age <= 17)
            System.out.println("Eres un Adolescente!");
        else if (age >= 18 && age <= 58)
            System.out.println("Eres un Adulto!");
        else if (age >= 60)
            System.out.println("Eres un Adulto mayor!");
        else
            System.out.println("No te puedo clasificar porque ingresaste un valor que no es una edad");
    }
    
}
