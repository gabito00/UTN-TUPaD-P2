/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer1;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class TP5EJER1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte;
        pasaporte = new Pasaporte("AB123456", LocalDate.of(2023, 1, 1), "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println(pasaporte);
    }
    
}
