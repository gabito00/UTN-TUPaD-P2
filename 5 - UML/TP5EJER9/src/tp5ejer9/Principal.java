/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer9;

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
        // === Pacientes ===
        Paciente p1 = new Paciente("Ana Gómez", "OSDE");
        Paciente p2 = new Paciente("Carlos Pérez", "Swiss Medical");

        // === Profesionales ===
        Profesional prof1 = new Profesional("Dra. López", "Clínica Médica");
        Profesional prof2 = new Profesional("Dr. Martínez", "Cardiología");

        // === Citas (constructor: fecha, hora) ===
        CitaMedica c1 = new CitaMedica(LocalDate.of(2025, 10, 5), "09:30");
        CitaMedica c2 = new CitaMedica(LocalDate.of(2025, 10, 6), "11:15");

        // Vincular usando setters (paciente / profesional)
        c1.setPaciente(p1);
        c1.setProfesional(prof1);

        c2.setPaciente(p2);
        c2.setProfesional(prof2);

        // --- Estado inicial ---
        System.out.println("=== Estado inicial ===");
        System.out.println(c1);
        System.out.println(c2);

        // --- Jugar con setters y volver a imprimir ---
        // Cambiar hora y profesional de c1
        c1.setHora("10:00");
        c1.setProfesional(prof2);

        // Actualizar datos del paciente p2 (se refleja en c2)
        p2.setObraSocial("Galeno");
        p2.setNombre("Carlos A. Pérez");

        // Reprogramar c2
        c2.setFecha(LocalDate.of(2025, 10, 8));
        c2.setHora("08:45");

        System.out.println("\n=== Después de cambios ===");
        System.out.println(c1);
        System.out.println(c2);

        // Mostrar también objetos individuales
        System.out.println("\n=== Objetos individuales ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(prof1);
        System.out.println(prof2);
    }
    
}
