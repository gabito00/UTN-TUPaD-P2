/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer13;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // === Crear usuarios ===
        Usuario u1 = new Usuario("Ana Gómez", "ana@example.com");
        Usuario u2 = new Usuario("Carlos Pérez", "carlos@example.com");

        // === Crear Código QR y vincular a un usuario ===
        CodigoQR qr1 = new CodigoQR("QR-001-ABC", u1);

        // === Generador ===
        GeneradorQR gen = new GeneradorQR();

        // --- Estado inicial ---
        System.out.println("=== Estado inicial ===");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(qr1);

        // 1) Actualizar datos del usuario u1
        u1.setNombre("Ana V. Gómez");
        u1.setEmail("ana.gomez@empresa.com");

        // 2) Cambiar valor del QR
        qr1.setValor("QR-001-ABC-REV2");

        // 3) Reasignar el usuario del QR a u2
        qr1.setUsuario(u2);

        // --- Estado tras cambios ---
        System.out.println("\n=== Después de cambios (getters/setters) ===");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(qr1);

        // 4) Usar GeneradorQR para crear/mostrar otro QR
        System.out.println("\n=== Generador genera un QR para Ana ===");
        gen.generar("QR-NEW-XYZ", u1);
    }
    
}
