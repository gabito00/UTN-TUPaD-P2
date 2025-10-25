/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();
            
            ValidadorEdad.validarEdad(edad);
            
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida.");
        } finally {
            scanner.close();
        }
        String nombreArchivo = "datos.txt";
        
        // Try-with-resources cierra automáticamente el BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Leyendo archivo con try-with-resources:");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(">>> " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
    
}
