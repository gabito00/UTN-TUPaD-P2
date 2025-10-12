/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer8;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ===== Usuarios (agregación) =====
        Usuario u1 = new Usuario("Ana Gómez", "ana@example.com");
        Usuario u2 = new Usuario("Carlos Pérez", "carlos@example.com");

        // ===== Documentos (composición: si tu Documento crea la firma en su constructor, mejor) =====
        Documento d1 = new Documento("Contrato de Servicio", "Contenido del contrato...", "HASH-001", LocalDate.of(2025, 10, 1), u1);

        Documento d2 = new Documento("Acuerdo de Confidencialidad", "Contenido del NDA...","HASH-001-REV2", LocalDate.of(2025, 10, 3), u2);

        System.out.println("\n=== d1 firmado por Ana ===");
        System.out.println(d1);

        // ===== Cambiar datos del usuario (agregación se refleja) =====
        u1.setEmail("ana.gomez@empresa.com");
        System.out.println("\n=== d1 reflejando cambio de email de Ana ===");
        System.out.println(d1);

        // ===== Reasignar usuario de la firma (agregación) =====
        d1.getFirmaDigital().setUsuario(u2);
        System.out.println("\n=== d1 ahora firmado por Carlos ===");
        System.out.println(d1);

        System.out.println("\n=== d2 ===");
        System.out.println(d2);

        // ===== Mostrar también objetos individuales (usan su propio toString) =====
        System.out.println("\n=== Objetos individuales ===");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(d1.getFirmaDigital());
        System.out.println(d2.getFirmaDigital());
    }
    
}
