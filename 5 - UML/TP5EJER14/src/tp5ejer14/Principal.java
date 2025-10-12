/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejer14;

/**
 *
 * @author Gabriel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // === Crear proyectos ===
        Proyecto p1 = new Proyecto("Corto publicitario", 90);
        Proyecto p2 = new Proyecto("Videoclip", 210);

        // === Crear render y vincular al proyecto p1 ===
        Render r1 = new Render("MP4", p1);

        // === Editor ===
        EditorVideo editor = new EditorVideo();

        System.out.println("=== Estado inicial ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(r1);

        // Cambiar propiedades del proyecto p1
        p1.setNombre("Corto publicitario (Director's Cut)");
        p1.setDuracionMin(95);

        // Cambiar formato del render y reasignar el proyecto al p2
        r1.setFormato("MKV");
        r1.setProyecto(p2);

        // Actualizar datos del proyecto p2
        p2.setDuracionMin(205);

        System.out.println("\n=== Después de cambios ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(r1);

        // Usar el editor para exportar
        System.out.println("\n=== Exportaciones ===");
        editor.exportar("MOV", p1);
        editor.exportar("WEBM", p2);
    }
    
}
