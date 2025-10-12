/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer6;

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
        // 1) Crear clientes (constructor con nombre y dni)
        Cliente c1 = new Cliente("Ana Gómez", "87654321");
        Cliente c2 = new Cliente("Carlos Pérez", "22334455");

        // 2) Crear mesas (numero, capacidad)
        Mesa m1 = new Mesa(3, 5);
        Mesa m2 = new Mesa(5, 6);

        // 3) Crear reservas (fecha, hora) y setear cliente/mesa por setters
        Reserva r1 = new Reserva(LocalDate.of(2025, 10, 5), "20:30", m1);
        r1.setCliente(c1);
        r1.setMesa(m1);

        Reserva r2 = new Reserva(LocalDate.of(2025, 10, 6), "21:00", m2);
        r2.setCliente(c2);
        r2.setMesa(m2);

        // --- Mostrar todo con GETTERS (sin hardcode) ---
        System.out.println("=== Reservas ===");
        System.out.println(r1.toString());
        System.out.println(r2.toString());

        // --- “Jugar” con SETTERS: actualizar y volver a leer con GETTERS ---
        r1.setHora("21:30");            // cambio de hora
        m1.setCapacidad(4);             // cambio de capacidad de mesa
        c1.setNombre("Ana V. Gómez");   // cambio de nombre

        System.out.println("\n=== Después de actualizar con SETTERS ===");
        System.out.println(r1.toString());

        // Otro ejemplo: mover r2 a otra mesa y cambiarle la fecha
        r2.setMesa(m1);
        r2.setFecha(LocalDate.of(2025, 10, 7));
        System.out.println();
        System.out.println(r2.toString());
    }
    
}
